/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFPartMapper;
import com.alexmillerning.pojo.WFPart;
import com.alexmillerning.pojo.WFPartExample;
import com.alexmillerning.service.PartService;
import com.alexmillerning.utils.ResultToPartTable;
import com.alexmillerning.utils.pojo.design.part.PartfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;
@Service
public class PartServiceImpl implements PartService {
    static final Logger logger = Logger.getLogger(PartServiceImpl.class);
    @Autowired
    WFPartMapper wfPartMapper;
    @Override
    public PartfTable getPart(int draw, int currentPage, int pageSize, String searchParam) {
        WFPartExample wfPartExample = new WFPartExample();
        WFPartExample.Criteria criteria = wfPartExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))){
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字[" + searchParam + "],根据部位ID查询部位信息");
                }
                criteria.andPartIdEqualTo(Integer.parseInt(searchParam));
                List<WFPart> wfPartList = wfPartMapper.selectByExample(wfPartExample);
                int recordsTotal = wfPartList.size();
                int recordsFiltered = wfPartList.size();
                return ResultToPartTable.convert(wfPartList, draw, recordsTotal, recordsFiltered);
            }else{
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为字符串[" + searchParam + "],根据部位名称查询品牌信息");
                }
                criteria.andPartNameEqualTo(searchParam);
                List<WFPart> wfPartList = wfPartMapper.selectByExample(wfPartExample);
                int recordsTotal = wfPartList.size();
                int recordsFiltered = wfPartList.size();
                return ResultToPartTable.convert(wfPartList, draw, recordsTotal, recordsFiltered);
            }
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询部位");
            }
            int recordsTotal = getPartCount();
            int  recordsFiltered = getPartCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFPart> wfPartList = wfPartMapper.selectByExample(wfPartExample);
            return ResultToPartTable.convert(wfPartList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    public int deletePart(int partId) {
        if(logger.isDebugEnabled()){
            logger.debug("根据部位编号["+partId+"]删除部位");
        }
        return wfPartMapper.deleteByPrimaryKey(partId);
    }

    @Override
    public int addPart(String partName, String partDes) {
        if(logger.isDebugEnabled()){
            logger.debug("新增部位 partName:["+partName+"] partDes:["+partDes+"]");
        }
        WFPart wfPart = new WFPart();
        wfPart.setPartName(partName);
        wfPart.setPartDes(partDes);
        return wfPartMapper.insert(wfPart);
    }

    @Override
    public int editPart(int partId, String partName, String partDes) {
        if(logger.isDebugEnabled()){
            logger.debug("更新部位 partId:["+partId+"partName:["+partName+"] partDes:["+partDes+"]");
        }
        WFPart wfPart = new WFPart();
        wfPart.setPartId(partId);
        wfPart.setPartName(partName);
        wfPart.setPartDes(partDes);
        WFPartExample wfPartExample = new WFPartExample();
        WFPartExample.Criteria criteria = wfPartExample.createCriteria();
        criteria.andPartIdEqualTo(wfPart.getPartId());
        return wfPartMapper.updateByExampleSelective(wfPart, wfPartExample);
    }

    @Override
    public int getPartCount() {
        WFPartExample wfPartExample = new WFPartExample();
        return wfPartMapper.countByExample(wfPartExample);
    }
}
