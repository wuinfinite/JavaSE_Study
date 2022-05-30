package com.zipeng.exer2;

import java.util.Scanner;

/**
 * 复合Simpson公式
 *
 * @auter zipeng
 * @create &{YEAR}-05-25-13:31
 */
public class exer3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//n等分
        exer3 exer1 = new exer3();
        double y = exer1.trap(n);
        System.out.println("近似值为：" + y);

    }

    public double trap(int n) {

        double m = Math.log(2) - Math.log(3);
        double y = 0.0;
        double z = 0.0;
        double z1 = 0.0;
        double z2 = 0.0;
        double z3 = 0.0;

        for (int j = 1; j < n; j++) {

            z = (2 + (double) j / n);
            z1 += 2 * func(z);
        }

        for (int i = 0; i < n; i++) {

            z2 = (2 + (double) i / n);
            z3 += 4 * func((z2 + (double) 1 / (2 * n)));

        }

        y = -(1.0 / (3 * n)) * (func(2.0) + z1 + z3 + func(3.0));

        if ((m - y) < 5 * Math.pow(10, -8) && (m - y) > -5 * Math.pow(10, -8)) {
            System.out.println("精度达到了要求！");
        }

        System.out.println("精确值为：" + m);
        return y;
    }

    public double func(double x) {//原函数

        return  1/(Math.pow(x,2.0)-1);
    }

}
