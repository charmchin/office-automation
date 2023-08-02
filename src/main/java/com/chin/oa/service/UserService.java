package com.chin.oa.service;

import com.chin.oa.entity.User;
import com.chin.oa.mapper.UserMapper;
import com.chin.oa.service.exception.LoginException;

public class UserService {
    private UserMapper userMapper = new UserMapper();

    /**
     * 根据前台输入进行登录校验
     * @param username
     * @param password
     * @return校验通过后，包含对应用户数据的User实体类
     */
    public User checkLogin(String username , String password){
        User user = userMapper.selectByUsername(username);
        if(user == null){
            throw new LoginException("用户名不存在");
        }
//        String md5 = Md5Utils.md5Digest(password, user.getSalt());
//        if(!md5.equals(user.getPassword())){
//            throw new LoginException("密码错误");
//        }
        if (!password.equals(user.getPassword())) {
            throw new LoginException("密码错误");
        }
        return user;
    }
}
