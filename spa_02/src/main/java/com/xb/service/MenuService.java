package com.xb.service;

import com.xb.model.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> findMenu();


    List<Menu> findChildren(Integer pid);

}
