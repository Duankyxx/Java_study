package com.doze.List.ArrayList.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    /**
     * 学生对象集合
     */
    private static ArrayList<Stu> stuArrayList = new ArrayList<>();
    /**
     * 学生系统管理类  主程序执行入口
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            //1.开发学生管理系统的主界面
            System.out.println("---欢迎您来到哆唻学生管理系统---");
            System.out.println("1.新增学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请选择[1-5]");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            //判断方式
            switch (number) {
                case 1:
                    System.out.println("新增学生");
                    addStu();
                    break;
                case 2:
                    System.out.println("修改学生");
                    updateStu();
                    break;
                case 3:
                    System.out.println("删除学生");
                    deleteStu();
                    break;
                case 4:
                    System.out.println("查询学生");
                    showStu();
                    break;
                case 5:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("请输入正确的选项!");
                    break;
            }
        }
    }

    /**
     * 新增学生
     */
    public static void addStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号:");
        String stuID = sc.nextLine();
        //根据学号查询
        Stu stu = getByStuID(stuID);
        if (stu != null) {
            System.out.println("该学号已被 " + stu.getName() + " 占用!");
            return; //  程序不会向下执行
        }
        System.out.println("请输入学生的姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生的地址:");
        String address = sc.nextLine();
        System.out.println("请输入学生的年龄:");
        Integer age = sc.nextInt();
        //将学生信息存入集合中
        stuArrayList.add(new Stu(stuID, name, age, address));
        System.out.println("新增完成!");
    }
    public static Stu getByStuID(String stuID) {
        return getByStuID(stuID, false);
    }
    public static Stu getByStuID(String stuID, boolean isDelete) {
        for (int i = 0; i<stuArrayList.size(); i++) {
            Stu stu = stuArrayList.get(i);
            if (stuID.equals(stu.getStuID())) {
                if (isDelete) {
                    System.out.println("删除学生:\t" + stuArrayList.remove(i) + "\t成功!");
                }
                return stu;
            }
        }
        return null;
    }

    /**
     * 查询学生
     */
    public static void showStu() {
        if (stuArrayList.size() == 0) {
            System.out.println("该表中没有存入任何的对象");
            return;
        }
        stuArrayList.forEach(System.out::println);
    }

    /**
     * 删除学生
     */
    public static void deleteStu() {
        //通过学生学号删除
        System.out.println("请输入要删除的学生学号:");
        Scanner sc = new Scanner(System.in);
        String stuID = sc.nextLine();
        //查询是否存在该对象
        if (getByStuID(stuID, true) == null) {
            System.out.println("不存在该学生");
        }
    }

    /**
     * 修改学生信息
     */

    public static void updateStu() {
        //通过学生学号修改
        System.out.println("请输入要修改的学生学号:");
        Scanner sc = new Scanner(System.in);
        String stuID = sc.nextLine();
        // 根据学号查找对象
        Stu stu = getByStuID(stuID);
        if (stu == null) {
            System.out.println("没有查找到该学号");
            return;
        }
        System.out.println("请输入学生新的姓名:");
        String newName = sc.nextLine();
        System.out.println("请输入学生新的地址:");
        String newAddress = sc.nextLine();
        System.out.println("请输入学生新的年龄:");
        Integer newAge = sc.nextInt();
        stu.setName(newName);
        stu.setAddress(newAddress);
        stu.setAge(newAge);
        //修改了原来的学生对象内容
        System.out.println("修改成功!");
    }

    /**
     * 代码重构
     *
     * 1.发现多处重复代码
     */
}
