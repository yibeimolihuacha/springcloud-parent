package com.aaa.lzh.springcloud.untils;

import java.util.Random;

/**
 * @Auther: 一杯茉莉花茶
 * @Date: 2020/1/6
 * @Description:
 */

public class FileNameUtil {
    /**
     * 规定所有的文件名称都必须是随机数+时间戳+id进行定义随机数 获取到系统的毫秒数 用户的id
     *
     * @param
     * @return
     * @throws
     * @author 一杯茉莉花茶
     * @date 2020/1/6 9:33
     */
    public static String getFileName(Long id) {
        // 1.获取当前系统时间的毫秒数
        long currentTimeMillis = System.currentTimeMillis();
        // 2.创建随机数对象
        Random random = new Random();
        // 3.生成随机数(在0-999之间进行随机)
        int randomNum = random.nextInt(999);
        // 4.开始格式化
        // %:占位符  d:数字  03:如果不够三位，自动向前补0
        String format = String.format("%03d", randomNum);
        // 5.生成新的文件名
        String fileName = id + currentTimeMillis + format;
        // 6.返回文件的名称
        return fileName;
    }

    public static void main(String[] args) {
        System.out.println(FileNameUtil.getFileName(1L));
    }

}

