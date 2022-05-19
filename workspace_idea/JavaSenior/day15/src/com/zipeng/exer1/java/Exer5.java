package com.zipeng.exer1.java;

import java.util.Scanner;

/**
 *
 * 接收用户输入的3个整数,并将它们的最大值作为结果输出
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-19:13
 */
public class Exer5 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        int a = new Scanner(System.in).nextInt();

        System.out.println("请输入第二个整数：");
        int b = new Scanner(System.in).nextInt();

        System.out.println("请输入第三个整数：");
        int c = new Scanner(System.in).nextInt();

        int max = (a >= b ? a : b);
        max = (max >= c ? max : c);
        System.out.println("最大整数为：" + max);
    }
}
