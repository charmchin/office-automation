package com.chin.oa.controller;

import com.chin.oa.entity.User;
import com.chin.oa.service.UserService;
import com.chin.oa.utils.ResponseUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet("/api/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        //接收用户输入
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //调用业务逻辑
        ResponseUtils resp = null;
        try {
            User user = userService.checkLogin(username, password);
            user.setPassword(null);
            user.setSalt(null);//进一步保证安全，使敏感数据返回为空，在服务端进行屏蔽

            //以下是获取了用户的完整信息
            resp = new ResponseUtils().put("user",user);
        }catch (Exception e){
            e.printStackTrace();
            resp = new ResponseUtils(e.getClass().getSimpleName(),e.getMessage());
        }
        //返回JSON结果
        response.getWriter().println(resp.toJsonString());
    }
}
