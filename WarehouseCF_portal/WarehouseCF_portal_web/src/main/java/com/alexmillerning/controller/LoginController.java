/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.service.login.LoginCheckClientService;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.jwt.JWTUtils;
import com.alexmillerning.utils.pojo.login.LoginReqParam;
import com.alexmillerning.utils.pojo.login.LoginResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    static final Logger logger = Logger.getLogger(LoginController.class);
    @Autowired
    LoginCheckClientService loginCheckClientService;
    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
    @RequestMapping("/login/ckeck.go")
    @ResponseBody
    public LoginResult requestIndex(@RequestParam(value="userName") int userName, @RequestParam(value="passWord") String passWord){
        if(logger.isDebugEnabled()){
            logger.debug("页面请求[/login/ckeck.go]");
            logger.debug("请求参数: userName:["+userName+"] passWord:["+passWord+"]");
        }
        LoginReqParam loginReqParam = new LoginReqParam();
        loginReqParam.setStaffID(userName);
        loginReqParam.setStaffPassword(passWord);
        String jsonParam = GsonUtils.toJson(loginReqParam);
        boolean flag = loginCheckClientService.loginCheck(jsonParam);
        if(logger.isDebugEnabled()){
            logger.debug("用户名密码校验结果:["+flag+"]");
        }
        LoginResult loginResult = new LoginResult();
        if(flag){
            Map<String, String> claim = new HashMap<>();
            claim.put("userName", String.valueOf(userName));
            String token ="";
            try {
                token = JWTUtils.createToken(claim);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(logger.isDebugEnabled()){
                logger.debug("tokenStr:["+token+"]");
            }
            loginResult.setTokenObj(token);
        }
        loginResult.setResultMessage(flag);
        return loginResult;
    }
}
