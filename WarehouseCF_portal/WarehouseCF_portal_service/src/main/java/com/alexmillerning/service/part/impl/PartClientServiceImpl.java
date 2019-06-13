/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.part.impl;

import com.alexmillerning.service.part.PartClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.part.PartfTable;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PartClientServiceImpl implements PartClientService {
    static final Logger logger = Logger.getLogger(PartClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_PART_OF_TABLE}")
    private String REST_PART_OF_TABLE;
    @Value("${REST_PART_OF_TABLE_DELETE}")
    private String REST_PART_OF_TABLE_DELETE;
    @Value("${REST_PART_OF_TABLE_ADD}")
    private String REST_PART_OF_TABLE_ADD;
    @Value("${REST_PART_OF_TABLE_EDIT}")
    private String REST_PART_OF_TABLE_EDIT;
    @Override
    public PartfTable getPart(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_PART_OF_TABLE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_PART_OF_TABLE, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            PartfTable PartfTable = GsonUtils.fromJson(jsonResult, PartfTable.class);
            return PartfTable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MessageToInterface deletePart(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_PART_OF_TABLE_DELETE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_PART_OF_TABLE_DELETE, jsonParam);
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
    public MessageToInterface addPart(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_PART_OF_TABLE_ADD+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_PART_OF_TABLE_ADD, jsonParam);
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
    public MessageToInterface editPart(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_PART_OF_TABLE_EDIT+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_PART_OF_TABLE_EDIT, jsonParam);
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
