package com.aaa.lzh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/9
 * @Description:
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @GetMapping("/all")
    public String test() {
        return port + "==============" + driverClass;
    }
}
