/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.BrandService;
import com.alexmillerning.utils.pojo.MessageToInterface;
import com.alexmillerning.utils.pojo.design.brand.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/design")
public class BrandController {
    static final Logger logger = Logger.getLogger(BrandController.class);
    @Autowired
    BrandService brandService;
    @RequestMapping("/brand/table")
    @ResponseBody
    public BrandfTable getBrand(@RequestBody BrandReqParam brandReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/brand/table] 请求参数draw:["+brandReqParam.getDraw()+"] currentPage:["+brandReqParam.getCurrentPage()+"] pageSize:["+brandReqParam.getPageSize()+"] searchParam:["+brandReqParam.getSearchParam()+"]");
        }
        return brandService.getBrand(brandReqParam.getDraw(),brandReqParam.getCurrentPage(),brandReqParam.getPageSize(),brandReqParam.getSearchParam());
    }
    @RequestMapping("/brand/table/delete")
    @ResponseBody
    public MessageToInterface deleteBrand(@RequestBody BrandDeleteReqParam brandDeleteReqParam){
        Integer[] deleteArray = brandDeleteReqParam.getDeleteArray();
        if(logger.isDebugEnabled()){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < deleteArray.length; i++){
                stringBuilder.append(deleteArray[i]+",");
            }
            logger.debug("客户端PORTAL请求[/rest/brand/table/delete] 请求参数[ deleteArray: "+stringBuilder+"]");
        }
        int flag = -1;
        for(int i =0;i<deleteArray.length;i++){
            int result = brandService.deleteBrand(deleteArray[i]);
            if(result == 0){
                flag = i;
                break;
            }
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag != -1){
            messageToInterface.setResultMessage("删除第["+flag+"]数据出错!终止后续删除!");
            return messageToInterface;
        }else{
            messageToInterface.setResultMessage("删除成功!");
            return messageToInterface;
        }

    }
    @RequestMapping("/brand/table/add")
    @ResponseBody
    public MessageToInterface addBrand(@RequestBody BrandAddReqParam brandAddReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/brand/table/add] 请求参数 brandName:["+brandAddReqParam.getBrandName()+"] brandDes:["+brandAddReqParam.getBrandDes()+"]");
        }
        int flag = brandService.addBrand(brandAddReqParam.getBrandName(), brandAddReqParam.getBrandDes());

        MessageToInterface messageToInterface = new MessageToInterface();
        if(flag > 0){
            messageToInterface.setResultMessage("新增颜色成功!");
            return messageToInterface;
        }else{
            messageToInterface.setResultMessage("新增颜色失败!");
            return messageToInterface;
        }
    }
    @RequestMapping("/brand/table/edit")
    @ResponseBody
    public MessageToInterface editBrand(@RequestBody BrandEditReqParam brandEditReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/brand/table/edit] 请求参数brandId:["+brandEditReqParam.getBrandId()+"] brandName:["+brandEditReqParam.getBrandName()+"] brandDes:["+brandEditReqParam.getBrandDes()+"]");
        }
        MessageToInterface messageToInterface = new MessageToInterface();
        if(null != brandEditReqParam.getBrandId()&&!("".equals(brandEditReqParam.getBrandId()))){
            int flag = brandService.editBrand(Integer.parseInt(brandEditReqParam.getBrandId()), brandEditReqParam.getBrandName(), brandEditReqParam.getBrandDes());
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
