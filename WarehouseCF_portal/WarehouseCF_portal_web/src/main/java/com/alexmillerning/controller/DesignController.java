/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;


import com.alexmillerning.service.brand.BrandClientService;
import com.alexmillerning.service.color.ColorClientService;
import com.alexmillerning.service.craft.CraftClientService;
import com.alexmillerning.service.part.PartClientService;
import com.alexmillerning.service.season.SeasonClientService;
import com.alexmillerning.service.size.SizeClientService;
import com.alexmillerning.service.unit.UnitClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.Season.*;
import com.alexmillerning.utils.pojo.design.brand.*;
import com.alexmillerning.utils.pojo.design.color.*;
import com.alexmillerning.utils.pojo.design.craft.*;
import com.alexmillerning.utils.pojo.design.part.*;
import com.alexmillerning.utils.pojo.design.size.*;
import com.alexmillerning.utils.pojo.design.unit.*;
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
    @RequestMapping("/design/color/data.html")
    public String color(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/color/data.html]");
        }
        return "color/data";
    }
    @RequestMapping("/design/brand/data.html")
    public String brand(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/brand/data.html]");
        }
        return "brand/data";
    }
    @RequestMapping("/design/craft/data.html")
    public String craft(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/craft/data.html]");
        }
        return "craft/data";
    }
    @RequestMapping("/design/part/data.html")
    public String part(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/part/data.html]");
        }
        return "part/data";
    }
    @RequestMapping("/design/season/data.html")
    public String season(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/season/data.html]");
        }
        return "season/data";
    }
    @RequestMapping("/design/size/data.html")
    public String size(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/size/data.html]");
        }
        return "size/data";
    }
    @RequestMapping("/design/unit/data.html")
    public String unit(){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/design/unit/data.html]");
        }
        return "unit/data";
    }
    /**
     * 设计元素/颜色
     */
    @Autowired
    ColorClientService colorClientService;
    /**
     * @description 设计元素/颜色/颜色大类下拉列表数据
     */
    @RequestMapping("/mainPage/goDesign/colorParent.go")
    @ResponseBody
    public BasicColorfDrop getColorParent() {
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/colorParent.go]");
        }
        return colorClientService.getBasicColorfDrop();
    }
    /**
     * @description 设计元素/颜色/颜色子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/color.go")
    @ResponseBody
    public BrunchColorfTable getColor(@RequestParam(value="colorPid",required = false) String colorPid,
                                      @RequestParam(value="draw") String draw,
                                      @RequestParam(value="start") String start,
                                      @RequestParam(value="length") String length,
                                      @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] colorPid:[" + colorPid + "] search:[" + searchParam + "]");
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
    @RequestMapping("/mainPage/goDesign/color/delete.go")
    @ResponseBody
    public MessageToInterface deleteBrunchColor(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/color/edit.go] 请求参数为deleteParam:["+stringBuilder+"]");
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
    @RequestMapping("/mainPage/goDesign/color/add.go")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestParam(value="colorName") String colorName,@RequestParam(value="colorPid") String colorPid){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color/add.go] 请求参数为colorName:[" + colorName + "] colorPid:[" + colorPid + "]");
        }
        BrunchColorAddReqParam brunchColorAddReqParam = new BrunchColorAddReqParam();
        brunchColorAddReqParam.setColorName(colorName);
        brunchColorAddReqParam.setColorPid(colorPid);
        String jsonParam = GsonUtils.toJson(brunchColorAddReqParam);
        return colorClientService.addBrunchColorfTable(jsonParam);
    }

    /**
     *
     * @param colorBranchId
     * @param colorBranchName
     * @param colorName
     * @return
     * @description 设计元素/颜色/颜色子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/color/edit.go")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestParam(value="colorBranchId") String colorBranchId,
                                              @RequestParam(value="colorBranchName") String colorBranchName,
                                              @RequestParam(value="colorName") String colorName){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/color/edit.go] colorBranchId:["+colorBranchId+"] colorBranchName:["+colorBranchName+"] colorName:["+colorName+"]");
        }
        BrunchColorEditReqParam brunchColorEditReqParam = new BrunchColorEditReqParam();
        brunchColorEditReqParam.setColorBranchId(colorBranchId);
        brunchColorEditReqParam.setColorBranchName(colorBranchName);
        brunchColorEditReqParam.setColorName(colorName);
        String jsonParam = GsonUtils.toJson(brunchColorEditReqParam);
        return colorClientService.editBrunchColorfTable(jsonParam);
    }
    /**
     * 设计元素/品牌
     */
    @Autowired
    BrandClientService brandClientService;
    /**
     * @description 设计元素/品牌/品牌表格数据
     */
    @RequestMapping("/mainPage/goDesign/brand.go")
    @ResponseBody
    public BrandfTable getBrand(@RequestParam(value="draw") String draw,
                                @RequestParam(value="start") String start,
                                @RequestParam(value="length") String length,
                                @RequestParam(value="search",required = false) String searchParam){
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/color.go] 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "]  search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
//        BrunchColorReqParam brunchColorReqParam = new BrunchColorReqParam();
        BrandReqParam brandReqParam = new BrandReqParam();
        brandReqParam.setDraw(Integer.parseInt(draw));
        brandReqParam.setCurrentPage((offSet/limit)+1);
        brandReqParam.setPageSize(limit);
        brandReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(brandReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return brandClientService.getBrand(jsonParam);
    }
    /**
     * @description 设计元素/品牌/品牌表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/brand/delete.go")
    @ResponseBody
    public MessageToInterface deleteBrand(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/color/edit.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        BrandDeleteReqParam brandDeleteReqParam = new BrandDeleteReqParam();
        brandDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(brandDeleteReqParam);
        return brandClientService.deleteBrand(jsonParam);
    }

    /**
     * @description 设计元素/品牌/品牌表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/brand/add.go")
    @ResponseBody
    public MessageToInterface addBrand(@RequestParam(value="brandName") String brandName,@RequestParam(value="brandDes") String brandDes){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/brand/add.go] 请求参数为brandName:[" + brandName + "] brandDes:[" + brandDes + "]");
        }
        BrandAddReqParam brandAddReqParam = new BrandAddReqParam();
        brandAddReqParam.setBrandName(brandName);
        brandAddReqParam.setBrandDes(brandDes);
        String jsonParam = GsonUtils.toJson(brandAddReqParam);
        return brandClientService.addBrand(jsonParam);
    }
    /**
     * @description 设计元素/品牌/品牌表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/brand/edit.go")
    @ResponseBody
    public MessageToInterface editBrand(@RequestParam(value="brandId") String brandId,
                                              @RequestParam(value="brandName") String brandName,
                                              @RequestParam(value="brandDes") String brandDes){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/brand/edit.go] brandId:["+brandId+"] brandName:["+brandName+"] brandDes:["+brandDes+"]");
        }
        BrandEditReqParam brandEditReqParam = new BrandEditReqParam();
        brandEditReqParam.setBrandId(brandId);
        brandEditReqParam.setBrandName(brandName);
        brandEditReqParam.setBrandDes(brandDes);
        String jsonParam = GsonUtils.toJson(brandEditReqParam);
        return brandClientService.editBrand(jsonParam);
    }
    /**
     * 设计元素/尺寸
     */
    @Autowired
    SizeClientService sizeClientService;
    /**
     * @description 设计元素/尺寸/尺寸大类下拉列表数据
     */
    @RequestMapping("/mainPage/goDesign/sizeParent.go")
    @ResponseBody
    public SizefDrop getSizeParent() {
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/sizeParent.go]");
        }
        return sizeClientService.getBasicSizefDrop();
    }
    /**
     * @description 设计元素/尺寸/尺寸子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/branchSize.go")
    @ResponseBody
    public BranchSizefTable getSize(@RequestParam(value="sizePid",required = false) String sizePid,
                                    @RequestParam(value="draw") String draw,
                                    @RequestParam(value="start") String start,
                                    @RequestParam(value="length") String length,
                                    @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/branchSize.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] sizePid:[" + sizePid + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        BranchSizeReqParam branchSizeReqParam = new BranchSizeReqParam();
        branchSizeReqParam.setDraw(Integer.parseInt(draw));
        branchSizeReqParam.setCurrentPage((offSet/limit)+1);
        branchSizeReqParam.setPageSize(limit);
        branchSizeReqParam.setSizePid(sizePid);
        branchSizeReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(branchSizeReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return sizeClientService.getBranchSizefTable(jsonParam);
    }
    /**
     * @description 设计元素/尺寸/尺寸子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/branchSize/delete.go")
    @ResponseBody
    public MessageToInterface deleteBranchSize(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/branchSize/delete.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        BranchSizeDeleteReqParam branchSizeDeleteReqParam = new BranchSizeDeleteReqParam();
        branchSizeDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(branchSizeDeleteReqParam);
        return sizeClientService.deleteBranchSizefTable(jsonParam);
    }

    /**
     * @description 设计元素/尺寸/尺寸子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/branchSize/add.go")
    @ResponseBody
    public MessageToInterface addBranchSize(@RequestParam(value="sizeName") String sizeName,@RequestParam(value="sizePid") int sizePid){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/branchSize/add.go] 请求参数为sizeName:[" + sizeName + "] sizePid:[" + sizePid + "]");
        }
        BranchSizeAddReqParam branchSizeAddReqParam = new BranchSizeAddReqParam();
        branchSizeAddReqParam.setBranchSizeName(sizeName);
        branchSizeAddReqParam.setBranchSizePid(sizePid);
        String jsonParam = GsonUtils.toJson(branchSizeAddReqParam);
        return sizeClientService.addBranchSizefTable(jsonParam);
    }

    /**
     * @description 设计元素/尺寸/尺寸子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/branchSize/edit.go")
    @ResponseBody
    public MessageToInterface editBranchSize(@RequestParam(value="sizeBranchId") int sizeBranchId,
                                              @RequestParam(value="sizeBranchName") String sizeBranchName,
                                              @RequestParam(value="sizeName") String sizeName){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/branchSize/edit.go] sizeBranchId:["+sizeBranchId+"] sizeBranchName:["+sizeBranchName+"] sizeName:["+sizeName+"]");
        }
        BranchSizeEditReqParam branchSizeEditReqParam = new BranchSizeEditReqParam();
        branchSizeEditReqParam.setBranchSizeId(sizeBranchId);
        branchSizeEditReqParam.setBranchSizeName(sizeBranchName);
        branchSizeEditReqParam.setBranchSizePid(sizeName);
        String jsonParam = GsonUtils.toJson(branchSizeEditReqParam);
        return sizeClientService.editBranchSizefTable(jsonParam);
    }
    /**
     * 设计元素/工艺
     */
    @Autowired
    CraftClientService craftClientService;
    /**
     * @description 设计元素/工艺/工艺子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/craft.go")
    @ResponseBody
    public CraftfTable getCraft(
            @RequestParam(value="draw") String draw,
            @RequestParam(value="start") String start,
            @RequestParam(value="length") String length,
            @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/craft.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        CraftReqParam craftReqParam = new CraftReqParam();
        craftReqParam.setDraw(Integer.parseInt(draw));
        craftReqParam.setCurrentPage((offSet/limit)+1);
        craftReqParam.setPageSize(limit);
        craftReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(craftReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return craftClientService.getCraft(jsonParam);
    }
    /**
     * @description 设计元素/工艺/工艺子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/craft/delete.go")
    @ResponseBody
    public MessageToInterface deleteCraft(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/craft/delete.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        CraftDeleteReqParam craftDeleteReqParam = new CraftDeleteReqParam();
        craftDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(craftDeleteReqParam);
        return craftClientService.deleteCraft(jsonParam);
    }

    /**
     * @description 设计元素/工艺/工艺子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/craft/add.go")
    @ResponseBody
    public MessageToInterface addCraft(@RequestParam(value="craftName") String craftName,@RequestParam(value="craftDes") String craftDes){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/craft/add.go] 请求参数为craftName:[" + craftName + "] craftDes:[" + craftDes + "]");
        }
        CraftAddReqParam craftAddReqParam = new CraftAddReqParam();
        craftAddReqParam.setCraftName(craftName);
        craftAddReqParam.setCraftDes(craftDes);
        String jsonParam = GsonUtils.toJson(craftAddReqParam);
        return craftClientService.addCraft(jsonParam);
    }

    /**
     * @description 设计元素/工艺/工艺子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/craft/edit.go")
    @ResponseBody
    public MessageToInterface editCraft(@RequestParam(value="craftId") int craftId,
                                        @RequestParam(value="craftName") String craftName,
                                        @RequestParam(value="craftDes") String craftDes){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/craft/edit.go] craftId:["+craftId+"] craftName:["+craftName+"] craftDes:["+craftDes+"]");
        }
        CraftEditReqParam craftEditReqParam = new CraftEditReqParam();
        craftEditReqParam.setCraftId(craftId);
        craftEditReqParam.setCraftName(craftName);
        craftEditReqParam.setCraftDes(craftDes);
        String jsonParam = GsonUtils.toJson(craftEditReqParam);
        return craftClientService.editCraft(jsonParam);
    }
    /**
     * 设计元素/季节
     */
    @Autowired
    SeasonClientService seasonClientService;
    /**
     * @description 设计元素/季节/季节子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/season.go")
    @ResponseBody
    public SeasonfTable getSeason(
            @RequestParam(value="draw") String draw,
            @RequestParam(value="start") String start,
            @RequestParam(value="length") String length,
            @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/season.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        SeasonReqParam seasonReqParam = new SeasonReqParam();
        seasonReqParam.setDraw(Integer.parseInt(draw));
        seasonReqParam.setCurrentPage((offSet/limit)+1);
        seasonReqParam.setPageSize(limit);
        seasonReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(seasonReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return seasonClientService.getSeason(jsonParam);
    }
    /**
     * @description 设计元素/季节/季节子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/season/delete.go")
    @ResponseBody
    public MessageToInterface deleteSeason(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/season/delete.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        SeasonDeleteReqParam seasonDeleteReqParam = new SeasonDeleteReqParam();
        seasonDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(seasonDeleteReqParam);
        return seasonClientService.deleteSeason(jsonParam);
    }

    /**
     * @description 设计元素/季节/季节子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/season/add.go")
    @ResponseBody
    public MessageToInterface addSeason(@RequestParam(value="seasonName") String seasonName){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/season/add.go] 请求参数为seasonName:[" + seasonName + "]");
        }
        SeasonAddReqParam seasonAddReqParam = new SeasonAddReqParam();
        seasonAddReqParam.setSeasonName(seasonName);
        String jsonParam = GsonUtils.toJson(seasonAddReqParam);
        return seasonClientService.addSeason(jsonParam);
    }

    /**
     * @description 设计元素/季节/季节子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/season/edit.go")
    @ResponseBody
    public MessageToInterface editSeason(@RequestParam(value="seasonId") int seasonId,
                                         @RequestParam(value="seasonName") String seasonName){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/season/edit.go] seasonId:["+seasonId+"] seasonName:["+seasonName+"]");
        }
        SeasonEditReqParam seasonEditReqParam = new SeasonEditReqParam();
        seasonEditReqParam.setSeasonId(seasonId);
        seasonEditReqParam.setSeasonName(seasonName);
        String jsonParam = GsonUtils.toJson(seasonEditReqParam);
        return seasonClientService.editSeason(jsonParam);
    }
    /**
     * 设计元素/部位
     */
    @Autowired
    PartClientService partClientService;
    /**
     * @description 设计元素/部位/部位子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/part.go")
    @ResponseBody
    public PartfTable getPart(
            @RequestParam(value="draw") String draw,
            @RequestParam(value="start") String start,
            @RequestParam(value="length") String length,
            @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/part.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        PartReqParam partReqParam = new PartReqParam();
        partReqParam.setDraw(Integer.parseInt(draw));
        partReqParam.setCurrentPage((offSet/limit)+1);
        partReqParam.setPageSize(limit);
        partReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(partReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return partClientService.getPart(jsonParam);
    }
    /**
     * @description 设计元素/部位/部位子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/part/delete.go")
    @ResponseBody
    public MessageToInterface deletePart(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/part/delete.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        PartDeleteReqParam partDeleteReqParam = new PartDeleteReqParam();
        partDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(partDeleteReqParam);
        return partClientService.deletePart(jsonParam);
    }

    /**
     * @description 设计元素/部位/部位子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/part/add.go")
    @ResponseBody
    public MessageToInterface addPart(@RequestParam(value="partName") String partName,@RequestParam(value="partDes") String partDes){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/part/add.go] 请求参数为partName:[" + partName + "] partDes:[" + partDes + "]");
        }
        PartAddReqParam partAddReqParam = new PartAddReqParam();
        partAddReqParam.setPartName(partName);
        partAddReqParam.setPartDes(partDes);
        String jsonParam = GsonUtils.toJson(partAddReqParam);
        return partClientService.addPart(jsonParam);
    }

    /**
     * @description 设计元素/部位/部位子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/part/edit.go")
    @ResponseBody
    public MessageToInterface editPart(@RequestParam(value="partId") int partId,
                                       @RequestParam(value="partName") String partName,
                                       @RequestParam(value="partDes") String partDes){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/part/edit.go] partId:["+partId+"] partName:["+partName+"] partDes:["+partDes+"]");
        }
        PartEditReqParam partEditReqParam = new PartEditReqParam();
        partEditReqParam.setPartId(partId);
        partEditReqParam.setPartName(partName);
        partEditReqParam.setPartDes(partDes);
        String jsonParam = GsonUtils.toJson(partEditReqParam);
        return partClientService.editPart(jsonParam);
    }
    /**
     * 设计元素/单位
     */
    @Autowired
    UnitClientService unitClientService;
    /**
     * @description 设计元素/单位/单位子类表格数据
     */
    @RequestMapping("/mainPage/goDesign/unit.go")
    @ResponseBody
    public UnitfTable getUnit(
            @RequestParam(value="draw") String draw,
            @RequestParam(value="start") String start,
            @RequestParam(value="length") String length,
            @RequestParam(value="search",required = false) String searchParam) {
        if (logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/unit.go]请求 请求参数为draw:[" + draw + "] start:[" + start + "] length:[" + length + "] search:[" + searchParam + "]");
        }
        Integer offSet = Integer.parseInt(start);
        Integer limit = Integer.parseInt(length);
        UnitReqParam unitReqParam = new UnitReqParam();
        unitReqParam.setDraw(Integer.parseInt(draw));
        unitReqParam.setCurrentPage((offSet/limit)+1);
        unitReqParam.setPageSize(limit);
        unitReqParam.setSearchParam(searchParam);
        String jsonParam = GsonUtils.toJson(unitReqParam);
        if (logger.isDebugEnabled()) {
            logger.debug("请求的JSON数据为["+ jsonParam +"]");
        }
        return unitClientService.getUnit(jsonParam);
    }
    /**
     * @description 设计元素/单位/单位子类表格数据删除方法
     */
    @RequestMapping("/mainPage/goDesign/unit/delete.go")
    @ResponseBody
    public MessageToInterface deleteUnit(@RequestParam(value="deleteParam") Integer[] deleteParamArray){
        if(logger.isDebugEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0;i<deleteParamArray.length;i++){
                stringBuilder.append(deleteParamArray[i]+",");
            }
            logger.debug("页面请求[/mainPage/goDesign/unit/delete.go] 请求参数为deleteParam:["+stringBuilder+"]");
        }
        UnitDeleteReqParam unitDeleteReqParam = new UnitDeleteReqParam();
        unitDeleteReqParam.setDeleteArray(deleteParamArray);
        String jsonParam = GsonUtils.toJson(unitDeleteReqParam);
        return unitClientService.deleteUnit(jsonParam);
    }

    /**
     * @description 设计元素/单位/单位子类表格数据新增方法
     */
    @RequestMapping("/mainPage/goDesign/unit/add.go")
    @ResponseBody
    public MessageToInterface addUnit(@RequestParam(value="unitName") String unitName,@RequestParam(value="unitDes") String unitDes){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/mainPage/goDesign/unit/add.go] 请求参数为unitName:[" + unitName + "] unitDes:[" + unitDes + "]");
        }
        UnitAddReqParam unitAddReqParam = new UnitAddReqParam();
        unitAddReqParam.setUnitName(unitName);
        unitAddReqParam.setUnitDes(unitDes);
        String jsonParam = GsonUtils.toJson(unitAddReqParam);
        return unitClientService.addUnit(jsonParam);
    }

    /**
     * @description 设计元素/单位/单位子类表格数据编辑方法
     */
    @RequestMapping("/mainPage/goDesign/unit/edit.go")
    @ResponseBody
    public MessageToInterface editUnit(@RequestParam(value="unitId") int unitId,
                                       @RequestParam(value="unitName") String unitName,
                                       @RequestParam(value="unitDes") String unitDes){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/mainPage/goDesign/unit/edit.go] unitId:["+unitId+"] unitName:["+unitName+"] unitDes:["+unitDes+"]");
        }
        UnitEditReqParam unitEditReqParam = new UnitEditReqParam();
        unitEditReqParam.setUnitId(unitId);
        unitEditReqParam.setUnitName(unitName);
        unitEditReqParam.setUnitDes(unitDes);
        String jsonParam = GsonUtils.toJson(unitEditReqParam);
        return unitClientService.editUnit(jsonParam);
    }
}

