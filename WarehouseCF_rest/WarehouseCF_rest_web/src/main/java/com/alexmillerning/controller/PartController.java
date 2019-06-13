/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.PartService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.part.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class PartController {
    static final Logger logger = Logger.getLogger(PartController.class);
    @Autowired
    PartService partService;
    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/part/table")
    @ResponseBody
    public PartfTable getPart(@RequestBody PartReqParam partReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/part/table] 请求参数[ draw: "+partReqParam.getDraw()+" currentPage: "+partReqParam.getCurrentPage()+" pageSize: "+partReqParam.getPageSize()+" searchParam: "+partReqParam.getSearchParam()+"]");
        }
        return partService.getPart(partReqParam.getDraw(), partReqParam.getCurrentPage(), partReqParam.getPageSize(), partReqParam.getSearchParam());
    }

    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/part/table/delete")
    @ResponseBody
    public MessageToInterface deletePart(@RequestBody PartDeleteReqParam partDeleteReqParam){
        Integer[] deleteArray = partDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/part/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = partService.deletePart(deleteArray[i]);
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

    @RequestMapping("/part/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody PartAddReqParam partAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/part/table/add] 请求参数为partName:[" + partAddReqParam.getPartName() + "] partDes:[" + partAddReqParam.getPartDes() + "]");
        }
        int flag = partService.addPart(partAddReqParam.getPartName(), partAddReqParam.getPartDes());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增工艺成功!");
        }else{
            messageToInterface.setResultMessage("新增工艺失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/part/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody PartEditReqParam partEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/part/table/edit] 请求参数partId:["+partEditReqParam.getPartId()+"] partName:["+partEditReqParam.getPartName()+"] partDes:["+partEditReqParam.getPartDes()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        int flag = partService.editPart(partEditReqParam.getPartId(), partEditReqParam.getPartName(), partEditReqParam.getPartDes());
        if(flag != 0){
            messageToInterface.setResultMessage("更新成功");
        }else{
            messageToInterface.setResultMessage("更新失败");
        }
        return messageToInterface;
    }
}
