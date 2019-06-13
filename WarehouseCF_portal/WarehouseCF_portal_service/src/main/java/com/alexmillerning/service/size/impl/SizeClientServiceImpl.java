/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.service.size.impl;

import com.alexmillerning.service.size.SizeClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.size.BranchSizefTable;
import com.alexmillerning.utils.pojo.design.size.SizefDrop;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
/**
 * @name SizeClientServiceImpl
 * @author Alex
 * @date 2019/6/4
 * @description 尺寸模块请求REST数据类
 */
public class SizeClientServiceImpl implements SizeClientService {
    static final Logger logger = Logger.getLogger(SizeClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_BASIC_SIZE_OF_DROP}")
    private String REST_BASIC_SIZE_OF_DROP;
    @Value("${REST_BRANCH_SIZE_OF_TABLE}")
    private String REST_BRANCH_SIZE_OF_TABLE;
    @Value("${REST_BRANCH_SIZE_OF_TABLE_DELETE}")
    private String REST_BRANCH_SIZE_OF_TABLE_DELETE;
    @Value("${REST_BRANCH_SIZE_OF_TABLE_ADD}")
    private String REST_BRANCH_SIZE_OF_TABLE_ADD;
    @Value("${REST_BRANCH_SIZE_OF_TABLE_EDIT}")
    private String REST_BRANCH_SIZE_OF_TABLE_EDIT;
    @Override
    /**
     * @methodname getSizefDrop
     * @author Alex
     * @date 2019/6/4
     * @param []
     * @return com.alexmillerning.utils.pojo.SizefDrop
     * @description 请求REST尺寸大类下拉菜单数据
     */
    public SizefDrop getBasicSizefDrop() {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BASIC_SIZE_OF_DROP+"]");
            }
            String jsonResult = HttpClientUtils.httpGet(REST_URL + REST_BASIC_SIZE_OF_DROP);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            SizefDrop basicSizefDrop = GsonUtils.fromJson(jsonResult, SizefDrop.class);
            return basicSizefDrop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    /**
     * @methodname getBranchSizefTable
     * @author Alex
     * @date 2019/6/4
     * @param []
     * @return com.alexmillerning.utils.pojo.BranchSizefTable
     * @description 请求REST尺寸子类表格数据
     */
    public BranchSizefTable getBranchSizefTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_SIZE_OF_TABLE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_SIZE_OF_TABLE, jsonParam);
            BranchSizefTable branchSizefTable = GsonUtils.fromJson(jsonResult, BranchSizefTable.class);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            return branchSizefTable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param jsonParam
     * @return
     * @description 请求REST尺寸子类表格数据删除
     */
    @Override
    public MessageToInterface deleteBranchSizefTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_SIZE_OF_TABLE_DELETE+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_SIZE_OF_TABLE_DELETE, jsonParam);
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
     * @description 请求REST尺寸子类表格数据新增
     */
    @Override
    public MessageToInterface addBranchSizefTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_SIZE_OF_TABLE_ADD+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_SIZE_OF_TABLE_ADD, jsonParam);
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
     * @description 请求REST尺寸子类表格数据编辑
     */
    @Override
    public MessageToInterface editBranchSizefTable(String jsonParam) {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_BRANCH_SIZE_OF_TABLE_EDIT+"]");
            }
            String jsonResult = HttpClientUtils.httpPost(REST_URL + REST_BRANCH_SIZE_OF_TABLE_EDIT, jsonParam);
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
