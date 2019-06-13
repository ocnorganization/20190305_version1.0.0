/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFPart;
import com.alexmillerning.utils.pojo.design.part.PartfTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToPartTable {
    public static PartfTable convert(List<WFPart> wfPartList, int draw, int recordsTotal, int recordsFiltered){
        PartfTable partfTable = new PartfTable();
        List<PartfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFPart wfPart : wfPartList){
            PartfTable.DataBean dataBean = new PartfTable.DataBean();
            dataBean.setPartId(wfPart.getPartId());
            dataBean.setPartName(wfPart.getPartName());
            dataBean.setPartDes(wfPart.getPartDes());
            dataBeanList.add(dataBean);
        }
        partfTable.setDraw(draw);
        partfTable.setRecordsFiltered(recordsFiltered);
        partfTable.setRecordsTotal(recordsTotal);
        partfTable.setData(dataBeanList);
        return partfTable;
    }
}
