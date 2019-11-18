package com.xb.controller;

import com.xb.model.Users;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {


    @Autowired
    private UserService service;

    @RequestMapping("login")
    public String login(String name,String password){
        System.out.println(name + "\t" + password);
        Users u=new Users();
        u.setName(name);
        u.setPassword(password);
        Users user = service.getUser(u);
        System.out.println(user);


        return "index";
    }

}
