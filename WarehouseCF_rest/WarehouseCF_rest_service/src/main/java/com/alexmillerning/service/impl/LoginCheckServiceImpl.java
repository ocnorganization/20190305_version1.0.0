/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.impl;

import com.alexmillerning.mapper.WBStaffBasicMapper;
import com.alexmillerning.pojo.WBStaffBasicExample;
import com.alexmillerning.service.LoginCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginCheckServiceImpl implements LoginCheckService {
    @Autowired
    WBStaffBasicMapper wbStaffBasicMapper;
    @Override
    public boolean loginCheck(int staffID, String staffPassword) {
        WBStaffBasicExample wbStaffBasicExample = new WBStaffBasicExample();
        WBStaffBasicExample.Criteria criteria = wbStaffBasicExample.createCriteria();
        criteria.andStaffIdEqualTo(staffID);
        criteria.andStaffPasswordEqualTo(staffPassword);
        int count = wbStaffBasicMapper.countByExample(wbStaffBasicExample);
        if(count > 0){
            return true;
        }else {
            return false;
        }
    }
}
