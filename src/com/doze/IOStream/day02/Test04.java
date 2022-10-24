package com.doze.IOStream.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {

    /**
     * 使用字节数组流
     * @param args
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\doze.txt");
        byte[] bytes = new byte[1024];
        int len = fileInputStream.read(bytes);

        System.out.println(new String(bytes));

        fileInputStream.close();
    }
}
