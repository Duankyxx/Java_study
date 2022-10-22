package com.doze.List.ArrayList.day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test02 {
    /**
     * 迭代器
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        //for遍历
//        for (int i = 0; i < collection.size(); i++) {
//            String s = collection.get(i);
//            System.out.println(s);
//        }
        //迭代器
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
