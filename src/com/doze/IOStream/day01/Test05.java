package com.doze.IOStream.day01;

import java.io.File;

public class Test05 {

    public static void main(String[] args) {
        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\index.java");
        if (file.isDirectory()) {   //删除文件是文件夹时
            System.out.println("删除的是一个文件夹");
            deletes(file);
        }
        //路径里是文件
        if (file.isFile()) {
            System.out.println("删除的是一个文件");
            delete(file);
        }
    }

    public static void deletes(File file) {
        //1.获取到该目录中的所有文件
        File[] files = file.listFiles();
        for (File f : files) {
            f.delete();
            System.out.println("删除文件:" + f.getAbsolutePath());
        }
        //2.删除目录
        file.delete();
        System.out.println("删除的目录是:" + file.getAbsolutePath());
    }

    public static void delete(File file) {
        file.delete();
        System.out.println("删除文件:" + file.getAbsolutePath());
    }
}
