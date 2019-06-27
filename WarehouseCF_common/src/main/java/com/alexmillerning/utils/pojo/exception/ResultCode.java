/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.pojo.exception;

public enum ResultCode {
//    SUCCESS,UNKNOWN_ERROR,USERINFO_ERROR,TOKENCREATE_ERROR,TOKENVERIFY_ERROR;
    /**
     * 成功
     */
    SUCCESS("000000", "成功"),
    /**
     * 未知错误
     */
    UNKNOWN_ERROR("0x10001", "未知错误"),
    /**
     * 用户名或密码错误
     */
    USERINFO_ERROR("0x10002", "用户名或密码错误"),
    /**
     * token生成失败
     */
    TOKENCREATE_ERROR("0x10003", "token生成失败"),
    /**
     * token验证失败
     */
    TOKENVERIFY_ERROR("0x10004", "token验证失败"),
    /**
     * token验证失败
     */
    USERPOWER_ERROR("0x10005", "用户权限不足");
//    TOKENVERIFY_ERROR("0x10004", "token校验失败");
    /**
     * 结果码
     */
    private String code;
    /**
     * 结果码描述
     */
    private String msg;
    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
