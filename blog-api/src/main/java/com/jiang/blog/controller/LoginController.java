package com.jiang.blog.controller;

import com.jiang.blog.service.LoginService;
import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping
    public Result login(@RequestBody LoginParam loginParams){
        //登录 验证用户
        return loginService.login(loginParams);


    }
}
