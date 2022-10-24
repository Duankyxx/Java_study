package com.doze.IOStream.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {

    /**
     * 使用字节流复制图片
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.读取文件到内存
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\ee60338cd070f28e0e5d2c225fbaf1e.jpg");
        //2.将图片写入到指定目录中
        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\ee60338cd070f28e0e5d2c225fbaf1e.jpg");
        //3.写入数据
        byte[] bytes = new byte[1024000];   //1M
        int len;
        int num = 0;
        while ((len=fileInputStream.read(bytes)) > 0) {
            fileOutputStream.write(bytes, 0, len);
            System.out.println(++num);
        }
        //4.关闭释放资源
        fileOutputStream.close();
        fileInputStream.close();
    }
}
