package com.doze.List.ArrayList.GenericParadigm.day04;

import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        /**
         * 根据index删除:   时间复杂度o1;
         * 根据内容删除:     时间复杂度on;
         */
        arrayList.remove(1);
        System.out.println(arrayList.get(1));
    }
}
