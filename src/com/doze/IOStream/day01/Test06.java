package com.doze.IOStream.day01;

public class Test06 {

    private static int count = 0;

    /**
     * 阶乘
     * @param args
     */
    public static void main(String[] args) {
//        factorial(6);
//        System.out.println(factorial2(6));
        a();
    }

    /**
     * 不使用递归
     */
    public static void factorial(int num) {
        int nums = num;
        int count = 0;
        for (int i = 1; i < num -1; ++i) {
            count++;
            nums = nums * (num-i);
        }
        System.out.println(nums);
        System.out.println("循环了:" + count + "次!");
    }

    /**
     * 使用递归算法
     */
    public static int factorial2(int num) {
        System.out.println("ok");
        if (num == 2) {
            return 2;
        } else {
            return num * factorial2(num - 1);
        }
    }

    public static void a() {
        System.out.println("深度:" + (++count));
        a();
    }
}
