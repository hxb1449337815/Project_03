package com.xb.service;

import com.xb.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> bookList(String bookname,Integer size,Integer pageSize);

}
