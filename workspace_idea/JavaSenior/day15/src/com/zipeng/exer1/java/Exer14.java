package com.zipeng.exer1.java;

import java.util.Scanner;

/**
 *
 * 接收用户输入的数字,判断在此范围内质数的个数
 *
 * @auter zipeng
 * @create &{YEAR}-04-27-9:44
 */
public class Exer14 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        int n = new Scanner(System.in).nextInt();

        count(n);

    }

    public static void count(int n) {
        if (n < 2) {
            System.out.println("没有质数！");
            return;
        }
        if (n == 2) {
            System.out.println("有一个质数");
            return;
        }
        int count = 1;

        outer:
        for (int i = 3; i <= n; i++) {
            double max = 1 + Math.sqrt(i);
            for (int j = 2; j < max; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            count++;
        }
        System.out.println(n + "内质数的数量：" + count);
    }
}
