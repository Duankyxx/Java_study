package com.doze.List.ArrayList.day01;

import com.doze.List.ArrayList.day01.pojo.Stu;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //录入
        ArrayList<Stu> stuArrayList = new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + i + "位学生名称:");
            String username = sc.nextLine();
            System.out.println("请输入第" + i + "位学生年龄:");
            int age = sc.nextInt();
            stuArrayList.add(new Stu(username, age));
            System.out.println("-------------------------");
        }

        //输出
        stuArrayList.forEach(System.out::println);
    }
}
