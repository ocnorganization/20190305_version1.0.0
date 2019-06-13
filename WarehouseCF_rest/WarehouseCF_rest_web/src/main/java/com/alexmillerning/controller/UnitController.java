/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.UnitService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.unit.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class UnitController {
    static final Logger logger = Logger.getLogger(UnitController.class);
    @Autowired
    UnitService unitService;
    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/unit/table")
    @ResponseBody
    public UnitfTable getUnit(@RequestBody UnitReqParam unitReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/unit/table] 请求参数[ draw: "+unitReqParam.getDraw()+" currentPage: "+unitReqParam.getCurrentPage()+" pageSize: "+unitReqParam.getPageSize()+" searchParam: "+unitReqParam.getSearchParam()+"]");
        }
        return unitService.getUnit(unitReqParam.getDraw(), unitReqParam.getCurrentPage(), unitReqParam.getPageSize(), unitReqParam.getSearchParam());
    }

    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/unit/table/delete")
    @ResponseBody
    public MessageToInterface deleteUnit(@RequestBody UnitDeleteReqParam unitDeleteReqParam){
        Integer[] deleteArray = unitDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/unit/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = unitService.deleteUnit(deleteArray[i]);
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

    @RequestMapping("/unit/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody UnitAddReqParam unitAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/unit/table/add] 请求参数为unitName:[" + unitAddReqParam.getUnitName() + "] unitDes:[" + unitAddReqParam.getUnitDes() + "]");
        }
        int flag = unitService.addUnit(unitAddReqParam.getUnitName(), unitAddReqParam.getUnitDes());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增工艺成功!");
        }else{
            messageToInterface.setResultMessage("新增工艺失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/unit/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody UnitEditReqParam unitEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/unit/table/add] 请求参数unitId:["+unitEditReqParam.getUnitId()+"] unitName:["+unitEditReqParam.getUnitName()+"] unitDes:["+unitEditReqParam.getUnitDes()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        int flag = unitService.editUnit(unitEditReqParam.getUnitId(), unitEditReqParam.getUnitName(), unitEditReqParam.getUnitDes());
        if(flag != 0){
            messageToInterface.setResultMessage("更新成功");
        }else{
            messageToInterface.setResultMessage("更新失败");
        }
        return messageToInterface;
    }
}
