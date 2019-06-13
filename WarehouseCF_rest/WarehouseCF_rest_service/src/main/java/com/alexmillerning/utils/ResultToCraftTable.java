/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFCraft;
import com.alexmillerning.utils.pojo.design.craft.CraftfTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToCraftTable {
    public static CraftfTable convert(List<WFCraft> wfCraftList, int draw, int recordsTotal, int recordsFiltered){
        CraftfTable craftfTable = new CraftfTable();
        List<CraftfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFCraft wfCraft : wfCraftList){
            CraftfTable.DataBean dataBean = new CraftfTable.DataBean();
            dataBean.setCraftId(wfCraft.getCraftId());
            dataBean.setCraftName(wfCraft.getCraftName());
            dataBean.setCraftDes(wfCraft.getCraftDes());
            dataBeanList.add(dataBean);
        }
        craftfTable.setDraw(draw);
        craftfTable.setRecordsFiltered(recordsFiltered);
        craftfTable.setRecordsTotal(recordsTotal);
        craftfTable.setData(dataBeanList);
        return craftfTable;
    }
}
