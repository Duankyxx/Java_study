package com.doze.IOStream.day02;

import java.io.*;

public class Test07 {

    /**
     * 字节缓冲流
     * @param args
     */
    public static void main(String[] args) throws IOException {
        b();
    }

    public static void a() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\hello.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(("awughfwahfhawfhawfjawjfiohjwafiohwafiohj".getBytes()));
        bufferedOutputStream.close();
        fileOutputStream.close();
    }

    /**
     * 复制  读取 ---> 写入
     * @throws IOException
     */
    public static void b() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * 使用缓冲流复制视频
     */
    public static void c() {

    }
}
