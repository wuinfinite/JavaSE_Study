package com.zipeng.exer1.java;

import java.util.Scanner;

/**
 * BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
 * 接收用户输入的身高和体重,将判断结果输出
 * 过轻：低于18.5
 * 正常：18.5 ~ 22.9
 * 偏胖：23 ~ 24.9
 * 肥胖：25 ~ 29.9
 * 重度肥胖：高于30
 * 极度肥胖：高于40
 * @auter zipeng
 * @create &{YEAR}-04-26-23:12
 */
public class Exer7 {

    public static void main(String[] args) {
        System.out.println("请输入您的身高(cm)：");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("请输入您的体重(kg)：");
        double weight = new Scanner(System.in).nextDouble();

        getBMI(height, weight);

    }

    public static void getBMI(double h, double w) {
        double bmi = w / (h * 2);
        String r = "";
        if (bmi < 18.5) {
            r = "过轻";
        } else if (bmi >= 18.5 && bmi < 22.9) {
            r = "正常";
        } else if (bmi >= 23 && bmi < 24.9) {
            r = "偏胖";
        } else if (bmi >= 25 && bmi < 29.9) {
            r = "肥胖";
        } else if (bmi >= 30 && bmi < 40) {
            r = "重度肥胖";
        } else {
            r = "极度肥胖";
        }

        System.out.println("您的bmi为" + bmi);

        System.out.println("你的体重属于：" + r);
    }
}
