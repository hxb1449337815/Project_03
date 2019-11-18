package com.xb.service.impl;

import com.xb.mapper.BookMapper;
import com.xb.model.Book;
import com.xb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookMapper mapper;

    @Override
    public List<Book> bookList(String bookname,Integer size,Integer pageSize) {
        return mapper.bookList(bookname,size,pageSize);
    }
}
