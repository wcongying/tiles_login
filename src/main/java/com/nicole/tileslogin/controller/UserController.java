package com.nicole.tileslogin.controller;

import com.nicole.tileslogin.entity.User;
import com.nicole.tileslogin.service.UserService;
import com.nicole.tileslogin.util.CookieUtil;
import com.nicole.tileslogin.util.JWTUtil;
import com.nicole.tileslogin.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-08-28 18:56:37
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginSuccessful", method = RequestMethod.GET)
    public String LoginSuccessful() {
        return "loginSuccessful";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(HttpServletRequest request, Model model, HttpServletResponse response) {

        //获取用户传入的账号密码
        String username = request.getParameter("username");
        String out_password = request.getParameter("password");

        User user = userService.selectByUsername(username);

        //验证该用户是否存在，如果不存在用户名，无法验证
        if (user != null ) {
            //数据库中存储的已经加密的密码
            String md5Str= user.getPassword();

            //判断输入的密码和数据库密码是否一致.MD5的getSaltverifyMD5做一个还原方法,判断是不是相等。
            //这里用的MD5不用存储salt，是逆向运算回去得到原来随机的salt。
            boolean flag=MD5Util.getSaltverifyMD5(out_password,md5Str);

            if (flag) {
                //生成token
                String token = JWTUtil.getJWT(String.valueOf(user.getId()), user.getUsername(),
                        new Date(), "3456");
                //把token装到cookie中发送到客户端
                CookieUtil.setCookie(response, "token", token, 60 * 10);
                return "redirect:loginSuccessful";
            } else {
                model.addAttribute("msg", "wrong password");
                return "login";
            }
        } else {
            model.addAttribute("msg", "no username");
            return "login";
        }

    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

}