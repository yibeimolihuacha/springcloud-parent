package com.aaa.lzh.springcloud.service;

import java.util.List;
import java.util.Map;


import com.aaa.lzh.springcloud.model.Book;
import org.springframework.web.multipart.MultipartFile;

public interface BookService {

    List<Book> selectAllBooks();
    Map<String, Object> uploadFile(MultipartFile file);
}
