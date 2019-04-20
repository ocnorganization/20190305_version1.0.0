/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.service.impl;

import com.alexmillerning.mapper.WFColorBranchMapper;
import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.pojo.WFColorBranchExample;
import com.alexmillerning.portal.service.WFColorBranchService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
/**
 * @name WFColorBranchServiceImpl
 * @author Alex
 * @date 2019/4/12
 * @description 颜色子类数据库查询实现类
 */
public class WFColorBranchServiceImpl implements WFColorBranchService {
    @Autowired
    WFColorBranchMapper wfColorBranchMapper;
    @Override
    /**
     * @methodname getColorBranch
     * @author Alex
     * @date 2019/4/12
     * @param []
     * @return java.util.List<com.alexmillerning.pojo.WFColorBranch>
     * @description 数据库查询所有子类颜色
     */
    public List<WFColorBranch> getColorBranch() {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByExample(wfColorBranchExample);
        return wfColorBranchList;
    }

    @Override
    /**
     * @methodname getColorBranch
     * @author Alex
     * @date 2019/4/12
     * @param [colorId]
     * @return java.util.List<com.alexmillerning.pojo.WFColorBranch>
     * @description 数据库根据颜色编号分页查询颜色子类
     */
    public List<WFColorBranch> getColorBranch(String colorId,Integer offSet,Integer limit) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        wfColorBranchExample.setOffset(offSet);
        wfColorBranchExample.setLimit(limit);
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        criteria.andColorBranchParentEqualTo(colorId);
//        List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByExampleandPage(wfColorBranchExample);
        List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
        return wfColorBranchList;
    }
    @Override
    /**
     * @methodname getColorBranchbyPage
     * @author Alex
     * @date 2019/4/12
     * @param [offSet, limit]
     * @return java.util.List<com.alexmillerning.pojo.WFColorBranch>
     * @description 数据库分页查询颜色子类
     */
    public List<WFColorBranch> getColorBranchbyPage(Integer offSet, Integer limit) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        wfColorBranchExample.setOffset(offSet);
        wfColorBranchExample.setLimit(limit);
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        List<WFColorBranch> wfColorBranchList = wfColorBranchMapper.selectByUnion(wfColorBranchExample);
        return wfColorBranchList;
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
    public int getColorBranchCount() {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        int count = wfColorBranchMapper.countByExample(wfColorBranchExample);
        return count;
    }
    @Override
    /**
     * @methodname getColorBranchCountbyPid
     * @author Alex
     * @date 2019/4/17
     * @param [colorId]
     * @return int
     * @description 数据库查询颜色父类数量
     */
    public int getColorBranchCountbyPid(String colorId) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        criteria.andColorBranchParentEqualTo(colorId);
        int count = wfColorBranchMapper.countByExample(wfColorBranchExample);
        return count;
    }

    @Override
    /**
     * @methodname updateColorBranch
     * @author Alex
     * @date 2019/4/17
     * @param []
     * @return void
     * @description 数据库更新子类颜色
     */
    public int updateColorBranch(WFColorBranch wfColorBranch) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        criteria.andColorBranchIdEqualTo(wfColorBranch.getColorBranchId());
        return wfColorBranchMapper.updateByExampleSelective(wfColorBranch,wfColorBranchExample);
    }

    @Override
    /**
     * @methodname searchColorBranch
     * @author Alex
     * @date 2019/4/18
     * @param [searchParam, offSet, limit]
     * @return java.util.List<com.alexmillerning.pojo.WFColorBranch>
     * @description 根据参数查询颜色信息
     */
    public List<WFColorBranch> searchColorBranch(String searchParam,Integer offSet,Integer limit) {
        WFColorBranchExample wfColorBranchExample = new WFColorBranchExample();
        WFColorBranchExample.Criteria criteria = wfColorBranchExample.createCriteria();
        Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
        if(pattern.matcher(searchParam).matches()){
            criteria.andColorBranchIdEqualTo(Integer.parseInt(searchParam));
        }else{
            criteria.andColorBranchNameEqualTo(searchParam);
        }
        return wfColorBranchMapper.selectByUnion(wfColorBranchExample);
    }

    @Override
    /**
     * @methodname deleteColorBranchbyId
     * @author Alex
     * @date 2019/4/19
     * @param [colorBranchId]
     * @return int
     * @description 根据颜色编号删除颜色信息
     */
    public int deleteColorBranchbyId(Integer colorBranchId) {
        return wfColorBranchMapper.deleteByPrimaryKey(colorBranchId);
    }

    @Override
    public int insertColorBranch(WFColorBranch wfColorBranch) {
        return wfColorBranchMapper.insertSelective(wfColorBranch);
    }
}
