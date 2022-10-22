package com.doze.List.ArrayList.GenericParadigm.day02;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

    public static void printList(List<?> str) {

    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        printList(arrayList);
    }
}
