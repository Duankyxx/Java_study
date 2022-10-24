package com.doze.List.LinkList.day02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test01 {


    /**
     * LinkedList底层是双向链表
     * @param args
     */
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        Iterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        linkedList.remove(1);
        System.out.println("删除之后");
        Iterator<String> iterator2 = linkedList.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
