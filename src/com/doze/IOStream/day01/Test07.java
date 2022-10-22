package com.doze.IOStream.day01;

import java.io.File;

public class Test07 {

    /**
     * 递归算法输出目录下的所有文件
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File");
        getAllFile(file);
    }


    /**
     * 使用递归算法查找该路径下的所有文件
     * @param file
     */
    public static void getAllFile(File file) {
        //1.获取到file对象中有那些文件
        File[] files = file.listFiles();
        //2.判断files是否为null
        if (files == null) {
            return;
        }
        //3.遍历该目录中所有内容
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println("删除文件" + f.getAbsolutePath());
                f.delete();
            }
        }
        //删除整个文件夹
        file.delete();
    }
}
