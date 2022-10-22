package com.doze.List.ArrayList.GenericParadigm.day03;

public class DozeArrayList<E> {
    //自己手写
    private Object[] elementData;   //基于数组实现
    private int size;

    public DozeArrayList() {    //无参构造函数
        elementData = new Object[10];
    }

    private void add(E e) {
        //第一次存放元素   index ---> 0
        elementData[size++] = e;
    }
}
