package com.zipeng.exer1.java;


/**
 *
 * 次生成随机数,并打印第一次出现大于0.999 时的次数与生成的随机数
 *
 * @auter zipeng
 * @create &{YEAR}-04-27-9:44
 */
public class Exer12 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            double d = Math.random();
            if (d > 0.999) {
                System.out.println("第" + i + "次出现了大于0.999的随机数" + d);
                break;
            }

        }
    }

    }

