/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFSizeBranch;
import com.alexmillerning.utils.pojo.design.size.BranchSizefTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToBrunchSizeTalble {
    public static BranchSizefTable convert(List<WFSizeBranch> wfSizeBranchList, int draw, int recordsTotal, int recordsFiltered){
        BranchSizefTable branchSizefTable = new BranchSizefTable();
        List<BranchSizefTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFSizeBranch wfSizeBranch : wfSizeBranchList){
            BranchSizefTable.DataBean dataBean = new BranchSizefTable.DataBean();
            BranchSizefTable.DataBean.WfSizeBean wfSizeBean = new BranchSizefTable.DataBean.WfSizeBean();

            wfSizeBean.setSizeName(wfSizeBranch.getWfSize().getSizeName());
            dataBean.setSizeBranchId(wfSizeBranch.getSizeBranchId());
            dataBean.setSizeBranchName(wfSizeBranch.getSizeBranchName());
            dataBean.setWfSizeBean(wfSizeBean);
            dataBeanList.add(dataBean);
        }
        branchSizefTable.setData(dataBeanList);
        branchSizefTable.setDraw(draw);
        branchSizefTable.setRecordsTotal(recordsTotal);
        branchSizefTable.setRecordsFiltered(recordsFiltered);
        return branchSizefTable;
    }
}
