/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFSizeMapper;
import com.alexmillerning.pojo.WFSize;
import com.alexmillerning.pojo.WFSizeExample;
import com.alexmillerning.service.BasicSizeService;
import com.alexmillerning.utils.pojo.design.size.SizefDrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicSizeServiceImpl implements BasicSizeService {
    @Autowired
    WFSizeMapper wfSizeMapper;
    @Override
    public SizefDrop getSize() {
        SizefDrop sizefDrop = new SizefDrop();
        WFSizeExample wfSizeExample = new WFSizeExample();
        List<WFSize> wfSizeList = wfSizeMapper.selectByExample(wfSizeExample);
        List<SizefDrop.ResultsBean> resultsBeanList = new ArrayList();
        for(WFSize wfSize : wfSizeList){
            SizefDrop.ResultsBean resultsBean = new SizefDrop.ResultsBean();
            resultsBean.setId(wfSize.getSizeId());
            resultsBean.setText(wfSize.getSizeName());
            resultsBeanList.add(resultsBean);
        }
        sizefDrop.setResults(resultsBeanList);
        return sizefDrop;
    }
}
