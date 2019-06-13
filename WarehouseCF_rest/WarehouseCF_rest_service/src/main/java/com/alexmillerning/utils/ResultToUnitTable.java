/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFUnit;
import com.alexmillerning.utils.pojo.design.unit.UnitfTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToUnitTable {
    public static UnitfTable convert(List<WFUnit> wfUnitList, int draw, int recordsTotal, int recordsFiltered){
        UnitfTable unitfTable = new UnitfTable();
        List<UnitfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFUnit wfUnit : wfUnitList){
            UnitfTable.DataBean dataBean = new UnitfTable.DataBean();
            dataBean.setUnitId(wfUnit.getUnitId());
            dataBean.setUnitName(wfUnit.getUnitName());
            dataBean.setUnitDes(wfUnit.getUnitDes());
            dataBeanList.add(dataBean);
        }
        unitfTable.setDraw(draw);
        unitfTable.setRecordsFiltered(recordsFiltered);
        unitfTable.setRecordsTotal(recordsTotal);
        unitfTable.setData(dataBeanList);
        return unitfTable;
    }
}
