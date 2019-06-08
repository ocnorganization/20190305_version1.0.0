/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFColorBranchMapper;
import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.pojo.WFColorBranchExample;
import com.alexmillerning.service.BrunchColorService;
import com.alexmillerning.utils.ResultToBrunchColorTable;
import com.alexmillerning.utils.pojo.design.color.BrunchColorfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class BrunchColorServiceImpl implements BrunchColorService {
    static final Logger logger = Logger.getLogger(BrunchColorServiceImpl.class);
    @Autowired
    WFColorBranchMapper wfColorBranchMapper;

    /**
     *
     * @param colorPid
     * @param draw
     * @param currentPage
     * @param pageSize
     * @param searchParam
     * @return
     * @description 数据库子类颜色查询方法
     */
    @Override
    public BrunchColorfTable getBrunchColorByPage(String colorPid, int draw, int currentPage, int pageSize, String searchParam) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))) {
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字["+searchParam+"],根据颜色ID查询颜色子类");
                }
                criteria.andColorBranchIdEqualTo(Integer.parseInt(searchParam));
                List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
                int recordsTotal = getBrunchColorCount();
                int recordsFiltered = wfColorBranchList.size();
                return ResultToBrunchColorTable.convert(wfColorBranchList, draw, recordsTotal, recordsFiltered);

            }else{
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为字符串["+searchParam+"],根据颜色名称查询颜色子类");
                }
                criteria.andColorBranchNameEqualTo(searchParam);
                List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
                int recordsTotal = getBrunchColorCount();
                int recordsFiltered = wfColorBranchList.size();
                return ResultToBrunchColorTable.convert(wfColorBranchList, draw, recordsTotal, recordsFiltered);
            }
        }else if(null != colorPid&&!("".equals(colorPid))){
            if(logger.isDebugEnabled()){
                logger.debug("根据父类颜色编号["+colorPid+"]查询颜色子类");
            }
            int recordsTotal = getBrunchColorCount();
            int recordsFiltered = getBrunchColorCountbyPid(colorPid);
            criteria.andColorBranchParentEqualTo(colorPid);
            PageHelper.startPage(currentPage, pageSize);
            List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
            return ResultToBrunchColorTable.convert(wfColorBranchList, draw, recordsTotal, recordsFiltered);
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询颜色子类");
            }
            int recordsTotal = getBrunchColorCount();
            int recordsFiltered = getBrunchColorCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
            return ResultToBrunchColorTable.convert(wfColorBranchList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    /**
     * @methodname getColorBranchCount
     * @author Alex
     * @date 2019/4/12
     * @param []
     * @return int
     * @description 数据库查询颜色子类数量
     */
    public int getBrunchColorCount() {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        int count = wfColorBranchMapper.countByExample(wfColorBranchExample);
        return count;
    }
    @Override
    /**
     * @methodname getColorBranchCountbyPid
     * @author Alex
     * @date 2019/4/17
     * @param
     * @return int
     * @description 数据库查询颜色父类数量
     */
    public int getBrunchColorCountbyPid(String colorId) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        criteria.andColorBranchParentEqualTo(colorId);
        int count = wfColorBranchMapper.countByExample(wfColorBranchExample);
        return count;
    }

    @Override
    /**
     * @description 数据库按照子类颜色编号删除
     */
    public int deleteBrunchColorById(int Id) {
        return wfColorBranchMapper.deleteByPrimaryKey(Id);
    }

    /**
     * @param colorPid
     * @param colorName
     * @return
     * @description 数据库新增子类颜色
     */
    @Override
    public int addBrunchColor(String colorPid, String colorName) {
        WFColorBranch wfColorBranch = new WFColorBranch();
        wfColorBranch.setColorBranchName(colorName);
        wfColorBranch.setColorBranchParent(colorPid);
        return wfColorBranchMapper.insert(wfColorBranch);
    }

    /**
     *
     * @param colorBranchId
     * @param colorBranchName
     * @param colorName
     * @return
     * @description 数据库修改子类颜色
     */
    @Override
    public int editBrunchColor(int colorBranchId, String colorBranchName, String colorName) {
        WFColorBranch wfColorBranch = new WFColorBranch();
        wfColorBranch.setColorBranchId(colorBranchId);
        wfColorBranch.setColorBranchName(colorBranchName);
        if(colorName !=null&&colorName !=""){
            wfColorBranch.setColorBranchParent(colorName);
        }
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        criteria.andColorBranchIdEqualTo(wfColorBranch.getColorBranchId());
        return wfColorBranchMapper.updateByExampleSelective(wfColorBranch, wfColorBranchExample);
    }
}
