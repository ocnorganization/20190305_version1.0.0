/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;


import com.alexmillerning.service.color.ColorClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.color.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/**
 * @name DesignController
 * @author Alex
 * @date 2019/6/6
 * @description 设计元素controller控制类
 */
public class DesignController {
    final Logger logger = Logger.getLogger(DesignController.class);
    @Autowired
    ColorClientService colorClientService;
    /**
     * @description 设计元素/颜色/颜色大类下拉列表数据
     */
    @RequestMapping("/mainPage/goDesign/colorParent")
    @ResponseBody
    public BasicColorfDrop getColorParent() {
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/colorParent]");
        }
        return colorClientService.getBasicColorfDrop();
    }
    /**
     * @description 设计元素/颜色/颜色子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/color")
    @ResponseBody
    public BrunchColorfTable getColor(@RequestParam(value="colorPid",required = false) String colorPid,
                                      @RequestParam(value="draw") String draw,
                                      @RequestParam(value="start") String start,
                                      @RequestParam(value="length") String length,
                                      @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] colorPid:[" + colorPid + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        BrunchColorReqParam brunchColorReqParam = new BrunchColorReqParam();
        brunchColorReqParam.setDraw(Integer.parseInt(draw));
        brunchColorReqParam.setCurrentPage((offSet/limit)+1);
        brunchColorReqParam.setPageSize(limit);
        brunchColorReqParam.setColorPid(colorPid);
        brunchColorReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(brunchColorReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return colorClientService.getBrunchColorfTable(jsonParam);
    }
    /**
     * @description 设计元素/颜色/颜色子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/color/delete")
    @ResponseBody
    public MessageToInterface deleteBrunchColor(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color/edit]请求 请求参数为deleteParam:[");
            for(int i =0;i<deleteParamArray.length;i++){
                logger.debug(deleteParamArray[i]+",");
            }
            logger.debug("]");
        }
        BrunchColorDeleteReqParam brunchColorDeleteReqParam = new BrunchColorDeleteReqParam();
        brunchColorDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(brunchColorDeleteReqParam);
        return colorClientService.deleteBrunchColorfTable(jsonParam);
    }

    /**
     *
     * @param colorName
     * @param colorPid
     * @return
     * @description 设计元素/颜色/颜色子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/color/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestParam(value="colorName") String colorName,@RequestParam(value="colorPid") String colorPid){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color/add] 请求参数为colorName:[" + colorName + "] colorPid:[" + colorPid + "]");
        }
        BrunchColorAddReqParam brunchColorAddReqParam = new BrunchColorAddReqParam();
        brunchColorAddReqParam.setColorName(colorName);
        brunchColorAddReqParam.setColorPid(colorPid);
        String jsonParam = GsonUtils.toJson(brunchColorAddReqParam);
        return colorClientService.addBrunchColorfTable(jsonParam);
    }

    /**
     * \
     * @param colorBranchId
     * @param colorBranchName
     * @param colorName
     * @return
     * @description 设计元素/颜色/颜色子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/color/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestParam(value="colorBranchId") String colorBranchId,
                                              @RequestParam(value="colorBranchName") String colorBranchName,
                                              @RequestParam(value="colorName") String colorName){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/color/edit] colorBranchId:["+colorBranchId+"] colorBranchName:["+colorBranchName+"] colorName:["+colorName+"]");
        }
        BrunchColorEditReqParam brunchColorEditReqParam = new BrunchColorEditReqParam();
        brunchColorEditReqParam.setColorBranchId(colorBranchId);
        brunchColorEditReqParam.setColorBranchName(colorBranchName);
        brunchColorEditReqParam.setColorName(colorName);
        String jsonParam = GsonUtils.toJson(brunchColorEditReqParam);
        return colorClientService.editBrunchColorfTable(jsonParam);
    }


}

