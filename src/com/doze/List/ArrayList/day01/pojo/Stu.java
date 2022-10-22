package com.doze.List.ArrayList.day01.pojo;

public class Stu {
    private String username;
    private int age;

    public Stu(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
