/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WBColorMapper;
import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WBColorExample;
import com.alexmillerning.service.BasicColorService;
import com.alexmillerning.utils.pojo.design.color.BasicColorfDrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicColorServiceImpl implements BasicColorService {
    @Autowired
    WBColorMapper wbColorMapper;
    @Override
    public BasicColorfDrop getBasicColor() {
        BasicColorfDrop basicColorfDrop = new BasicColorfDrop();
        WBColorExample wbColorExample = new WBColorExample();
        List<WBColor> wbColorList = wbColorMapper.selectByExample(wbColorExample);
        List<BasicColorfDrop.ResultsBean> resultsBeanList = new ArrayList<BasicColorfDrop.ResultsBean>();
        for(int i = 0; i < wbColorList.size(); i++){
            BasicColorfDrop.ResultsBean resultsBean = new BasicColorfDrop.ResultsBean();
            resultsBean.setId(wbColorList.get(i).getColorId());
            resultsBean.setText(wbColorList.get(i).getColorName());
            resultsBeanList.add(resultsBean);
        }
        basicColorfDrop.setResults(resultsBeanList);
        return basicColorfDrop;
    }
}
