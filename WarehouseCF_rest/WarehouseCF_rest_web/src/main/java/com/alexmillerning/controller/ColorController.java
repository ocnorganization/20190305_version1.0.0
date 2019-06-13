/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.BasicColorService;
import com.alexmillerning.service.BrunchColorService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.color.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class ColorController {
    static final Logger logger = Logger.getLogger(ColorController.class);
    @Autowired
    BasicColorService basicColorService;
    @Autowired
    BrunchColorService brunchColorService;
    @RequestMapping("/color/basicColor/dropMenu")
    @ResponseBody
    public BasicColorfDrop getBasicColor(){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/color/basicColor/dropMenu]");
        }
        return basicColorService.getBasicColor();
    }
    @RequestMapping("/color/brunchColor/table")
    @ResponseBody
    public BrunchColorfTable getBrunchColor(@RequestBody BrunchColorReqParam brunchColorReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/color/brunchColor/table] 请求参数[ colorPid: "+brunchColorReqParam.getColorPid()+" draw: "+brunchColorReqParam.getDraw()+" currentPage: "+brunchColorReqParam.getCurrentPage()+" pageSize: "+brunchColorReqParam.getPageSize()+" searchParam: "+brunchColorReqParam.getSearchParam()+"]");
        }
        return brunchColorService.getBrunchColorByPage(brunchColorReqParam.getColorPid(), brunchColorReqParam.getDraw(), brunchColorReqParam.getCurrentPage(), brunchColorReqParam.getPageSize(), brunchColorReqParam.getSearchParam());
    }
    @RequestMapping("/color/brunchColor/table/delete")
    @ResponseBody
    public MessageToInterface deleteBrunchColor(@RequestBody BrunchColorDeleteReqParam brunchColorDeleteReqParam){
        Integer[] deleteArray = brunchColorDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/color/brunchColor/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = brunchColorService.deleteBrunchColorById(deleteArray[i]);
            if(result == 0){
                flag = i;
                break;
            }
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag != -1){
            messageToInterface.setResultMessage("删除第["+flag+"]数据出错!终止后续删除!");
        }else{
            messageToInterface.setResultMessage("删除成功!");
        }
        return messageToInterface;
    }
    @RequestMapping("/color/brunchColor/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody BrunchColorAddReqParam brunchColorAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/rest/color/brunchColor/table/add] 请求参数为colorName:[" + brunchColorAddReqParam.getColorName() + "] colorPid:[" + brunchColorAddReqParam.getColorPid() + "]");
        }
        int flag = brunchColorService.addBrunchColor(brunchColorAddReqParam.getColorPid(), brunchColorAddReqParam.getColorName());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增颜色成功!");
        }else{
            messageToInterface.setResultMessage("新增颜色失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/color/brunchColor/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody BrunchColorEditReqParam brunchColorEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/color/brunchColor/table/edit] 请求参数colorBranchId:["+brunchColorEditReqParam.getColorBranchId()+"] colorBranchName:["+brunchColorEditReqParam.getColorBranchName()+"] colorName:["+brunchColorEditReqParam.getColorName()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        if(null != brunchColorEditReqParam.getColorBranchId()&&!("".equals(brunchColorEditReqParam.getColorBranchId()))){
            int flag = brunchColorService.editBrunchColor(Integer.parseInt(brunchColorEditReqParam.getColorBranchId()), brunchColorEditReqParam.getColorBranchName(), brunchColorEditReqParam.getColorName());
            if(flag != 0){
                messageToInterface.setResultMessage("更新成功");
            }else{
                messageToInterface.setResultMessage("更新失败");
            }
        }else{
            messageToInterface.setResultMessage("关键参数为空,不进行数据库更新");
        }
        return messageToInterface;
    }
}
