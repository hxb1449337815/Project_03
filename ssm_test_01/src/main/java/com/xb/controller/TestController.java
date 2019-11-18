package com.xb.controller;

import com.xb.model.Menu;
import com.xb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {


    @Autowired
    private MenuService service;

    @RequestMapping("test")
    public String test(ModelMap map){
        List<Menu> menu1 = service.getMenu();
        for (Menu menu : menu1) {
            System.out.println(menu);
        }
        map.addAttribute("menu",menu1);
        return "log";
    }


}
