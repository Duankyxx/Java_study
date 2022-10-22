package com.doze.List.ArrayList.GenericParadigm.day01;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 泛型
         */

        Stu<String> stu = new Stu<>("你好");
        System.out.println(stu.getT());
        Stu<Integer> stu2 = new Stu<>(1002);
        System.out.println(stu2.getT());
    }
}
