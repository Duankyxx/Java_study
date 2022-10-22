package com.doze.List.ArrayList.GenericParadigm.day04;

import java.util.Vector;

public class Test02 {

    public static void main(String[] args) {

        //  10:数组初始化容量
        //  20:每次扩容增加20个
        Vector<String> vector = new Vector<>(10,20);
        vector.add("a");
        vector.add("b");
        vector.add("c");

        /**
         * Vector:  线程安全,每次扩容的容量是原来的2倍,也可以自己设置扩容;
         * ArrayList:   线程不安全,每次扩容是原来容量的1.5倍;
         * 相同点: 默认容量都是10,List接口下的子类;
         */
    }
}
