package com.aaa.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/8
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun4081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun4081.class,args);
    }
}
