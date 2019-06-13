/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFSeasonMapper;
import com.alexmillerning.pojo.WFSeason;
import com.alexmillerning.pojo.WFSeasonExample;
import com.alexmillerning.service.SeasonService;
import com.alexmillerning.utils.ResultToSeasonTable;
import com.alexmillerning.utils.pojo.design.Season.SeasonfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class SeasonServiceImpl implements SeasonService {
    static final Logger logger = Logger.getLogger(SeasonServiceImpl.class);
    @Autowired
    WFSeasonMapper wfSeasonMapper;
    @Override
    public SeasonfTable getSeason(int draw, int currentPage, int pageSize, String searchParam) {
        WFSeasonExample wfSeasonExample = new WFSeasonExample();
        WFSeasonExample.Criteria criteria = wfSeasonExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))){
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字[" + searchParam + "],根据季节ID查询工艺信息");
                }
                criteria.andSeasonIdEqualTo(Integer.parseInt(searchParam));
                List<WFSeason> wfSeasonList = wfSeasonMapper.selectByExample(wfSeasonExample);
                int recordsTotal = wfSeasonList.size();
                int recordsFiltered = wfSeasonList.size();
                return ResultToSeasonTable.convert(wfSeasonList, draw, recordsTotal, recordsFiltered);
            }else{
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为字符串[" + searchParam + "],根据季节名称查询品牌信息");
                }
                criteria.andSeasonNameEqualTo(searchParam);
                List<WFSeason> wfSeasonList = wfSeasonMapper.selectByExample(wfSeasonExample);
                int recordsTotal = wfSeasonList.size();
                int recordsFiltered = wfSeasonList.size();
                return ResultToSeasonTable.convert(wfSeasonList, draw, recordsTotal, recordsFiltered);
            }
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询季节");
            }
            int recordsTotal = getSeasonCount();
            int  recordsFiltered = getSeasonCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFSeason> wfSeasonList = wfSeasonMapper.selectByExample(wfSeasonExample);
            return ResultToSeasonTable.convert(wfSeasonList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    public int deleteSeason(int seasonId) {
        if(logger.isDebugEnabled()){
            logger.debug("根据季节编号["+seasonId+"]删除工艺");
        }
        return wfSeasonMapper.deleteByPrimaryKey(seasonId);
    }

    @Override
    public int addSeason(String seasonName) {
        if(logger.isDebugEnabled()){
            logger.debug("新增季节 seasonName:["+seasonName+"]");
        }
        WFSeason wfSeason = new WFSeason();
        wfSeason.setSeasonName(seasonName);
        return wfSeasonMapper.insert(wfSeason);
    }

    @Override
    public int editSeason(int seasonId, String seasonName) {
        if(logger.isDebugEnabled()){
            logger.debug("更新季节 seasonId:["+seasonId+"seasonName:["+seasonName+"]");
        }
        WFSeason wfSeason = new WFSeason();
        wfSeason.setSeasonId(seasonId);
        wfSeason.setSeasonName(seasonName);
        WFSeasonExample wfSeasonExample = new WFSeasonExample();
        WFSeasonExample.Criteria criteria = wfSeasonExample.createCriteria();
        criteria.andSeasonIdEqualTo(wfSeason.getSeasonId());
        return wfSeasonMapper.updateByExample(wfSeason, wfSeasonExample);
    }

    @Override
    public int getSeasonCount() {
        WFSeasonExample wfSeasonExample = new WFSeasonExample();
        return wfSeasonMapper.countByExample(wfSeasonExample);
    }
}
