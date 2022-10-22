package com.doze.IOStream.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {

    public static void main(String[] args) throws IOException {
        File file = null;
        FileInputStream fileInputStream = null;
        try {
            file = new File("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\index.txt");
            fileInputStream = new FileInputStream(file);
            //从硬盘中每次读取一个字节数据到内存中
            System.out.println("读取到的文件内容:");
//            int read = fileInputStream.read();
//            while (read != -1) {
//                System.out.print((char) read);
//                read = fileInputStream.read();
//            }

            //优化
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
