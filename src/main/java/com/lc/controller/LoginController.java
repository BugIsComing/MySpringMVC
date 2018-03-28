package com.lc.controller;

import com.lc.annotation.MyController;
import com.lc.annotation.MyRequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MyController
public class LoginController {
    @MyRequestMapping("/")
    public void index(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().write("index");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
