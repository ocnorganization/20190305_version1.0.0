/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFSizeBranchMapper;
import com.alexmillerning.pojo.WFSizeBranch;
import com.alexmillerning.pojo.WFSizeBranchExample;
import com.alexmillerning.service.BranchSizeService;
import com.alexmillerning.utils.ResultToBrunchSizeTalble;
import com.alexmillerning.utils.pojo.design.size.BranchSizefTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class BranchSizeServiceImpl implements BranchSizeService {
    static final Logger logger = Logger.getLogger(BranchSizeServiceImpl.class);
    @Autowired
    WFSizeBranchMapper wfSizeBranchMapper;
    @Override
    public BranchSizefTable getBranchSize(String sizePid, int draw, int currentPage, int pageSize, String searchParam) {
        WFSizeBranchExample wfSizeBranchExample = new WFSizeBranchExample();
        WFSizeBranchExample.Criteria criteria = wfSizeBranchExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))) {
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字["+searchParam+"],根据尺寸ID查询尺寸子类");
                }
                criteria.andSizeBranchIdEqualTo(Integer.parseInt(searchParam));
                List<WFSizeBranch> wfSizeBranchList = wfSizeBranchMapper.selectByUnion(wfSizeBranchExample);
                //total数量问题
                int recordsTotal = wfSizeBranchList.size();
                int recordsFiltered = wfSizeBranchList.size();
                return ResultToBrunchSizeTalble.convert(wfSizeBranchList, draw, recordsTotal, recordsFiltered);

            }else{
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为字符串["+searchParam+"],根据尺寸名称查询尺寸子类");
                }
                criteria.andSizeBranchNameEqualTo(searchParam);
                List<WFSizeBranch> wfSizeBranchList = wfSizeBranchMapper.selectByUnion(wfSizeBranchExample);
                //total数量问题
                int recordsTotal = wfSizeBranchList.size();
                int recordsFiltered = wfSizeBranchList.size();
                return ResultToBrunchSizeTalble.convert(wfSizeBranchList, draw, recordsTotal, recordsFiltered);
            }
        }else if(null != sizePid&&!("".equals(sizePid))){
            if(logger.isDebugEnabled()){
                logger.debug("根据父类尺寸编号["+sizePid+"]查询尺寸子类");
            }
            int recordsTotal = getBranchSizeCount();
            int recordsFiltered = getBranchSizeCountbyPid(sizePid);
            criteria.andSizeBranchParentEqualTo(Integer.parseInt(sizePid));
            PageHelper.startPage(currentPage, pageSize);
            List<WFSizeBranch> wfSizeBranchList = wfSizeBranchMapper.selectByUnion(wfSizeBranchExample);
            return ResultToBrunchSizeTalble.convert(wfSizeBranchList, draw, recordsTotal, recordsFiltered);
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询颜色子类");
            }
            int recordsTotal = getBranchSizeCount();
            int recordsFiltered = getBranchSizeCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFSizeBranch> wfSizeBranchList = wfSizeBranchMapper.selectByUnion(wfSizeBranchExample);
            return ResultToBrunchSizeTalble.convert(wfSizeBranchList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    public int getBranchSizeCount() {
        WFSizeBranchExample wfSizeBranchExample = new WFSizeBranchExample();
        return wfSizeBranchMapper.countByExample(wfSizeBranchExample);
    }

    @Override
    public int getBranchSizeCountbyPid(String sizePid) {
        WFSizeBranchExample wfSizeBranchExample = new WFSizeBranchExample();
        WFSizeBranchExample.Criteria criteria = wfSizeBranchExample.createCriteria();
        criteria.andSizeBranchRemarkEqualTo(Integer.parseInt(sizePid));
        return wfSizeBranchMapper.countByExample(wfSizeBranchExample);
    }

    @Override
    public int deleteBranchSizeById(int Id) {
        return wfSizeBranchMapper.deleteByPrimaryKey(Id);
    }

    @Override
    public int addBranchSize(int sizePid, String branchSizeName) {
        WFSizeBranch wfSizeBranch = new WFSizeBranch();
        wfSizeBranch.setSizeBranchName(branchSizeName);
        wfSizeBranch.setSizeBranchParent(sizePid);
        return wfSizeBranchMapper.insert(wfSizeBranch);
    }

    @Override
    public int editBranchSize(int branchSizeId, String branchSizeName, String sizeName) {
        WFSizeBranch wfSizeBranch = new WFSizeBranch();
        wfSizeBranch.setSizeBranchId(branchSizeId);
        wfSizeBranch.setSizeBranchName(branchSizeName);
        if(null != sizeName&&!("".equals(sizeName))){
//        if(sizeName != 0){
            wfSizeBranch.setSizeBranchParent(Integer.parseInt(sizeName));
        }
        WFSizeBranchExample wfSizeBranchExample = new WFSizeBranchExample();
        WFSizeBranchExample.Criteria criteria = wfSizeBranchExample.createCriteria();
        criteria.andSizeBranchIdEqualTo(wfSizeBranch.getSizeBranchId());
        return wfSizeBranchMapper.updateByExampleSelective(wfSizeBranch, wfSizeBranchExample);
    }
}
