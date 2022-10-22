package com.doze.IOStream.day01;

import java.io.File;
import java.io.IOException;

public class Test03 {

    /**
     * 绝对路径与相对路径
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //相对路径 ---->  项目路径  A:\\Work\\Java_study\\doze.txt      [自动填充]
        File file = new File("doze.txt");
        System.out.println(file.createNewFile());
        //输出绝对路径
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
    }
}
