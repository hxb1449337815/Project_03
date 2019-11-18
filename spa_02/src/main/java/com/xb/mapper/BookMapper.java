package com.xb.mapper;

import com.sun.javafx.image.IntPixelGetter;
import com.xb.model.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookMapper {


    @Select("<script>" +
            "select * from book " +
            "<if test='bookname!=null'>where bookname like CONCAT('%',#{bookname},'%') </if>" +
            "limit #{size},#{pageSize}" +
            "</script>")
    public List<Book> bookList(String bookname,Integer size,Integer pageSize);


    @Select("select count(*) from book")
    public String getCount();



}
