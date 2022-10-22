package com.doze.IOStream.day01;

import java.io.File;
import java.io.IOException;

public class Test04 {

    /**
     * 删除方法
     * @param args
     */
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze.js");
        //创建文件
        System.out.println(file.createNewFile());
        //删除文件或者文件夹
        System.out.println(new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze.js").delete());
    }
}
