package com.zipeng.exer1.java;

/**
 *
 * 打印100以内除了尾数为3,5,7的所有数
 *
 * @auter zipeng
 * @create &{YEAR}-04-27-9:44
 */
public class Exer13 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int y = i % 10;
            if (y == 3 || y == 5 || y == 7) {
                continue;//如果尾数为3 5 7 ,则跳过后面的打印,进行下一轮循环
            }
            System.out.println(i);
        }
    }
}
