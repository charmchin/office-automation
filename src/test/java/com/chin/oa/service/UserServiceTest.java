package com.chin.oa.service;

import com.chin.oa.entity.User;
import org.junit.Test;
public class UserServiceTest {
    private UserService userService = new UserService();
    @Test
    public void checkLogin1() {
        User user = userService.checkLogin("m8","test");
        System.out.println(user);
    }
    @Test
    public void checkLogin2() {
        User user = userService.checkLogin("test1","test");
        System.out.println(user);
    }
}