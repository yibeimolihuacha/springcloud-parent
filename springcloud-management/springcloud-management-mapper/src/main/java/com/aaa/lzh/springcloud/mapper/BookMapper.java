package com.aaa.lzh.springcloud.mapper;

import com.aaa.lzh.springcloud.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 */

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    Book selectByPrimaryKey(Long id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}
