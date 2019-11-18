package com.xb.controller;

import com.xb.model.User;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private UserService service;

    @RequestMapping("test")
    public void test(){
        for (User user : service.getList()) {
            System.out.println(user);
        }
    }

}
