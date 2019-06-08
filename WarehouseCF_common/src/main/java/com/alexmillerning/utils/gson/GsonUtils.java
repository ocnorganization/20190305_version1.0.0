/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {
    private static Gson gson = null;
    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
    }
    public static String toJson(Object object){
        return gson.toJson(object);
    }

    public static <T> T fromJson(String json, Class<T> clazz){
        return gson.fromJson(json, clazz);
    }
}
