package com.zipeng.exer1.java;

import java.util.Scanner;

/**
 * 接收用户输入的数据，判断是奇数还是偶数
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-19:17
 */
public class Exer6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        int input = new Scanner(System.in).nextInt();
        if (input % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
