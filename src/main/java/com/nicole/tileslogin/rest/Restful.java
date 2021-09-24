package com.nicole.tileslogin.rest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
public class Restful {
    public static Map<String, Object> set(int code, String msg, Object o){
        Map<String, Object> restful = new HashMap<>();
        restful.put("code" , code);
        restful.put("msg" , msg);
        restful.put("Object", o);
        return restful;
    }

    public static Map<String, Object> set(int code, String msg){
        Map<String, Object> restful = new HashMap<>();
        restful.put("code" , code);
        restful.put("msg" , msg);
        return restful;
    }
}

