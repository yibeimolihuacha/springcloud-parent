package com.aaa.lzh.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
* RestConfig
* @author      一杯茉莉花茶
* @param
* @return
* @exception
* @date        2020/1/8 15:22
*/
@Configuration
public class RestConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
