package com.aaa.lzh.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 * springcloud1.x--->@EnableEurekaClient
 * springcloud2.x--->@EnableDiscoveryClient
 */
@SpringBootApplication
@MapperScan("com.aaa.lzh.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }

}
