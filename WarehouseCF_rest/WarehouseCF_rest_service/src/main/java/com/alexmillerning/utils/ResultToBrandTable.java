/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.utils;

import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.utils.pojo.design.brand.BrandfTable;

import java.util.ArrayList;
import java.util.List;

public class ResultToBrandTable {
    public static BrandfTable convert(List<WFBrand> wfBrandList, int draw, int recordsTotal, int recordsFiltered){
        BrandfTable brunchColorfTable = new BrandfTable();
        List<BrandfTable.DataBean> dataBeanList = new ArrayList<>();
        for(WFBrand wfBrand : wfBrandList){
            BrandfTable.DataBean dataBean = new BrandfTable.DataBean();
            dataBean.setBrandId(wfBrand.getBrandId());
            dataBean.setBrandName(wfBrand.getBrandName());
            dataBean.setBrandDes(wfBrand.getBrandDes());
            dataBeanList.add(dataBean);
        }
        brunchColorfTable.setData(dataBeanList);
        brunchColorfTable.setDraw(draw);
        brunchColorfTable.setRecordsTotal(recordsTotal);
        brunchColorfTable.setRecordsFiltered(recordsFiltered);
        return brunchColorfTable;
    }
}
