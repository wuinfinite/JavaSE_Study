package com.zipeng.java;

/**
 * @auter zipeng
 * @create &{YEAR}-05-14-20:27
 */
public class ZuoYe1 {
    public static void main(String[] args) {
        ZuoYe1  ye1 = new ZuoYe1();
        ZuoYe1  ye2 = new ZuoYe1();

        ye1.getMathod1(0.0);//方案1
        System.out.println("********************************************");
        ye2.getMathod2(0L);//方案2
    }

    public void getMathod1(double origin) {
        double[] x = new double[11];
        x[0] = origin;//存入初始值

        for (int i = 0; i < x.length-1; i++) {
            double s=(x[i]+1)/2;

            x[i+1]=Math.pow(s,(1/3.0));
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void getMathod2(long origin) {
        long[] x = new long[11];
        x[0] = origin;//存入初始值

        for (int i = 0; i < x.length-1; i++) {
            x[i + 1] = x[i] * x[i] * x[i] * 2L - 1L;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }


}
