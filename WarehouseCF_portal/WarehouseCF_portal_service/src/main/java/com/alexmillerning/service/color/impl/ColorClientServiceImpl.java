/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.color.impl;

import com.alexmillerning.service.color.ColorClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.color.BasicColorfDrop;
import com.alexmillerning.utils.pojo.design.color.BrunchColorfTable;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
/**
 * @name BasicColorClientServiceImpl
 * @author Alex
 * @date 2019/6/4
 * @description 颜色模块请求REST数据类
 */
public class ColorClientServiceImpl implements ColorClientService {
    static final Logger logger = Logger.getLogger(ColorClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_BASIC_COLOR_OF_DROP}")
    private String REST_BASIC_COLOR_OF_DROP;
    @Value("${REST_BRANCH_COLOR_OF_TABLE}")
    private String REST_BRANCH_COLOR_OF_TABLE;
    @Value("${REST_BRANCH_COLOR_OF_TABLE_DELETE}")
    private String REST_BRANCH_COLOR_OF_TABLE_DELETE;
    @Value("${REST_BRANCH_COLOR_OF_TABLE_ADD}")
    private String REST_BRANCH_COLOR_OF_TABLE_ADD;
    @Value("${REST_BRANCH_COLOR_OF_TABLE_EDIT}")
    private String REST_BRANCH_COLOR_OF_TABLE_EDIT;
    @Override
    /**
     * @methodname getBasicColorfDrop
     * @author Alex
     * @date 2019/6/4
     * @param []
     * @return com.alexmillerning.utils.pojo.BasicColorfDrop
     * @description 请求REST颜色大类下拉菜单数据
     */
    public BasicColorfDrop getBasicColorfDrop() {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BASIC_COLOR_OF_DROP+"]");
            }
            String jsonResult = HttpClientUtils.httpGet(REST_URL + REST_BASIC_COLOR_OF_DROP);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            BasicColorfDrop basicColorfDrop = GsonUtils.fromJson(jsonResult, BasicColorfDrop.class);
            return basicColorfDrop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    /**
     * @methodname getBrunchColorfTable
     * @author Alex
     * @date 2019/6/4
     * @param []
     * @return com.alexmillerning.utils.pojo.BrunchColorfTable
     * @description 请求REST颜色子类表格数据
     */
    public BrunchColorfTable getBrunchColorfTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_COLOR_OF_TABLE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_COLOR_OF_TABLE, jsonParam);
            BrunchColorfTable brunchColorfTable = GsonUtils.fromJson(jsonResult, BrunchColorfTable.class);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            return brunchColorfTable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param jsonParam
     * @return
     * @description 请求REST颜色子类表格数据删除
     */
    @Override
    public MessageToInterface deleteBrunchColorfTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_COLOR_OF_TABLE_DELETE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_COLOR_OF_TABLE_DELETE, jsonParam);
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

    /**
     *
     * @param jsonParam
     * @return
     * @description 请求REST颜色子类表格数据新增
     */
    @Override
    public MessageToInterface addBrunchColorfTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_COLOR_OF_TABLE_ADD+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_COLOR_OF_TABLE_ADD, jsonParam);
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

    /**
     *
     * @param jsonParam
     * @return
     * @description 请求REST颜色子类表格数据编辑
     */
    @Override
    public MessageToInterface editBrunchColorfTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_COLOR_OF_TABLE_EDIT+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_COLOR_OF_TABLE_EDIT, jsonParam);
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
