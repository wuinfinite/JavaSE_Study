package com.zipeng.exer2;

/**
 * 龙贝格
 *
 * @auter zipeng
 * @create &{YEAR}-05-25-14:51
 */
public class exer4 {

    public static void main(String[] args) {
        exer4 exer = new exer4();
        double m = 5 * Math.pow(10, -8);
        double a=2;
        double b=3;
        double t ,t1, t2, h, x, sum;
        int n = 1, i = 1;
        h = b - a;
        t = Math.log(2) - Math.log(3);
        t2 = (exer.func(a) + exer.func(b)) / 2;
        do {
            t1 = t2;
            x = a;
            h =h/ 2;
            n =n* 2;
            sum = 0;
            for (i = 1; i < n; i += 2) {
                x = a + i * h;
                sum += exer.func(x);
            }
            t2 = t1 / 2 + sum * h;
            System.out.print("变分为："+ n+"    ");
            System.out.println("近似值为：" + t2);
        } while (((t2 - t) >= m) || ((t - t2) >= m));
    }


    public double func(double x) {//原函数

        return  -2/(Math.pow(x,2.0)-1);
    }

}
