package com.doze.List.ArrayList.day03;

import java.util.List;

public class DozeIterator {
    private List list;

    public DozeIterator(List list) {
        this.list = list;
    }

    //计数器
    private int count = 0;
    public Object next() {
        if (list == null) {
            throw new DozeException("list is null");
        }
        if (count>= list.size()) {
            //要越界了
            throw new DozeException("无法继续向下获取元素!");
        }
        return list.get(count++);
    }

    public boolean hasNext() {
        //判断集合中是否还能返回元素
        return count != list.size();
    }
}
