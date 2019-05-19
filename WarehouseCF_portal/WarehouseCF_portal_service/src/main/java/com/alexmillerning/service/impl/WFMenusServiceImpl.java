/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WFMenusMapper;
import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.pojo.WFMenusExample;
import com.alexmillerning.service.WFMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WFMenusServiceImpl implements WFMenusService {
    @Autowired
    WFMenusMapper wfMenusMapper;
    @Override
    public List<WFMenus> getWFMenusList() {
        WFMenusExample wfMenusExample = new WFMenusExample();
        List<WFMenus> wfMenusList = wfMenusMapper.selectByExample(wfMenusExample);
        if(wfMenusList != null){
            return wfMenusList;
        }
        return null;
    }
}
