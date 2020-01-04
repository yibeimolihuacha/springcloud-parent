package com.aaa.lzh.springcloud.service;


import com.aaa.lzh.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/4
 * @Description:
 *      FeignClient就是consumer通往provider的桥梁也就是说consumer调用api，api调用provider
 *      （通过这个FeignClient注解）
 *              feign中有负载均衡的功能，所以value不能写某一个provider的ip地址和端口号（localhost：8081，localhost：8082，localhost：8083）
 *              写eureka中的Application的值
 *              ！！！注意！！！
 *                  1.api和provider中的所有GetMapping必须要匹配（@RequestMapping）（请求方式必须保持一致）
 *                  2.api和provider的返回值也必须保持一致
 *                  3.api和provider的方法参数个数和类型包括参数名都必须保持一致
 *                  ！！！4.因为使用的仍然是http协议传输，需要把实体类型转换为二进制（implement Serializable）
 *                  如果需要传参-->传递简单类型（8种基本类型，8种类型的包装类型，String...）-->@RequestParam
 *                  api和provider都需要这个注解
 *                  ！！！！@RequestParam注解一定可以出现多次
 *                          -->传递对象类型（实体类，Map..）-->@RequestBody
 *                          并且api和provider都必须用这个注解-->这个@RequestBody只能出现一次
 *                          Book和Book_Cat
 *                              一对多
 *                              优化SQL语句
 *                                 <select id="" paramemeterType="" resultType="BookVo">
 *                                     select * from book b inner join book_cat bc on b.book_cat_id = bc.id
 *                                 </select>
 *
 *                               pojo:代表了实体类
 *                  povo:当所有的实体类都无法满足查询出来的结果的时候，需要封装一个vo类型
 *                     BookVo:
 *                        bookId
 *                        bookName
 *                        bookPricce
 *                        bookCatId
 *                        bookCatName
 *
 *                     BookVo extends Book{
 *                          bookCatId
 *                          bookCatName
 *                     }
 *
 */
@FeignClient(value = "BOOK-PROVIDER")
public interface ISpringCloudService {

    @GetMapping("/all")
    List<Book> sleectAllBooks();
}
