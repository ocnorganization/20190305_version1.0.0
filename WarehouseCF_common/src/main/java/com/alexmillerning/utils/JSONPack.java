/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONPack {
    static final Logger logger = Logger.getLogger(JSONPack.class);
    public static JSONObject pack(String key,List list){
        JSONArray jsonArray = new JSONArray(new ArrayList<>(list));
        Map<String,Object> json = new HashMap<String ,Object>();
        json.put(key,jsonArray);
        JSONObject jsonObject = new JSONObject(json);
        if(logger.isDebugEnabled()){
            logger.debug("组包后的JSON对象为:["+jsonObject+"]");
        }
        return jsonObject;
    }
    public static JSONObject packbyPage(int draw,int recordsTotal,int recordsFiltered,List list){
        JSONArray jsonArray = new JSONArray(new ArrayList<>(list));
        Map<String,Object> json = new HashMap<String ,Object>();
        json.put("draw",draw);
        json.put("recordsTotal",recordsTotal);
        json.put("recordsFiltered",recordsFiltered);
        json.put("data",jsonArray);
        JSONObject jsonObject = new JSONObject(json);
        if(logger.isDebugEnabled()){
            logger.debug("组包后的JSON对象为:["+jsonObject+"]");
        }
        return jsonObject;
    }

    public static JSONObject packe(boolean flag,String message){
        Map<String,Object> json = new HashMap<String ,Object>();
        if(flag){
            json.put("success",message);
        }else {
            json.put("error",message);
        }
        JSONObject jsonObject = new JSONObject(json);
        if(logger.isDebugEnabled()){
            logger.debug("组包后的JSON对象为:["+jsonObject+"]");
        }
        return jsonObject;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("11111111111");
        packbyPage(1,2,2,list);

    }
}
