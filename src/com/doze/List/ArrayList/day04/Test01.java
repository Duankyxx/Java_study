package com.doze.List.ArrayList.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test01 {

    /**
     * List集合中的独有方法
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");

        List list = (List)collection;
        System.out.println(list.get(1));
    }
}
