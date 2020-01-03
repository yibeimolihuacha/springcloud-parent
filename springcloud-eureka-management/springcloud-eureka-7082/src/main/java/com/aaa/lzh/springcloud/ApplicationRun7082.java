package com.aaa.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/3
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7082.class,args);
    }
}
