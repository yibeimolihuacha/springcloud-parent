package com.aaa.lzh.springcloud.controller;

import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/4
 * @Description: 从今天开始，所有听到的接口都不再叫interface(初级/中级程序员经常会写的就是接口)
 * *      接口从今天开始叫做一整套业务逻辑(controller--->service--->mapper)，接口可以理解为controller也可以理解为一整套业务逻辑
 * *      (在前后端分离体验的最明确的)
 */
@RestController
public class BookController {
    @Autowired
    private ISpringCloudService iSpringCloudService;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return iSpringCloudService.sleectAllBooks();
    }


    @PostMapping("/add")
    public String addim(@RequestParam("file") MultipartFile file) {
        String addim = iSpringCloudService.addAim(file);
        return addim;
    }

}
