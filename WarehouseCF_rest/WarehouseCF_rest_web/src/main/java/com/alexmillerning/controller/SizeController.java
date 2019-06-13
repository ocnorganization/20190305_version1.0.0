/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.BasicSizeService;
import com.alexmillerning.service.BranchSizeService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.size.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class SizeController {
    static final Logger logger = Logger.getLogger(SizeController.class);
    @Autowired
    BasicSizeService sizeService;
    @Autowired
    BranchSizeService branchSizeService;
    /**
     * 尺寸下拉菜单数据
     * @return
     */
    @RequestMapping("/size/basicSize/dropMenu")
    @ResponseBody
    public SizefDrop getSize(){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/size/basicSize/dropMenu]");
        }
        return sizeService.getSize();
    }

    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/size/branchSize/table")
    @ResponseBody
    public BranchSizefTable getSizeBranch(@RequestBody BranchSizeReqParam branchSizeReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/size/branchSize/table] 请求参数[ colorPid: "+branchSizeReqParam.getSizePid()+" draw: "+branchSizeReqParam.getDraw()+" currentPage: "+branchSizeReqParam.getCurrentPage()+" pageSize: "+branchSizeReqParam.getPageSize()+" searchParam: "+branchSizeReqParam.getSearchParam()+"]");
        }
        return branchSizeService.getBranchSize(branchSizeReqParam.getSizePid(), branchSizeReqParam.getDraw(), branchSizeReqParam.getCurrentPage(), branchSizeReqParam.getPageSize(), branchSizeReqParam.getSearchParam());
    }

    /**
     * 尺寸表格数据
     * @return
     */
    @RequestMapping("/size/branchSize/table/delete")
    @ResponseBody
    public MessageToInterface deleteSizeBranch(@RequestBody BranchSizeDeleteReqParam branchSizeDeleteReqParam){
        Integer[] deleteArray = branchSizeDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/size/branchSize/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = branchSizeService.deleteBranchSizeById(deleteArray[i]);
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

    @RequestMapping("/size/branchSize/table/add")
    @ResponseBody
    public MessageToInterface addBrunchColor(@RequestBody BranchSizeAddReqParam branchSizeAddReqParam){
        if(logger.isDebugEnabled()) {
            logger.debug("页面请求[/size/branchSize/table/add] 请求参数为branchSizeName:[" + branchSizeAddReqParam.getBranchSizeName() + "] branchSizePid:[" + branchSizeAddReqParam.getBranchSizePid() + "]");
        }
        int flag = branchSizeService.addBranchSize(branchSizeAddReqParam.getBranchSizePid(), branchSizeAddReqParam.getBranchSizeName());
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增尺码成功!");
        }else{
            messageToInterface.setResultMessage("新增尺码失败!");
        }
        return messageToInterface;
    }

    @RequestMapping("/size/branchSize/table/edit")
    @ResponseBody
    public MessageToInterface editBrunchColor(@RequestBody BranchSizeEditReqParam branchSizeEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/rest/size/branchSize/table/edit] 请求参数branchSizeId:["+branchSizeEditReqParam.getBranchSizeId()+"] branchSizeName:["+branchSizeEditReqParam.getBranchSizeName()+"] branchSizePid:["+branchSizeEditReqParam.getBranchSizePid()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        int flag = branchSizeService.editBranchSize(branchSizeEditReqParam.getBranchSizeId(), branchSizeEditReqParam.getBranchSizeName(), branchSizeEditReqParam.getBranchSizePid());
        if(flag != 0){
            messageToInterface.setResultMessage("更新成功");
        }else{
            messageToInterface.setResultMessage("更新失败");
        }
        return messageToInterface;
    }
}
