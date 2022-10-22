package com.doze.IOStream.day01;

import java.io.File;
import java.io.IOException;

public class Test02 {

    public static void main(String[] args) throws IOException {

        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze.txt");
        System.out.println(file.createNewFile());   //  创建文件
        File file1 = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze");
        System.out.println(file1.mkdir());   //  创建文件夹,创建时，必须要有父路径
        File file2 = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze02\\javaWeb");
        System.out.println(file2.mkdirs());  //自动创建父路径
    }
}
