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
     * token验证错误0x3开头
     */
    /**
     * token生成失败
     */
    TOKENCREATE_ERROR("0x30003", "token生成失败"),
    /**
     * token验证失败
     */
    TOKENVERIFY_ERROR("0x30004", "token验证失败"),
    /**
     * token为空
     */
    TOKENNULL_ERROR("0x30005", "token为空"),
    /**
     * token与用户不匹配
     */
    TOKENUNMATCH_ERROR("0x30006", "token与用户不匹配"),
    /**
     * 用户权限错误0x2开头
     */
    /**
     * 用户权限不足
     */
    USERPOWER_ERROR("0x2000", "用户权限不足"),
    /**
     * 用户名或密码错误
     */
    USERINFO_ERROR("0x20002", "用户名或密码错误"),
    /**
     * 回话超时0x4
     */
    SESSIONEXP_ERROR("0x40002", "会话超时,请重新登录");
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
