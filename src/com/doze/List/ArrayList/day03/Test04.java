package com.doze.List.ArrayList.day03;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    /**
     * 手写迭代器
     * 思路:
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        DozeIterator dozeIterator = new DozeIterator(list);
//        System.out.println(dozeIterator.hasNext());
//        System.out.println(dozeIterator.next());
//
//        System.out.println(dozeIterator.hasNext());
//        System.out.println(dozeIterator.next());
//
//        System.out.println(dozeIterator.hasNext());
//        System.out.println(dozeIterator.next());
//
//        System.out.println(dozeIterator.hasNext());
//        System.out.println(dozeIterator.next());

        while (dozeIterator.hasNext()) {
            System.out.println(dozeIterator.next());
        }
    }
}
