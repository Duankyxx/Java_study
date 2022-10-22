package com.doze.List.ArrayList.day03;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        //List 接口下的 ArrayList LinkList
        //ArrayList集合是否保证数据的有序性

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        arrayList.add("可莉");

        arrayList.forEach(System.out::println);
    }
}
