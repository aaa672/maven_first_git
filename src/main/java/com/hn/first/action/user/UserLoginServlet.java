package com.hn.first.action.user;

import com.alibaba.fastjson.JSON;
import com.hn.first.commons.ResResult;
import com.hn.first.commons.SpringIOC;
import com.hn.first.dao.pojo.User;
import com.hn.first.service.iservice.IUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserLoginServlet",urlPatterns = {"/UserLoginServlet"})
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //取值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2-处理
        IUserService userService = (IUserService) SpringIOC.getCtx().getBean("userService");
        ResResult<User> result = userService.login(username,password);
        String jsonResult = JSON.toJSONString(result);

        PrintWriter out = response.getWriter();
        out.println(jsonResult);
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
