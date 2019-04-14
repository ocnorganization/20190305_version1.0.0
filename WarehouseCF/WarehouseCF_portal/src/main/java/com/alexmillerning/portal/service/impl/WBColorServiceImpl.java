/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.service.impl;

import com.alexmillerning.mapper.WBColorMapper;
import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WBColorExample;
import com.alexmillerning.portal.service.WBColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WBColorServiceImpl implements WBColorService {
    @Autowired
    WBColorMapper wbColorMapper;
    @Override
    public List<WBColor> getWBColorList() {
        WBColorExample wbColorExample = new WBColorExample();
        List<WBColor> wbColorList = wbColorMapper.selectByExample(wbColorExample);
        if(wbColorList != null){
            return wbColorList;
        }
        return null;
    }
}
