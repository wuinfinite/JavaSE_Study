package com.zipeng.exer1.java;

/**
 * @auter zipeng
 * @create &{YEAR}-04-26-19:12
 */
public class Exer3 {
    public static void main(String[] args) {
        double fatherHeight = 175;
        double motherHeight = 160;

        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHight = (fatherHeight * 0.923 + motherHeight) + 2;
        System.out.println(sonHeight);
        System.out.println(daughterHight);

    }
}
