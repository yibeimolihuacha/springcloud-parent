package com.aaa.lzh.springcloud.controller;

import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/7
 * @Description:
 */

public class BookController {
    @Autowired
    private BookService bookService;

/**
* 查询所有的图书信息
* @author      一杯茉莉花茶
* @param
* @return      
* @exception   
* @date        2020/1/7 14:38
 * ！！！在开发阶段，所有的熔断必须关闭，如果不关闭则不会抛出异常，开发完之后开启熔断机制
 *      这种模式的优缺点
 *          一个controller会有很多个方法--->每一个方法都必须有一个备用方法
 *                  --->controller就会非常的臃肿--->封装
 *                         feign+hystrix实现真正的熔断器
 *                         UserController.java--->.class
 *                              selectUserById()
 *                              BookController
 *                                  SelectAllBooks()-->.calss
 *                                  OrderController
 *                                  --->把所有的controller的备用方法全部封装到一个类中去
*/
    @GetMapping("/all")
    public List<Book> selectAllBooks() throws Exception {
        List<Book> bookList = bookService.selectAllBooks();
        if (bookList.size() > 0) {
        //说明数据库中有数据，有数据抛出异常
            throw new Exception("这是抛出的异常测试");
        }
        return bookList;
    }
    
        /*public List<Book> selectAllFallBack() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
        book.setId(20000L);
        book.setBookName("测试熔断是否启动");
        book.setBookPrice(11111111.2);
        bookList.add(book);
        return bookList;
    }*/
}
