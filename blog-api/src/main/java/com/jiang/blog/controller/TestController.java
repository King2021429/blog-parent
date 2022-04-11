package com.jiang.blog.controller;

import com.jiang.blog.dao.pojo.SysUser;
import com.jiang.blog.utils.UserThreadLocal;
import com.jiang.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
