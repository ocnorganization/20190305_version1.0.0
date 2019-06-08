/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;



import com.alexmillerning.service.menu.MenuClientService;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    final Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    MenuClientService menuClientService;
    @RequestMapping("/")
    /**
     * @methodname requestIndex
     * @author Alex
     * @date 2019/6/6
     * @param [modelMap]
     * @return java.lang.String
     * @description 加载主页以及左侧菜单按钮
     */
    public String  requestIndex(ModelMap modelMap){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/index.html]");
        }
        MenuTree menuTree = menuClientService.getMenuTree();
        modelMap.addAttribute("menuTree",menuTree);
        return "index";
    }
}
