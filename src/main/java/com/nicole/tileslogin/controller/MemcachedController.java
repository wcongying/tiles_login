package com.nicole.tileslogin.controller;

import com.whalin.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/memcached")
public class MemcachedController {

//    @Autowired
//    private MemCachedClient memCachedClient;
//
//    @RequestMapping(value = "/load", method = RequestMethod.GET)
//    public void setMemcachedServer(){
//        Boolean target=memCachedClient.set("key", "nicole");
//        System.out.println("memcached load ok ："+target);
//
//        String result =(String)memCachedClient.get("key");
//        System.out.println("memcached get result ："+result);
//        memCachedClient.delete("key");
//    }
}

