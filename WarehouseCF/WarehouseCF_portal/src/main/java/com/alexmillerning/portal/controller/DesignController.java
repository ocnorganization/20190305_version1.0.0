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
import java.util.Map;

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
    public JSONObject getColor(@RequestParam(value="colorPid",required = false) String colorPid,
                               @RequestParam(value="draw") String draw,
                               @RequestParam(value="start") String start,
                               @RequestParam(value="length") String length,
                               @RequestParam(value="search",required = false) String searchParam){
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/color]请求 请求参数为draw:["+draw+"] start:["+start+"] length:["+length+"] colorPid:["+colorPid+"] search:["+searchParam+"]");
        }
        if(searchParam != null&&searchParam != ""){
            if(logger.isDebugEnabled()){
                logger.debug("开始根据参数查询子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.searchColorBranch(searchParam,offSet,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchList.size();
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
        }else if(colorPid != null&&colorPid != ""){
            if(logger.isDebugEnabled()){
                logger.debug("开始按父类分页查询子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranch(colorPid,offSet,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchService.getColorBranchCountbyPid(colorPid);
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

//        }
//        if(searchParam == null||searchParam.equals("")){
//            if(!colorPid.equals("0")){
//                if(logger.isDebugEnabled()){
//                    logger.debug("开始按父类分页查询子类颜色...");
//                }
//                Integer offSet = Integer.parseInt(start);
//                Integer limit = Integer.parseInt(length);
//                List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranch(colorPid,offSet,limit);
//                int recordsTotal = wfColorBranchService.getColorBranchCount();
//                int recordsFiltered = wfColorBranchService.getColorBranchCountbyPid(colorPid);
//                return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
//            }else{
//                if(logger.isDebugEnabled()){
//                    logger.debug("开始分页查询所有子类颜色...");
//                }
//                Integer offSet = Integer.parseInt(start);
//                Integer limit = Integer.parseInt(length);
//                List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranchbyPage(offSet,limit);
//                int recordsTotal = wfColorBranchService.getColorBranchCount();
//                int recordsFiltered = wfColorBranchService.getColorBranchCount();
//                return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
//            }
//        }else{
//            if(logger.isDebugEnabled()){
//                logger.debug("开始根据参数查询子类颜色...");
//            }
//            Integer offSet = Integer.parseInt(start);
//            Integer limit = Integer.parseInt(length);
//            List<WFColorBranch> wfColorBranchList = wfColorBranchService.searchColorBranch(searchParam,offSet,limit);
//            int recordsTotal = wfColorBranchService.getColorBranchCount();
//            int recordsFiltered = wfColorBranchList.size();
//            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);

//        }

    }
    @RequestMapping("/mainPage/goDesign/color/edit")
    @ResponseBody
    public JSONObject editColor(@RequestParam(value="colorBranchId") Integer colorBranchId,@RequestParam(value="colorBranchName") String colorBranchName,@RequestParam(value="colorName") String colorName){
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/color/edit]请求 请求参数为draw:["+colorBranchId+"] colorBranchName:["+colorBranchName+"] colorName:["+colorName+"]");
        }
        if(colorBranchId != null){
            WFColorBranch wfColorBranch = new WFColorBranch();
            wfColorBranch.setColorBranchId(colorBranchId);
            wfColorBranch.setColorBranchName(colorBranchName);
            if(colorName !=null&&colorName !=""){
                wfColorBranch.setColorBranchParent(colorName);
            }
            int result = wfColorBranchService.updateColorBranch(wfColorBranch);
            if(result != 0){
                return JSONPack.packe(true,"更新成功!");

            }else {
                return JSONPack.packe(false,"更新失败!");
            }
        }else {
            return JSONPack.packe(false,"请求参数为空,更新失败!");
        }
    }
}
