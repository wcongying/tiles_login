package com.nicole.tileslogin;

import com.whalin.MemCached.MemCachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:memcached.xml"})
public class MemcacheTest {
    //从classpath:memcached.xml得到
    @Autowired
    MemCachedClient memCachedClient;

    @Test
    public void setGetTest(){
        //插入方法有三种
        //1.set方法，如果key值已存在则直接覆盖重写。
        memCachedClient.set("username",12);
        memCachedClient.set("username",23);
        System.out.println("Result : "+memCachedClient.get("username"));
    }

    @Test
    public void addTest(){
        //2.add方法,这种方式只会添加，如果key已存在则返回false，添加不成功
        memCachedClient.add("username",45);

        System.out.println("Result : "+ memCachedClient.add("username",54));

    }

    @Test
    public void replaceTest(){
        memCachedClient.add("username","abc");
        //3把key对应的value替换
        memCachedClient.replace("username","def");
        System.out.println("Result : "+memCachedClient.get("username"));
    }

    @Test
    public void deleteTest(){
        memCachedClient.set("username","g12");
        System.out.println("Result : "+memCachedClient.get("username"));
        memCachedClient.delete("username");
        System.out.println("Result : "+memCachedClient.get("username"));
    }
}
