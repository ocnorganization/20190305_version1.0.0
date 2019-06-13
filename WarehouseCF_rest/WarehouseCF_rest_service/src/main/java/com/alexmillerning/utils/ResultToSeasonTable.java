/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFSeason;
import com.alexmillerning.utils.pojo.design.Season.SeasonfTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToSeasonTable {
    public static SeasonfTable convert(List<WFSeason> wfSeasonList, int draw, int recordsTotal, int recordsFiltered){
        SeasonfTable seasonfTable = new SeasonfTable();
        List<SeasonfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFSeason wfSeason : wfSeasonList){
            SeasonfTable.DataBean dataBean = new SeasonfTable.DataBean();
            dataBean.setSeasonId(wfSeason.getSeasonId());
            dataBean.setSeasonName(wfSeason.getSeasonName());
            dataBeanList.add(dataBean);
        }
        seasonfTable.setDraw(draw);
        seasonfTable.setRecordsFiltered(recordsFiltered);
        seasonfTable.setRecordsTotal(recordsTotal);
        seasonfTable.setData(dataBeanList);
        return seasonfTable;
    }
}
