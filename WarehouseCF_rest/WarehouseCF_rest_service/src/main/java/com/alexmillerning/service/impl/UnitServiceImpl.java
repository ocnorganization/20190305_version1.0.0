/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFUnitMapper;
import com.alexmillerning.pojo.WFUnit;
import com.alexmillerning.pojo.WFUnitExample;
import com.alexmillerning.service.UnitService;
import com.alexmillerning.utils.ResultToUnitTable;
import com.alexmillerning.utils.pojo.design.unit.UnitfTable;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;
@Service
public class UnitServiceImpl implements UnitService {
    static final Logger logger = Logger.getLogger(UnitServiceImpl.class);
    @Autowired
    WFUnitMapper wfUnitMapper;
    @Override
    public UnitfTable getUnit(int draw, int currentPage, int pageSize, String searchParam) {
        WFUnitExample wfUnitExample = new WFUnitExample();
        WFUnitExample.Criteria criteria = wfUnitExample.createCriteria();
        if(null != searchParam&&!("".equals(searchParam))){
            Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
            if(pattern.matcher(searchParam).matches()){
                if(logger.isDebugEnabled()){
                    logger.debug("查询参数匹配为数字[" + searchParam + "],根据单位ID查询工艺信息");
                }
                criteria.andUnitIdEqualTo(Integer.parseInt(searchParam));
                List<WFUnit> wfUnitList = wfUnitMapper.selectByExample(wfUnitExample);
                int recordsTotal = wfUnitList.size();
                int recordsFiltered = wfUnitList.size();
                return ResultToUnitTable.convert(wfUnitList, draw, recordsTotal, recordsFiltered);
            }else{
                if (logger.isDebugEnabled()) {
                    logger.debug("查询参数匹配为字符串[" + searchParam + "],根据单位名称查询品牌信息");
                }
                criteria.andUnitNameEqualTo(searchParam);
                List<WFUnit> wfUnitList = wfUnitMapper.selectByExample(wfUnitExample);
                int recordsTotal = wfUnitList.size();
                int recordsFiltered = wfUnitList.size();
                return ResultToUnitTable.convert(wfUnitList, draw, recordsTotal, recordsFiltered);
            }
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("分页查询单位");
            }
            int recordsTotal = getUnitCount();
            int  recordsFiltered = getUnitCount();
            PageHelper.startPage(currentPage, pageSize);
            List<WFUnit> wfUnitList = wfUnitMapper.selectByExample(wfUnitExample);
            return ResultToUnitTable.convert(wfUnitList, draw, recordsTotal, recordsFiltered);
        }
    }

    @Override
    public int deleteUnit(int unitId) {
        if(logger.isDebugEnabled()){
            logger.debug("根据单位编号["+unitId+"]删除工艺");
        }
        return wfUnitMapper.deleteByPrimaryKey(unitId);
    }

    @Override
    public int addUnit(String unitName, String unitDes) {
        if(logger.isDebugEnabled()){
            logger.debug("新增单位 unitName:["+unitName+"]");
        }
        WFUnit wfUnit = new WFUnit();
        wfUnit.setUnitName(unitName);
        wfUnit.setUnitDes(unitDes);
        return wfUnitMapper.insert(wfUnit);
    }

    @Override
    public int editUnit(int unitId, String unitName, String unitDes) {
        if(logger.isDebugEnabled()){
            logger.debug("更新单位 unitId:["+unitId+"unitName:["+unitName+"] unitName:["+unitDes+"]");
        }
        WFUnit wfUnit = new WFUnit();
        wfUnit.setUnitId(unitId);
        wfUnit.setUnitName(unitName);
        wfUnit.setUnitDes(unitDes);
        WFUnitExample wfUnitExample = new WFUnitExample();
        WFUnitExample.Criteria criteria = wfUnitExample.createCriteria();
        criteria.andUnitIdEqualTo(wfUnit.getUnitId());
        return wfUnitMapper.updateByExample(wfUnit, wfUnitExample);
    }

    @Override
    public int getUnitCount() {
        WFUnitExample wfUnitExample = new WFUnitExample();
        return wfUnitMapper.countByExample(wfUnitExample);
    }
}
