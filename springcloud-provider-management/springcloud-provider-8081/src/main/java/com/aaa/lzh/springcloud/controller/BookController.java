package com.aaa.lzh.springcloud.controller;

import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return bookService.selectAllBooks();
    }
}
