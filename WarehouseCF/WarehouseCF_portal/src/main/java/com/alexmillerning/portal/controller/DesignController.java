/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.portal.controller;

import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.portal.service.WBColorService;
import com.alexmillerning.portal.service.WFColorBranchService;
import com.alexmillerning.utils.JSONPack;
import com.alexmillerning.utils.pojo.SelectColorParent;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DesignController {
    final Logger logger = Logger.getLogger(DesignController.class);
    @Autowired
    WBColorService wbColorService;
    @RequestMapping("/mainPage/goDesign/colorParent")
    @ResponseBody
    /**
     * @methodname getColorParent
     * @author Alex
     * @date 2019/4/12
     * @param []
     * @return com.alibaba.fastjson.JSONObject
     * @description 设计元素/颜色/颜色大类下拉列表数据处理类
     */
    public JSONObject getColorParent() {
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/colorParent]请求 请求参数为");
        }
        List<WBColor> wbColorList = wbColorService.getWBColorList();
        List<SelectColorParent> selectColorParentList = new ArrayList<>();
        for (WBColor wbColor : wbColorList) {
            SelectColorParent selectColorParent = new SelectColorParent();
            selectColorParent.setId(wbColor.getColorId());
            selectColorParent.setText(wbColor.getColorName());
            selectColorParentList.add(selectColorParent);
        }
        return JSONPack.pack("results",selectColorParentList);
    }

    @Autowired
    WFColorBranchService wfColorBranchService;
    @RequestMapping("/mainPage/goDesign/color")
    @ResponseBody
    /**
     * @methodname getColor
     * @author Alex
     * @date 2019/4/12
     * @param [colorId, draw, start, length]
     * @return com.alibaba.fastjson.JSONObject
     * @description 设计元素/颜色/颜色子类表格数据处理类
     */
    public JSONObject getColor(@RequestParam(value="colorid") String colorId,@RequestParam(value="draw") String draw,@RequestParam(value="start") String start,@RequestParam(value="length") String length){
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/color]请求 请求参数为draw:["+draw+"] start:["+start+"] length:["+length+"] colorid:["+colorId+"]");
        }
        if(!colorId.equals("0")){
            if(logger.isDebugEnabled()){
                logger.debug("开始按父类分页查询子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranch(colorId,offSet,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchService.getColorBranchCountbyPid(colorId);
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("开始分页查询所有子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranchbyPage(offSet,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchService.getColorBranchCount();
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
        }
    }
}
