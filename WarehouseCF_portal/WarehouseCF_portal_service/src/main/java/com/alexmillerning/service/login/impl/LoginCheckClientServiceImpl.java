/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.login.impl;

import com.alexmillerning.service.login.LoginCheckClientService;
import com.alexmillerning.utils.network.HttpClientUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class LoginCheckClientServiceImpl implements LoginCheckClientService {
    static final Logger logger = Logger.getLogger(LoginCheckClientServiceImpl.class);
    private boolean flag = false;
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_LOGIN_STATUS}")
    private String REST_LOGIN_STATUS;
    @Override
    public boolean loginCheck(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_LOGIN_STATUS+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_LOGIN_STATUS, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            flag = Boolean.valueOf(jsonResult);
//            return flag;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(logger.isDebugEnabled()){
            logger.debug("最终校验结果["+flag+"]");
        }
        return flag;
    }
}
