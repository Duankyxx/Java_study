package com.doze.List.ArrayList.day01;

import com.doze.List.ArrayList.day01.pojo.Stu;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        //设置学生对象
        Stu stu1 = new Stu("张三",22);
        Stu stu2 = new Stu("李四",15);
        Stu stu3 = new Stu("王五",18);
        Stu stu4 = new Stu("赵六",30);
        Stu stu5 = new Stu("张七",54);

        //学生对象集合
        ArrayList<Stu> stuArrayList = new ArrayList<>();

        //存入学生对象
        stuArrayList.add(stu1);
        stuArrayList.add(stu2);
        stuArrayList.add(stu3);
        stuArrayList.add(stu4);
        stuArrayList.add(stu5);

        //输出
        stuArrayList.forEach(System.out::println);
    }
}
