package com.doze.IOStream.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05 {

    /**
     * 以1024数组来读取
     * @param args
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\doze.txt");
        byte[] bytes = new byte[1024];  //  希望以整数倍
//        int len = fileInputStream.read(bytes);
//        System.out.println(new String(bytes, 0, len));
        //优化!!!
        int len ;
        while ((len=fileInputStream.read(bytes)) > 0) {
            System.out.println(new String(bytes, 0, len));
            System.out.println("OK");
        }
        fileInputStream.close();
    }
}
