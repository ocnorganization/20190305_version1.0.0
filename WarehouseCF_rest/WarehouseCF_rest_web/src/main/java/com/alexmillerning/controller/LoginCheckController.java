/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.LoginCheckService;
import com.alexmillerning.utils.pojo.login.LoginReqParam;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/login")
public class LoginCheckController {
    static final Logger logger = Logger.getLogger(LoginCheckController.class);
    @Autowired
    LoginCheckService loginCheckService;
    @RequestMapping("/loginCheck")
    @ResponseBody
    public boolean loginCheck(@RequestBody LoginReqParam loginReqParam){
        if(logger.isDebugEnabled()){
            logger.debug("客户端PORTAL请求[/rest/login/loginCheck] 请求参数[ staffID: "+loginReqParam.getStaffID()+" staffID: "+loginReqParam.getStaffPassword()+"]");
        }
        return loginCheckService.loginCheck(loginReqParam.getStaffID(), loginReqParam.getStaffPassword());
    }

}
