package com.xb.controller;

import com.xb.model.Book;
import com.xb.model.Menu;
import com.xb.service.BookService;
import com.xb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {

    @Autowired
    private MenuService service;
    @Autowired
    private BookService bookService;

    @RequestMapping("findMenu")
    public List<Menu> findMenu(){
        List<Menu> menus = service.findMenu();
        for (Menu menu : menus) {
            MenuUtil(menu);
        }

        return menus;

    }

    @RequestMapping("bookList")
    public Map<String,Object> bookList(String bookname, Integer pageSize, Integer size){
        System.out.println(bookname);
        Map<String,Object> map=new HashMap<>();
        size=(size-1)*pageSize;
        List<Book> books=bookService.bookList(bookname,size,pageSize);
        map.put("total",10);
        map.put("rows",books);
        return map;
    }



    public void MenuUtil(Menu menu){
        List<Menu> children = service.findChildren(menu.getId());
        menu.setChildren(children);
    }


}
