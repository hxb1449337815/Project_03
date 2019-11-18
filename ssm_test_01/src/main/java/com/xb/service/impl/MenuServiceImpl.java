package com.xb.service.impl;

import com.xb.mapper.MenuMapper;
import com.xb.model.Menu;
import com.xb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper mapper;

    @Override
    public List<Menu> getMenu() {
        return mapper.getMenu();
    }
}
