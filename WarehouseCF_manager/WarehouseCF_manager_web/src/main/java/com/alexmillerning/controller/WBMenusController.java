package com.alexmillerning.controller;

import com.alexmillerning.pojo.WBMenus;
import com.alexmillerning.service.WBMenusService;
import com.alexmillerning.utils.EasyuiUtils;
import com.alexmillerning.utils.pojo.EasyUITree;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WBMenusController {
    final Logger logger = Logger.getLogger(WBMenusController.class);
    @Autowired
    WBMenusService wbMenusService;
    @RequestMapping("/index/getMenus")
    @ResponseBody
    public List<WBMenus> getWBMenus(){
        List<WBMenus> wbMenusList = wbMenusService.getWBMenusList();
        List<WBMenus> menuTree = EasyuiUtils.getFatherNode(wbMenusList);
        return menuTree;
    }
    @RequestMapping("/index/getEasyUITree")
    @ResponseBody
    public List<EasyUITree> getEasyUITreeListByParentId(@RequestParam(value = "id",defaultValue = "") String parentId){
        if(logger.isDebugEnabled()){
            logger.debug("页面[/index/getEasyUITree]请求参数: parentId["+parentId+"]");
        }
        List<EasyUITree> easyUITreeList = wbMenusService.getEasyUITreeListByParentId(parentId);
        return easyUITreeList;
    }
}
