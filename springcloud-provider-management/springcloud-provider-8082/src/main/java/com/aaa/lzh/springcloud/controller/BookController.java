package com.aaa.lzh.springcloud.controller;

import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.service.BookService;
import com.aaa.lzh.springcloud.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/3
 * @Description:
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /**
    * 查询所有数据
    * @author      一杯茉莉花茶
    * @param
    * @return
    * @exception
    * @date        2020/1/3 15:56
    */
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return bookService.selectAllBooks();
    }


    @PostMapping(value = "/add", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String addim( MultipartFile file){
        Map<String, Object> map = bookService.uploadFile(file);
        String o = (String) map.get("code");
        return o;
    }
}
