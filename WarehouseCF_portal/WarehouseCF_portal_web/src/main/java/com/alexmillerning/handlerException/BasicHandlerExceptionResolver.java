/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.handlerException;

import com.alexmillerning.exception.BusinessRuntimeException;
import com.alexmillerning.utils.gson.GsonUtils;
import com.alexmillerning.utils.pojo.exception.ExceptionMsg;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 警告:该类未使用
 */
public class BasicHandlerExceptionResolver implements HandlerExceptionResolver {
    static final Logger logger = Logger.getLogger(BasicHandlerExceptionResolver.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        if(ex instanceof BusinessRuntimeException){
            if(logger.isDebugEnabled()){
                logger.debug("返回的错误信息为："+ex.getMessage());
            }
            ExceptionMsg exceptionMsg = ExceptionMsg.of(((BusinessRuntimeException)ex).getResultCode());
            response.setContentType("text/html;charset=utf-8");
            try {
                response.getWriter().print(GsonUtils.toJson(exceptionMsg));
            } catch (IOException e) {
                e.printStackTrace();
            }
//        String json = "{\"msg\":\"测试\"}";
//        response.setContentType("text/html;charset=utf-8");
//        try {
//            response.getWriter().print(json);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }

//    private ModelAndView specialExceptionResolve(Exception ex, HttpServletRequest request){
//        try {
//            if (ex instanceof NoSuchRequestHandlingMethodException
//                    || ex instanceof NoHandlerFoundException) {
//                return result(HttpExceptionEnum.NOT_FOUND_EXCEPTION, request);
//            }
//            else if (ex instanceof HttpRequestMethodNotSupportedException) {
//                return result(HttpExceptionEnum.NOT_SUPPORTED_METHOD_EXCEPTION, request);
//            }
//            else if (ex instanceof HttpMediaTypeNotSupportedException) {
//                return result(HttpExceptionEnum.NOT_SUPPORTED_MEDIA_TYPE_EXCEPTION, request);
//            }
//            else if (ex instanceof HttpMediaTypeNotAcceptableException) {
//                return result(HttpExceptionEnum.NOT_ACCEPTABLE_MEDIA_TYPE_EXCEPTION, request);
//            }
//            else if (ex instanceof MissingPathVariableException) {
//                return result(HttpExceptionEnum.NOT_SUPPORTED_METHOD_EXCEPTION, request);
//            }
//            else if (ex instanceof MissingServletRequestParameterException) {
//                return result(HttpExceptionEnum.MISSING_REQUEST_PARAMETER_EXCEPTION, request);
//            }
//            else if (ex instanceof ServletRequestBindingException) {
//                return result(HttpExceptionEnum.REQUEST_BINDING_EXCEPTION, request);
//            }
//            else if (ex instanceof ConversionNotSupportedException) {
//                return result(HttpExceptionEnum.NOT_SUPPORTED_CONVERSION_EXCEPTION, request);
//            }
//            else if (ex instanceof TypeMismatchException) {
//                return result(HttpExceptionEnum.TYPE_MISMATCH_EXCEPTION, request);
//            }
//            else if (ex instanceof HttpMessageNotReadableException) {
//                return result(HttpExceptionEnum.MESSAGE_NOT_READABLE_EXCEPTION, request);
//            }
//            else if (ex instanceof HttpMessageNotWritableException) {
//                return result(HttpExceptionEnum.MESSAGE_NOT_WRITABLE_EXCEPTION, request);
//            }
//            else if (ex instanceof MethodArgumentNotValidException) {
//                return result(HttpExceptionEnum.NOT_VALID_METHOD_ARGUMENT_EXCEPTION, request);
//            }
//            else if (ex instanceof MissingServletRequestPartException) {
//                return result(HttpExceptionEnum.MISSING_REQUEST_PART_EXCEPTION, request);
//            }
//            else if (ex instanceof BindException) {
//                return result(HttpExceptionEnum.BIND_EXCEPTION, request);
//            }
//            else if (ex instanceof AsyncRequestTimeoutException) {
//                return result(HttpExceptionEnum.ASYNC_REQUEST_TIMEOUT_EXCEPTION, request);
//            }
//        } catch (Exception handlerException) {
//            logger.warn("Handling of [" + ex.getClass().getName() + "] resulted in Exception", handlerException);
//        }
//        return null;
//    }
}
