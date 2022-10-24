package com.doze.IOStream.day02;

import java.io.*;

public class Test03 {


    /**
     * 复制文件
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.读取到磁盘中的文件
        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\doze.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        //写入到day02
        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\doze.txt");

        int by;

        while ((by=fileInputStream.read()) != -1) {
            //写入数据
            fileOutputStream.write(by);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
