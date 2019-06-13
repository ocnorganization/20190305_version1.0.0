/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.CraftService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.craft.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class CraftController {
    static final Logger logger = Logger.getLogger(CraftController.class);
    @Autowired
    CraftService craftService;
    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/craft/table")
    @ResponseBody
    public CraftfTable getCraft(@RequestBody CraftReqParam craftReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/craft/table] 请求参数[ draw: "+craftReqParam.getDraw()+" currentPage: "+craftReqParam.getCurrentPage()+" pageSize: "+craftReqParam.getPageSize()+" searchParam: "+craftReqParam.getSearchParam()+"]");
        }
        return craftService.getCraft(craftReqParam.getDraw(), craftReqParam.getCurrentPage(), craftReqParam.getPageSize(), craftReqParam.getSearchParam());
    }

    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/craft/table/delete")
    @ResponseBody
    public MessageToInterface deleteCraft(@RequestBody CraftDeleteReqParam craftDeleteReqParam){
        Integer[] deleteArray = craftDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/craft/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = craftService.deleteCraft(deleteArray[i]);
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

    @RequestMapping("/craft/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody CraftAddReqParam craftAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/craft/table/add] 请求参数为craftName:[" + craftAddReqParam.getCraftName() + "] craftDes:[" + craftAddReqParam.getCraftDes() + "]");
        }
        int flag = craftService.addCraft(craftAddReqParam.getCraftName(), craftAddReqParam.getCraftDes());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增工艺成功!");
        }else{
            messageToInterface.setResultMessage("新增工艺失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/craft/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody CraftEditReqParam craftEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/craft/table/add] 请求参数craftId:["+craftEditReqParam.getCraftId()+"] craftName:["+craftEditReqParam.getCraftName()+"] craftDes:["+craftEditReqParam.getCraftDes()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        int flag = craftService.editCraft(craftEditReqParam.getCraftId(), craftEditReqParam.getCraftName(), craftEditReqParam.getCraftDes());
        if(flag != 0){
            messageToInterface.setResultMessage("更新成功");
        }else{
            messageToInterface.setResultMessage("更新失败");
        }
        return messageToInterface;
    }
}
