/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.utils.pojo.design.color.BrunchColorfTable;

import java.util.ArrayList;
import java.util.List;

/**
 * @name ResultToBrunchColorTable
 * @author Alex
 * @date 2019/6/8
 * @description 将数据库查询得到的数据转换成页面表格数据对象
 */
public class ResultToBrunchColorTable {
    public static BrunchColorfTable convert(List<WFColorBranch> wfColorBranchList, int draw, int recordsTotal, int recordsFiltered){
        BrunchColorfTable brunchColorfTable = new BrunchColorfTable();
        List<BrunchColorfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFColorBranch wfColorBranch : wfColorBranchList){
            BrunchColorfTable.DataBean dataBean = new BrunchColorfTable.DataBean();
            BrunchColorfTable.DataBean.WbColorBean wbColorBean = new BrunchColorfTable.DataBean.WbColorBean();
            wbColorBean.setColorName(wfColorBranch.getWbColor().getColorName());
            dataBean.setColorBranchId(wfColorBranch.getColorBranchId());
            dataBean.setColorBranchName(wfColorBranch.getColorBranchName());
            dataBean.setWbColor(wbColorBean);
            dataBeanList.add(dataBean);
        }
        brunchColorfTable.setData(dataBeanList);
        brunchColorfTable.setDraw(draw);
        brunchColorfTable.setRecordsTotal(recordsTotal);
        brunchColorfTable.setRecordsFiltered(recordsFiltered);
        return brunchColorfTable;
    }
//    public static MessageToInterface convertToMessage(){
//
//    }
}
