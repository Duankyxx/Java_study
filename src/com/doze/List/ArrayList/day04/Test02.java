package com.doze.List.ArrayList.day04;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test02 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");

        //Iterator只能从头到尾
        ListIterator<String> listIterator = arrayList.listIterator();
    }
}
