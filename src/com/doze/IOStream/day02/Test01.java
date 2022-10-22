package com.doze.IOStream.day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

    /**
     * 将程序中的数据写入到磁盘中
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //写入到磁盘中
//        fileOutputStream.write(97);
//        fileOutputStream.write(98);
//        fileOutputStream.write(99);
//        fileOutputStream.write(100);
//        fileOutputStream.write(101);
//        fileOutputStream.write(102);

        FileOutputStream fileOutputStream = null;
        try {
            //  指定写入文件路径
            fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\index.txt",false);
            int s = 1/0;
            //写入字符串
            for (int i = 0; i < 10000; ++i) {
                byte[] bytes = writeMsg("\r\n你好啊!\r\n我是你爹!");
                fileOutputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    System.out.println("关闭资源成功!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static byte[] writeMsg(String str) {
        return str.getBytes();
    }
}
