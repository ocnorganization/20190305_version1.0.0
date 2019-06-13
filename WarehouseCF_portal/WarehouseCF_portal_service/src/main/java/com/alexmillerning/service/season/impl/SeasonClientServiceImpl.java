/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.season.impl;

import com.alexmillerning.service.season.SeasonClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.Season.SeasonfTable;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SeasonClientServiceImpl implements SeasonClientService {
    static final Logger logger = Logger.getLogger(SeasonClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_SEASON_OF_TABLE}")
    private String REST_SEASON_OF_TABLE;
    @Value("${REST_SEASON_OF_TABLE_DELETE}")
    private String REST_SEASON_OF_TABLE_DELETE;
    @Value("${REST_SEASON_OF_TABLE_ADD}")
    private String REST_SEASON_OF_TABLE_ADD;
    @Value("${REST_SEASON_OF_TABLE_EDIT}")
    private String REST_SEASON_OF_TABLE_EDIT;
    @Override
    public SeasonfTable getSeason(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_SEASON_OF_TABLE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_SEASON_OF_TABLE, jsonParam);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            SeasonfTable SeasonfTable = GsonUtils.fromJson(jsonResult, SeasonfTable.class);
            return SeasonfTable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MessageToInterface deleteSeason(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_SEASON_OF_TABLE_DELETE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_SEASON_OF_TABLE_DELETE, jsonParam);
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
    public MessageToInterface addSeason(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_SEASON_OF_TABLE_ADD+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_SEASON_OF_TABLE_ADD, jsonParam);
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
    public MessageToInterface editSeason(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_SEASON_OF_TABLE_EDIT+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_SEASON_OF_TABLE_EDIT, jsonParam);
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
