package com.xb.controller;

import com.xb.model.Stu;
import com.xb.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private StuService stuService;

    @RequestMapping("test")
    public String test(){
        System.out.println("你好");
        List<Stu> stu = stuService.getStu();

        System.out.println("学生："+stu);

        return "";

    }

    @RequestMapping("xxx")
    public String xxx(){

        return "";
    }


}
