package com.doze.List.ArrayList.GenericParadigm.day02;

public class DozeArrayList<E> implements DozeList<E>{

    @Override
    public void add(E e) {
        System.out.println("新增成功");
    }

    @Override
    public E get(int index) {
        System.out.println("查询成功");
        E e = null;
        return e;
    }
}
