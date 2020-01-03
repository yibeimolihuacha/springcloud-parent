package com.aaa.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 *
 *      springcloud所有的组件就三板斧:
 *           1.添加jar包
 *           2.添加注解
 *           3.完成配置
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7081.class,args);
    }
}
