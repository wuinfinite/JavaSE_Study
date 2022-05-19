package com.zipeng.exer1.java;

import java.util.Scanner;

/**
 *手机选号:根据用户输入的手机号来确认用户实际支付的价格
 *
 * 如果尾数为8，需支付办卡费50元
 * 如果尾数为4，需支付办卡费用0元
 * 如果是其他尾号,需支付办卡费用20元
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-23:12
 */
public class Exer8 {
    public static void main(String[] args) {
        System.out.println("请输入您的手机号：");
        String tel = new Scanner(System.in).nextLine();//注意String类型数据一般用nextLine()
        getPrice(tel);
    }

    public static void getPrice(String tel) {
        if (tel.length() != 11) {
            System.out.println("输入号码有误！");
            return;
        }
        int price = 0;
        char c = tel.charAt(10);
        switch (c) {
            case '8':
                price = 50;
                break;
            case '4':
                price = 0;
                break;
            default:
                price = 20;
        }
        System.out.println("您的实际应支付的价格为：" + price);
    }

}
