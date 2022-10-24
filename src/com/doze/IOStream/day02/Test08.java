package com.doze.IOStream.day02;

import java.io.*;

public class Test08 {


    /**
     * 对比性能
     * @param args
     */
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        b();
        long endTime = System.currentTimeMillis();
        System.out.println("当前耗时:" + (endTime-startTime) + "毫秒!");
    }

    //160ms左右
    public static void a() throws IOException {
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

    //60ms左右
    public static void b() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");

        byte[] bytes = new byte[1024000];
        int len;
        while ((len=fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    //
    public static void c() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day01\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("A:\\Work\\Java_study\\src\\com\\doze\\IOStream\\File\\day02\\d89c60f9894154fd71c16c6cfa3872f1_raw.mp4");

        int b;
        while ((b=fileInputStream.read()) != -1) {
            fileOutputStream.write(b);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
