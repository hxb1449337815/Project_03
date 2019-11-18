package com.bos.controller.hxb;

import com.bos.model.SyEmp;
import com.bos.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private SyEmpService syEmpService;

    @RequestMapping("test")
    public List<SyEmp> test(){
        List<SyEmp> list = syEmpService.getList();
        for (SyEmp syEmp : list) {
            System.out.println(syEmp);
        }
        return list;

    }





}
