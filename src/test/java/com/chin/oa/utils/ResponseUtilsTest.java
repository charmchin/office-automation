package com.chin.oa.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseUtilsTest {

    @Test
    public void put() {
        ResponseUtils resp = new ResponseUtils("LoginException","密码错误").put("name","chin");//多个直接在后面.put
        String json= resp.toJsonString();
        System.out.println(json);
    }
}