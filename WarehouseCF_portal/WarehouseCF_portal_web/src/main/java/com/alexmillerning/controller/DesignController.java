/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;


import com.alexmillerning.pojo.InterfaceData.BasicColorfDrop;
import com.alexmillerning.pojo.InterfaceData.ColorfTable;
import com.alexmillerning.pojo.InterfaceData.SelectColorParent;
import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.service.WBColorService;
import com.alexmillerning.service.WFBrandService;
import com.alexmillerning.service.WFColorBranchService;
import com.alexmillerning.utils.JSONPack;
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
     * @description 设计元素/颜色/颜色大类下拉列表数据查询方法
     */
    public JSONObject getColorParent() {
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/colorParent]请求");
        }
        List<WBColor> wbColorList = wbColorService.getWBColorList();
        List<SelectColorParent> selectColorParentList = new ArrayList<>();
        for (WBColor wbColor : wbColorList) {
            SelectColorParent selectColorParent = new SelectColorParent();
            selectColorParent.setId(wbColor.getColorId());
            selectColorParent.setText(wbColor.getColorName());
            selectColorParentList.add(selectColorParent);
        }
//        BasicColorfDrop basicColorfDrop = new BasicColorfDrop();
////        basicColorfDrop.setResults(selectColorParentList);
////        if(logger.isDebugEnabled()){
////            logger.debug("返回给前端页面的数据为["+basicColorfDrop.toString()+"]");
////        }
////        return basicColorfDrop;
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
     * @description 设计元素/颜色/颜色子类表格数据查询方法
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
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.searchColorBranch(searchParam);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchList.size();
//            ColorfTable colorfTable = new ColorfTable();
//            colorfTable.setDraw(Integer.parseInt(draw));
//            colorfTable.setRecordsFiltered(recordsFiltered);
//            colorfTable.setRecordsTotal(recordsTotal);
//            colorfTable.setData(wfColorBranchList);
//            if(logger.isDebugEnabled()){
//                logger.debug("返回给前端页面的数据为["+colorfTable.toString()+"]");
//            }
//            return colorfTable;
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
        }else if(colorPid != null&&colorPid != ""){
            if(logger.isDebugEnabled()){
                logger.debug("开始按父类分页查询子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranch(colorPid,offSet/limit,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchService.getColorBranchCountbyPid(colorPid);
//            ColorfTable colorfTable = new ColorfTable();
//            colorfTable.setDraw(Integer.parseInt(draw));
//            colorfTable.setRecordsFiltered(recordsFiltered);
//            colorfTable.setRecordsTotal(recordsTotal);
//            colorfTable.setData(wfColorBranchList);
//            if(logger.isDebugEnabled()){
//                logger.debug("返回给前端页面的数据为["+colorfTable.toString()+"]");
//            }
//            return colorfTable;
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);
        }else{
            if(logger.isDebugEnabled()){
                logger.debug("开始分页查询所有子类颜色...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFColorBranch> wfColorBranchList = wfColorBranchService.getColorBranchbyPage(offSet/limit,limit);
            int recordsTotal = wfColorBranchService.getColorBranchCount();
            int recordsFiltered = wfColorBranchService.getColorBranchCount();
//            ColorfTable colorfTable = new ColorfTable();
//            colorfTable.setDraw(Integer.parseInt(draw));
//            colorfTable.setRecordsFiltered(recordsFiltered);
//            colorfTable.setRecordsTotal(recordsTotal);
//            colorfTable.setData(wfColorBranchList);
//            if(logger.isDebugEnabled()){
//                logger.debug("返回给前端页面的数据为["+colorfTable.toString()+"]");
//            }
//            return colorfTable;
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfColorBranchList);

        }
    }
    @RequestMapping("/mainPage/goDesign/color/edit")
    @ResponseBody
    /**
     * @methodname editColor
     * @author Alex
     * @date 2019/4/18
     * @param [colorBranchId, colorBranchName, colorName]
     * @return com.alibaba.fastjson.JSONObject
     * @description 设计元素/颜色/颜色子类表格数据更新方法
     */
    public JSONObject editColor(@RequestParam(value="colorBranchId") Integer colorBranchId,
                                @RequestParam(value="colorBranchName") String colorBranchName,
                                @RequestParam(value="colorName") String colorName){
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
                return JSONPack.pack("更新成功!");

            }else {
                return JSONPack.pack("更新失败!");
            }
        }else {
            return JSONPack.pack("请求参数为空,更新失败!");
        }
    }
    @RequestMapping("/mainPage/goDesign/color/delete")
    @ResponseBody
    /**
     * @methodname deleteColor
     * @author Alex
     * @date 2019/4/18
     * @param [deleteParamArray]
     * @return com.alibaba.fastjson.JSONObject
     * @description 设计元素/颜色/颜色子类表格数据删除方法
     */
    public JSONObject deleteColor(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            logger.debug("收到url:[/mainPage/goDesign/color/edit]请求 请求参数为deleteParam:[");
            for(int i =0;i<deleteParamArray.length;i++){
                logger.debug(deleteParamArray[i]+",");
            }
            logger.debug("]");
        }
        int flag = -1;
        for(int i =0;i<deleteParamArray.length;i++){
            int result = wfColorBranchService.deleteColorBranchbyId(deleteParamArray[i]);
            if(result == 0){
                flag = i;
                break;

            }
        }
        if(flag != -1){
            return JSONPack.pack("删除第["+flag+"]数据出错!终止后续删除!");
        }else{
            return JSONPack.pack("删除成功!");
        }
    }
    @RequestMapping("/mainPage/goDesign/color/add")
    @ResponseBody
    public JSONObject addColor(@RequestParam(value="colorName") String colorName,@RequestParam(value="colorPid") String colorPid){
        if(logger.isDebugEnabled()) {
            logger.debug("收到url:[/mainPage/goDesign/color/add]请求 请求参数为colorName:[" + colorName + "] colorPid:[" + colorPid + "]");
        }
        WFColorBranch wfColorBranch = new WFColorBranch();
        wfColorBranch.setColorBranchName(colorName);
        wfColorBranch.setColorBranchParent(colorPid);
        int result = wfColorBranchService.insertColorBranch(wfColorBranch);
        if(result > 0){
            return JSONPack.pack("新增颜色成功!");
        }else{
            return JSONPack.pack("新增颜色失败!");
        }
    }

    @Autowired
    WFBrandService wfBrandService;
    @RequestMapping("/mainPage/goDesign/brand")
    @ResponseBody
    public JSONObject  getBrand(@RequestParam(value="brandId",required = false) String brandId,
            @RequestParam(value="draw") String draw,
            @RequestParam(value="start") String start,
            @RequestParam(value="length") String length,
            @RequestParam(value="search",required = false) String searchParam){
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/brand]请求 请求参数为draw:["+draw+"] start:["+start+"] length:["+length+"] brandId:["+brandId+"] search:["+searchParam+"]");
        }
        if(searchParam != null&&searchParam != "") {
            return JSONPack.pack("xxxxx!");
        }else{
            if (logger.isDebugEnabled()) {
                logger.debug("开始根据参数查询品牌...");
            }
            Integer offSet = Integer.parseInt(start);
            Integer limit = Integer.parseInt(length);
            List<WFBrand> wfBrandList = wfBrandService.getBrand(offSet/limit,limit);
            int recordsTotal = wfBrandService.getBrandCount();
            int recordsFiltered = wfBrandService.getBrandCount();
            return JSONPack.packbyPage(Integer.parseInt(draw),recordsTotal,recordsFiltered,wfBrandList);
        }
    }
    @RequestMapping("/mainPage/goDesign/brand/edit")
    @ResponseBody
    public JSONObject editBrand(@RequestParam(value="brandId") Integer brandId,
                                @RequestParam(value="brandName") String brandName,
                                @RequestParam(value="brandDes") String brandDes){
        if(logger.isDebugEnabled()){
            logger.debug("收到url:[/mainPage/goDesign/brand/edit]请求 请求参数为brandId:["+brandId+"] brandName:["+brandName+"] brandDes:["+brandDes+"]");
        }
        if(brandId != null){
            WFBrand wfBrand = new WFBrand();
            wfBrand.setBrandId(brandId);
            wfBrand.setBrandName(brandName);
            wfBrand.setBrandDes(brandDes);
            int result = wfBrandService.updateBrand(wfBrand);
            if(result != 0){
                return JSONPack.pack("更新成功!");

            }else {
                return JSONPack.pack("更新失败!");
            }
        }else {
            return JSONPack.pack("请求参数为空,更新失败!");
        }

    }
    @RequestMapping("/mainPage/goDesign/brand/delete")
    @ResponseBody
    public JSONObject deleteBrand(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            logger.debug("收到url:[/mainPage/goDesign/brand/delete]请求 请求参数为deleteParam:[");
            for(int i =0;i<deleteParamArray.length;i++){
                logger.debug(deleteParamArray[i]+",");
            }
            logger.debug("]");
        }
        int flag = -1;
        for(int i =0;i<deleteParamArray.length;i++){
            int result = wfBrandService.deleteBrandbyId(deleteParamArray[i]);
            if(result == 0){
                flag = i;
                break;

            }
        }
        if(flag != -1){
            return JSONPack.pack("删除第["+flag+"]数据出错!终止后续删除!");
        }else{
            return JSONPack.pack("删除成功!");
        }
    }

}

