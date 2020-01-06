package com.aaa.lzh.springcloud.service;

import com.aaa.lzh.springcloud.config.FtpProperties;
import com.aaa.lzh.springcloud.mapper.BookMapper;
import com.aaa.lzh.springcloud.model.Book;
import com.aaa.lzh.springcloud.untils.FileNameUtil;
import com.aaa.lzh.springcloud.untils.FtpUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/2
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private FtpProperties ftpProperties;
    /**
    * 查询所有书籍信息
    * @author      一杯茉莉花茶
    * @param
    * @return
    * @exception
    * @date        2020/1/2 19:29
    */
    public List<Book> selectAllBooks() {
      return  bookMapper.selectAll();
    }


    @Override
    public Map<String, Object> uploadFile(MultipartFile file) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        // 1.获取原始的文件名称(目的:获取文件的后缀名)
        String oldName = file.getOriginalFilename();
        try {
            // 2.用户的主键id

            // 3.生成新的文件名(315678163781256812975498)
            String newName = FileNameUtil.getFileName(Long.valueOf(1));
            // 4.截取原始文件名的后缀,拼接到新的名称上--->获取新的文件名
            newName = newName + oldName.substring(oldName.lastIndexOf("."));
            // 5.获取文件的路径(2019/11/13)
            String filePath = "/1";
            // 6.调用上传文件的工具类
            boolean ifSuccess = FtpUntil.uploadFile(ftpProperties.getIpAddr(), ftpProperties.getPort(), ftpProperties.getUsername(),
                    ftpProperties.getPassword(), ftpProperties.getBasePath(), filePath, newName, file.getInputStream());
            if(ifSuccess) {
                // 上传成功，把路径保存到数据库中
                resultMap.put("code", "200");
                resultMap.put("msg", "上传chenbgg！");

            } else {
                resultMap.put("code", "500");
                resultMap.put("msg", "上传失败！");
            }
        } catch (IOException e) {
            resultMap.put("code", "500");
            resultMap.put("msg", "上传失败！");
            e.printStackTrace();
        }
        return resultMap;
    }
}
