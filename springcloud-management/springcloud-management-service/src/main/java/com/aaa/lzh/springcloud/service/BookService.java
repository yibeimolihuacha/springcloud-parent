package com.aaa.lzh.springcloud.service;

import com.aaa.lzh.springcloud.mapper.BookMapper;
import com.aaa.lzh.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    /**
    * 查询所有书籍信息
    * @author      一杯茉莉花茶
    * @param
    * @return      
    * @exception   
    * @date        2020/1/2 19:29
    */
    public List<Book> selectAllBooks() {
      return  bookMapper.selectAll();
    }
}
