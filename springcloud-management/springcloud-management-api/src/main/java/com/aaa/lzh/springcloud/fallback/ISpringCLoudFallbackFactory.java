package com.aaa.lzh.springcloud.fallback;

import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.service.ISpringCloudHystrixService;
import com.aaa.lzh.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/7
 * @Description:
 */
@Component
public class ISpringCLoudFallbackFactory implements FallbackFactory<ISpringCloudHystrixService> {

    @Override
    public ISpringCloudHystrixService create(Throwable throwable) {
        ISpringCloudHystrixService iSpringCloudHystrixService = new ISpringCloudHystrixService() {

            @Override
            public List<Book> selectAllBooks() {
                System.out.println("弟弟这是测试熔断的方法！！");
                return null;
            }


        };


        return iSpringCloudHystrixService;
    }
}
