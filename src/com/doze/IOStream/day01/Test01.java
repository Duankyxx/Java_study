package com.doze.IOStream.day01;

import java.io.File;

public class Test01 {

    public static void main(String[] args) {
        //根据绝对路径创建一个file实例
        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\doze.txt");
        System.out.println(file);

        //拆分
        File file2 = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File","doze.txt");
        System.out.println(file2);

        //以File类型传参
        File file3 = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\");
        File file4 = new File(file3,"doze.txt");
        System.out.println(file3);
        System.out.println(file4);
    }
}
