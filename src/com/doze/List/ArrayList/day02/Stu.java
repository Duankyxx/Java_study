package com.doze.List.ArrayList.day02;

public class Stu {
    private String stuID;
    private String name;
    private Integer age;
    private String address;

    public Stu(String stuID, String name, Integer age, String address) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuID='" + stuID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
