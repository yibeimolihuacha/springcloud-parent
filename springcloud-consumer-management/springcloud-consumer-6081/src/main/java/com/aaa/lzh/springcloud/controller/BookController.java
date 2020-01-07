package com.aaa.lzh.springcloud.controller;

import com.aaa.lzh.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 */

@RestController
public class BookController {

    private static final String PROVIDER_URL = "http://localhost:8081springcloud-parent";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject(PROVIDER_URL, List.class);
    }
}
