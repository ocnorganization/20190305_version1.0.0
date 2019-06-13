/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.SeasonService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.Season.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class SeasonController {
    static final Logger logger = Logger.getLogger(SeasonController.class);
    @Autowired
    SeasonService seasonService;
    @RequestMapping("/season/table")
    @ResponseBody
    public SeasonfTable getSeason(@RequestBody SeasonReqParam seasonReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/season/table] 请求参数[ draw: "+seasonReqParam.getDraw()+" currentPage: "+seasonReqParam.getCurrentPage()+" pageSize: "+seasonReqParam.getPageSize()+" searchParam: "+seasonReqParam.getSearchParam()+"]");
        }
        return seasonService.getSeason(seasonReqParam.getDraw(), seasonReqParam.getCurrentPage(), seasonReqParam.getPageSize(), seasonReqParam.getSearchParam());
    }
    @RequestMapping("/season/table/delete")
    @ResponseBody
    public MessageToInterface deleteSeason(@RequestBody SeasonDeleteReqParam seasonDeleteReqParam){
        Integer[] deleteArray = seasonDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/season/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = seasonService.deleteSeason(deleteArray[i]);
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

    @RequestMapping("/season/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody SeasonAddReqParam seasonAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/season/table/add] 请求参数为seasonName:[" + seasonAddReqParam.getSeasonName() + "]");
        }
        int flag = seasonService.addSeason(seasonAddReqParam.getSeasonName());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增季节成功!");
        }else{
            messageToInterface.setResultMessage("新增季节失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/season/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody SeasonEditReqParam seasonEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/season/table/edit] 请求参数seasonId:["+seasonEditReqParam.getSeasonId()+"] seasonName:["+seasonEditReqParam.getSeasonName()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        int flag = seasonService.editSeason(seasonEditReqParam.getSeasonId(), seasonEditReqParam.getSeasonName());
        if(flag != 0){
            messageToInterface.setResultMessage("更新成功");
        }else{
            messageToInterface.setResultMessage("更新失败");
        }
        return messageToInterface;
    }
}
