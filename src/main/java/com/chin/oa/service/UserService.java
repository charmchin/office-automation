package com.chin.oa.service;

import com.chin.oa.entity.User;
import com.chin.oa.mapper.UserMapper;
import com.chin.oa.service.exception.LoginException;
import com.chin.oa.utils.Md5Utils;

public class UserService {//遵循MVC，写业务逻辑类
    private UserMapper userMapper = new UserMapper();

    /**
     * 根据前台输入进行登录校验
     * @param username 前台输入
     * @param password
     * @return校验通过后，包含对应用户数据的User实体类
     * throws LoginException 自定义用户登录异常
     */
    public User checkLogin(String username , String password){
        User user = userMapper.selectByUsername(username);
        if(user == null){
            throw new LoginException("用户名不存在");
        }
        String md5 = Md5Utils.md5Digest(password, user.getSalt());
        if (!md5.equals(user.getPassword())) {
            throw new LoginException("密码错误");
        }
        return user;
    }
}
