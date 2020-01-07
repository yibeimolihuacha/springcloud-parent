package com.aaa.lzh.springcloud.service;

import com.aaa.lzh.springcloud.fallback.ISpringCLoudFallbackFactory;
import com.aaa.lzh.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/7
 * @Description:
 */
@FeignClient(value = "BOOK-PROVIDER-HYSTRIX",fallbackFactory = ISpringCLoudFallbackFactory.class)
public interface ISpringCloudHystrixService {
    @GetMapping("/all")
    List<Book> selectAllBooks();
}
