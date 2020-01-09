package com.aaa.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/9
 * @Description:
 * 不需要配置eureka，因为这只是一个配置中心，里面全部都是配置文件，所以不需要向eureka注册服务
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class, args);
    }
}
