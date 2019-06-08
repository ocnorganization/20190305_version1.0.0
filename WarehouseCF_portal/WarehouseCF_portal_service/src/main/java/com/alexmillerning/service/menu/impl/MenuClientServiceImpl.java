/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.service.menu.impl;

import com.alexmillerning.service.menu.MenuClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.network.HttpClientUtils;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
/**
 * @name MenuClientServiceImpl
 * @author Alex
 * @date 2019/6/4
 * @description 主页导航栏菜单数据获取实现类
 */
public class MenuClientServiceImpl implements MenuClientService {
    static final Logger logger = Logger.getLogger(MenuClientServiceImpl.class);
    @Value("${REST_URL}")
    private String REST_URL;
    @Value("${REST_MAIN_MENU}")
    private String REST_MAIN_MENU;
    @Override
    /**
     * @methodname getMenuTree
     * @author Alex
     * @date 2019/6/4
     * @param []
     * @return com.alexmillerning.utils.pojo.menu.MenuTree
     * @description 获取portal主页导航菜单数据
     */
    public MenuTree getMenuTree() {
        try {
            if(logger.isDebugEnabled()){
                logger.debug("请求服务器地址["+REST_URL+"] 请求路径["+REST_MAIN_MENU+"]");
            }
            String jsonResult = HttpClientUtils.httpGet(REST_URL + REST_MAIN_MENU);
            if(logger.isDebugEnabled()){
                logger.debug("服务器[REST] 返回数据["+jsonResult+"]");
            }
            MenuTree menuTree = GsonUtils.fromJson(jsonResult, MenuTree.class);
            return menuTree;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
