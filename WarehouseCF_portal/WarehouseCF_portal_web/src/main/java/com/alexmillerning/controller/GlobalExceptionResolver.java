/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.controller;

import com.alexmillerning.exception.BusinessRuntimeException;
import com.alexmillerning.utils.pojo.exception.ExceptionMsg;
import com.alexmillerning.utils.pojo.exception.ResultCode;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionResolver {
    static final Logger logger = Logger.getLogger(GlobalExceptionResolver.class);
    /**
     * 处理所有不可知异常
     *
     * @param e 异常
     * @return json结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ExceptionMsg handleException(Exception e) {
        // 打印异常堆栈信息
        logger.error(e.getMessage(),e);
        return ExceptionMsg.of(ResultCode.UNKNOWN_ERROR);
    }

    /**
     * 处理所有业务异常
     *
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessRuntimeException.class)
    @ResponseBody
    public ExceptionMsg handleOpdRuntimeException(BusinessRuntimeException e) {
        // 不打印异常堆栈信息
        logger.error(e.getMessage());
        return ExceptionMsg.of(e.getResultCode());
    }
}
