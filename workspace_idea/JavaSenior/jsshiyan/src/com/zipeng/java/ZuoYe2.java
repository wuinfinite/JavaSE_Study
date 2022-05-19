package com.zipeng.java;

/**
 * @auter zipeng
 * @create &{YEAR}-05-14-20:50
 */
public class ZuoYe2 {
    public static void main(String[] args) {
        ZuoYe2 ye1 = new ZuoYe2();
        ZuoYe2 ye2 = new ZuoYe2();

        ye1.getMathod(1.5);//方案1
        System.out.println("*********************************************");
        ye2.getMathod(0.0);//方案2

    }

    public void getMathod(double origin) {
        double[] x = new double[10];
        x[0] = origin;//存入初始值

        for (int i = 0; i < x.length-1; i++) {
            double a = Math.pow(x[i], 3) - x[i] - 1;
            double b = (3 * x[i] * x[i] - 1);

            x[i + 1] = x[i] - (a / b);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
    }
}
