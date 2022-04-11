package com.jiang.blog.service;

import com.jiang.blog.dao.pojo.SysUser;
import com.jiang.blog.vo.Result;
import com.jiang.blog.vo.params.LoginParam;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParams
     * @return
     */
    Result login(LoginParam loginParams);


    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     * @param loginParams
     * @return
     */
    Result register(LoginParam loginParams);
}
