package com.nicole.tileslogin;

import com.nicole.tileslogin.entity.Profession;
import com.nicole.tileslogin.entity.User;
import com.nicole.tileslogin.service.UserService;
import com.nicole.tileslogin.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    @Transactional
    @Rollback(true)
    public void queryOneTest(){
        User user =  userService.selectByUsername("firstUser");
        if( null != user) {
            System.out.println( user.getId() + "  name   " + user.getUsername());
        }
    }

    /**
     * 只增加一次，增加一个可以登录的user，用约定的md5加密
     */
    @Test
    public void addUser() {
        User user = new User();
        user.setCreatedAt( 34838747L );
        user.setUpdatedAt( 34838747L );
        user.setUsername("nicole");
        user.setPassword(MD5Util.getMD5Str("abcd1234"));
        userService.insert(user);
    }
}
