package com.zipeng.exer1.java;

/**
 *鸡兔同笼问题(穷举法)
 *
 *已知:鸡兔共35只,共94只脚,那么鸡和兔各几只?
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-23:12
 */
public class Exer11 {
    public static void main(String[] args) {
        for (int j = 0, t = 35; j <= 35; j++, t--) {
            if (j * 2 + t * 4 == 94) {
                System.out.println("鸡有：" + j + "\t兔有：" + t);
            }
        }
    }
}
