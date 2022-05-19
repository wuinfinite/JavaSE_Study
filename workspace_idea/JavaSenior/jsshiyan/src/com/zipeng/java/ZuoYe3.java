package com.zipeng.java;

/**
 * @auter zipeng
 * @create &{YEAR}-05-15-9:59
 */
public class ZuoYe3 {
    public static void main(String[] args) {
        ZuoYe3 ye1 = new ZuoYe3();
        ZuoYe3 ye2 = new ZuoYe3();
        ZuoYe3 ye3 = new ZuoYe3();

        System.out.println("****************牛顿法*************************");
        ye1.getMathod1(1.0);//方案1
        System.out.println("***************简单迭代法***********************");
        ye2.getMathod2(1.0);//方案2
        System.out.println("****************正割法**************************");
        ye3.getMathod3(1.0,3.0);//方案3



    }

//牛顿法
    public void getMathod1(double origin) {
        double[] x = new double[100];//迭代最大次数100
        x[0] = origin;//存入初始值
        int k = 0;//记录迭代次数

        for (int i = 0; i < x.length-1; i++) {

            double a = Math.pow(x[i], 3) - Math.sin(x[i]) - 12 * x[i] + 1;
            double b = 3*Math.pow(x[i], 2) - Math.cos(x[i]) - 12;

            x[i + 1] = x[i] - a / b;

            k++;

            if ((x[i + 1] - x[i] > -0.000001) && (x[i + 1] - x[i] < 0.000001)) {
                break;
            }
        }

        for (int i = 0; i <= k; i++) {
            System.out.println(x[i]);
        }
        System.out.println("迭代次数为：" + k);
    }

//简单迭代法
    public void getMathod2(double origin) {
        double[] x = new double[100];//迭代最大次数100
        x[0] = origin;//存入初始值
        int k = 0;//记录迭代次数

        for (int i = 0; i < x.length-1; i++) {
            double a = Math.sin(x[i]) + 12 * x[i] - 1;

            x[i + 1] = Math.pow(a, (1 / 3.0));

            k++;

            if ((x[i + 1] - x[i] > -0.000001) && (x[i + 1] - x[i] < 0.000001)) {
                break;
            }

        }

        for (int i = 0; i <= k; i++) {
            System.out.println(x[i]);
        }
        System.out.println("迭代次数为：" + k);
    }

    //正割法
    public void getMathod3(double m, double n) {
        double[] x  = new double[100];//迭代最大次数100
        x[0] = m;//存入初始值1
        x[1] = n;//存入初始值2
        int k = 0;//记录迭代次数

        for (int i = 1; i < x.length-1; i++) {
            double a = Math.pow(x[i - 1], 3) - Math.sin(x[i - 1]) - 12 * x[i - 1] + 1;
            double b = Math.pow(x[i], 3) - Math.sin(x[i]) - 12 * x[i] + 1;
            double c = x[i] - x[i - 1];

            x[i + 1] = x[i] - (b / (b - a)) * c;

            k++;

            if ((x[i + 1] - x[i] > -0.000001) && (x[i + 1] - x[i] < 0.000001)) {
                break;
            }
        }

        for (int i = 0; i <= k; i++) {
            System.out.println(x[i]);
        }
        System.out.println("迭代次数为：" + k);
    }
}
