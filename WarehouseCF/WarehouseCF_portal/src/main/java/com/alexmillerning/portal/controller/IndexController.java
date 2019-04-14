/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.controller;

import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.portal.service.MenuTreeUtils;
import com.alexmillerning.portal.service.WFMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    WFMenusService wfMenusService;
    //index页面
    @RequestMapping("/")
    public String  requestIndex(){
        return "index";
    }
    //加载页面菜单
    @RequestMapping("/mainPage/getTree")
    @ResponseBody
    public List<WFMenus> getWBMenus(){
        List<WFMenus> wfMenusList = wfMenusService.getWFMenusList();
        List<WFMenus> menuTree = MenuTreeUtils.getFatherNode(wfMenusList);
        return menuTree;
    }
}
