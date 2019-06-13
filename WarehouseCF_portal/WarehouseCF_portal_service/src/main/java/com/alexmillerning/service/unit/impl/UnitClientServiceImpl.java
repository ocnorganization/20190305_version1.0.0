/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.unit.impl;


import com.alexmillerning.service.unit.UnitClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.unit.UnitfTable;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UnitClientServiceImpl implements UnitClientService {
    static final Logger logger = Logger.getLogger(UnitClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_UNIT_OF_TABLE}")
    private String REST_UNIT_OF_TABLE;
    @Value("${REST_UNIT_OF_TABLE_DELETE}")
    private String REST_UNIT_OF_TABLE_DELETE;
    @Value("${REST_UNIT_OF_TABLE_ADD}")
    private String REST_UNIT_OF_TABLE_ADD;
    @Value("${REST_UNIT_OF_TABLE_EDIT}")
    private String REST_UNIT_OF_TABLE_EDIT;
    @Override
    public UnitfTable getUnit(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_UNIT_OF_TABLE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_UNIT_OF_TABLE, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            UnitfTable UnitfTable = GsonUtils.fromJson(jsonResult, UnitfTable.class);
            return UnitfTable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MessageToInterface deleteUnit(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_UNIT_OF_TABLE_DELETE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_UNIT_OF_TABLE_DELETE, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            MessageToInterface messageToInterface = GsonUtils.fromJson(jsonResult, MessageToInterface.class);
            return messageToInterface;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MessageToInterface addUnit(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_UNIT_OF_TABLE_ADD+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_UNIT_OF_TABLE_ADD, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            MessageToInterface messageToInterface = GsonUtils.fromJson(jsonResult, MessageToInterface.class);
            return messageToInterface;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MessageToInterface editUnit(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_UNIT_OF_TABLE_EDIT+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_UNIT_OF_TABLE_EDIT, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            MessageToInterface messageToInterface = GsonUtils.fromJson(jsonResult, MessageToInterface.class);
            return messageToInterface;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
