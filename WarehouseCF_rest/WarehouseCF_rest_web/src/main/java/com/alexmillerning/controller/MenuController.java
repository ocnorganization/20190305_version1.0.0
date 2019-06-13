/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.MenuService;
import com.alexmillerning.utils.pojo.menu.MenuTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/mainPage")
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/menuTree")
    @ResponseBody
    public MenuTree getMenuTree(){
        MenuTree menuTree = menuService.getMenuTree();
        return menuTree;
    }

}
