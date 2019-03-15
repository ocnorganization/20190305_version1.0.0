package com.alexmillerning.controller;

import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.service.WBMenusService;
import com.alexmillerning.utils.EasyuiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WBMenusController {
    @Autowired
    WBMenusService wbMenusService;
    @RequestMapping("/index/getMenus")
    @ResponseBody
    public List<WBMenus> getWBMenus(){
        List<WBMenus> wbMenusList = wbMenusService.getWBMenusList();
        List<WBMenus> menuTree = EasyuiUtils.getFatherNode(wbMenusList);
//        System.out.println(menuTree);
        return menuTree;
    }
}
