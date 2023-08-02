package com.chin.oa.mapper;

import com.chin.oa.entity.User;
import com.chin.oa.utils.MybatisUtils;
public class UserMapper {
    public User selectByUsername(String username){
        User user = (User) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername", username));
        return user;
    }
}

