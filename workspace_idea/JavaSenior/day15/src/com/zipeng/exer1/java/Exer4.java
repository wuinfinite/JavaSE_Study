package com.zipeng.exer1.java;

/**
 *已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。
 * 而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
 * 于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？
 *
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-19:12
 */
public class Exer4 {
    public static void main(String[] args) {
        int hong = 25;
        int lan = 30;
        int hong1 = hong*2 + 10;
        int lan1 = lan  *2;
        if(hong1 == lan1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
