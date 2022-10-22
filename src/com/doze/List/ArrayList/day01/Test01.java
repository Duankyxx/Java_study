package com.doze.List.ArrayList.day01;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("你好");
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        System.out.println(arrayList);
        arrayList.forEach(System.out::println);
    }
}
