/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFCraftMapper;
import com.alexmillerning.pojo.WFCraft;
import com.alexmillerning.pojo.WFCraftExample;
import com.alexmillerning.service.CraftService;
import com.alexmillerning.utils.ResultToCraftTable;
import com.alexmillerning.utils.pojo.design.craft.CraftfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;
@Service
public class CraftServiceImpl implements CraftService {
    static final Logger logger = Logger.getLogger(CraftServiceImpl.class);
    @Autowired
    WFCraftMapper wfCraftMapper;
    @Override
    public CraftfTable getCraft(int draw, int currentPage, int pageSize, String searchParam) {
        WFCraftExample wfCraftExample = new WFCraftExample();
        WFCraftExample.Criteria criteria = wfCraftExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))){
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字[" + searchParam + "],根据工艺ID查询工艺信息");
                }
                criteria.andCraftIdEqualTo(Integer.parseInt(searchParam));
                List<WFCraft> wfCraftList = wfCraftMapper.selectByExample(wfCraftExample);
                int recordsTotal = wfCraftList.size();
                int recordsFiltered = wfCraftList.size();
                return ResultToCraftTable.convert(wfCraftList, draw, recordsTotal, recordsFiltered);
            }else{
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为字符串[" + searchParam + "],根据工艺名称查询品牌信息");
                }
                criteria.andCraftNameEqualTo(searchParam);
                List<WFCraft> wfCraftList = wfCraftMapper.selectByExample(wfCraftExample);
                int recordsTotal = wfCraftList.size();
                int recordsFiltered = wfCraftList.size();
                return ResultToCraftTable.convert(wfCraftList, draw, recordsTotal, recordsFiltered);
            }
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询工艺");
            }
            int recordsTotal = getCraftCount();
            int  recordsFiltered = getCraftCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFCraft> wfCraftList = wfCraftMapper.selectByExample(wfCraftExample);
            return ResultToCraftTable.convert(wfCraftList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    public int deleteCraft(int craftId) {
        if(logger.isDebugEnabled()){
            logger.debug("根据工艺编号["+craftId+"]删除工艺");
        }
        return wfCraftMapper.deleteByPrimaryKey(craftId);
    }

    @Override
    public int addCraft(String craftName, String craftDes) {
        if(logger.isDebugEnabled()){
            logger.debug("新增工艺 craftName:["+craftName+"] craftDes:["+craftDes+"]");
        }
        WFCraft wfCraft = new WFCraft();
        wfCraft.setCraftName(craftName);
        wfCraft.setCraftDes(craftDes);
        return wfCraftMapper.insert(wfCraft);
    }

    @Override
    public int editCraft(int craftId, String craftName, String craftDes) {
        if(logger.isDebugEnabled()){
            logger.debug("更新工艺 craftId:["+craftId+"craftName:["+craftName+"] craftDes:["+craftDes+"]");
        }
        WFCraft wfCraft = new WFCraft();
        wfCraft.setCraftId(craftId);
        wfCraft.setCraftName(craftName);
        wfCraft.setCraftDes(craftDes);
        WFCraftExample wfCraftExample = new WFCraftExample();
        WFCraftExample.Criteria criteria = wfCraftExample.createCriteria();
        criteria.andCraftIdEqualTo(wfCraft.getCraftId());
        return wfCraftMapper.updateByExampleSelective(wfCraft, wfCraftExample);
    }

    @Override
    public int getCraftCount() {
        WFCraftExample wfCraftExample = new WFCraftExample();
        return wfCraftMapper.countByExample(wfCraftExample);
    }
}
