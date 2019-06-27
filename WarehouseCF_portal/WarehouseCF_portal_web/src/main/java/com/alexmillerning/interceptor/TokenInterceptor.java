/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.interceptor;

import com.alexmillerning.exception.BusinessRuntimeException;
import com.alexmillerning.utils.jwt.JWTUtils;
import com.alexmillerning.utils.pojo.exception.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class TokenInterceptor implements HandlerInterceptor {
    static final Logger logger = Logger.getLogger(TokenInterceptor.class);
    @Override
//    @ExceptionHandler
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler){
        if(logger.isDebugEnabled()){
            logger.debug("进入拦截器,开始校验");
        }
        String token = request.getParameter("tokenObj");
        String staffID = request.getParameter("staffID");
        if(logger.isDebugEnabled()){
            logger.debug("staffID:["+staffID+"] token:["+token+"]");
        }
        Map<String, String> flag = null;
        flag = JWTUtils.verifyToken(token);
        if(null != flag){
            if(staffID.equals(flag.get("userName"))){
                return true;
            }else {
                //需要写全局异常
                return false;
            }
        }else {
//            throw new JWTVerificationException("token验证失败");
            throw new BusinessRuntimeException(ResultCode.TOKENVERIFY_ERROR);
//            return false;
        }
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
