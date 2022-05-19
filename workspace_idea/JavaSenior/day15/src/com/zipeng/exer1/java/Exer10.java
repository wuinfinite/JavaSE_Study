package com.zipeng.exer1.java;

/**
 *
 * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
 * 订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
 * 那么这个小伙要点这三样东西，最少要花多少钱
 * @auter zipeng
 * @create &{YEAR}-04-26-23:12
 */
public class Exer10 {

    public static void main(String[] args) {
        double money1 = 24+8+3;
        money1 = (money1<=30? money1 : money1*0.8);
        double money2 = 16 + 8 + 3;
        double money = (money1 <= money2 ? money1 : money2);
        System.out.println(money);
    }
}
