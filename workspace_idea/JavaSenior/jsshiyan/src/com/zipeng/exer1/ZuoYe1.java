package com.zipeng.exer1;

/**
 * 插值
 *
 * @auter zipeng
 * @create &{YEAR}-05-24-13:29
 */
public class ZuoYe1 {

    public static void main(String[] args) {

        ZuoYe1 ye1 = new ZuoYe1();

        double[] x = new double[11];
        double[] y = new double[11];

        ye1.func(x,y);
        ye1.forArray(x);
        System.out.println();
        ye1.forArray(y);
        System.out.println();

        //计算x=4.5插值函数的值
        double[] l = new double[11];

        for (int i = 0; i < 11; i++) {
            l[i] = ye1.getPriFunc(4.5,x,i);
        }
//        ye1.forArray(l);

        double s = ye1.getIpFunc(l, y);
        System.out.println("拉格朗日插值法计算x=4.5时近似值为："+ s);

    }

    /**
     * 获取节点坐标
     *
     * @param m
     * @param n
     */
    public void func(double m[],double n[]) {

        double x[] =new double[11];
        double y[] =new double[11];

        for (int i = 0; i < 6; i++) {
            int a = i - 5;
            x[i] = a;
            y[i] = 5 / (1 + Math.pow(x[i], 2));
        }

        for (int i = 1; i < 6; i++) {
            x[i + 5] = i;
            y[i + 5] = 5 / (1 + Math.pow(x[i + 5], 2));
        }

        for (int i = 0; i < x.length; i++) {
            m[i] = x[i];
            n[i] = y[i];
        }
    }

    /**
     * 获取下标为k的基函数
     *
     * @param x
     * @param m
     * @param k
     * @return
     */
    public double getPriFunc(double x,double m[], int k) {

        double l;
        double[] arr1 = new double[11];//获取基函数的各个顶部
        double[] arr2 = new double[11];//获取基函数的各个底部
        double a = 1.0;//基函数的顶部总数
        double b = 1.0;//基函数的底部总数

        for (int i = 0; i < arr1.length; i++) {
            if (i == k) {
                arr1[i] = 1.0;
            } else {
                arr1[i] = x - m[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i == k) {
                arr2[i] = 1.0;
            } else {
                arr2[i] = m[k] - m[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            a *= arr1[i];
            b *= arr2[i];
        }

        return l = a / b;
    }

    /**
     * 获取拉格朗日插值多项式
     *
     * @param l
     * @param n
     * @return
     */

    public double getIpFunc(double l[], double n[]) {

        double sum = 0.0;
        double[] L = new double[11];

        for (int i = 0; i <l.length; i++) {
            L[i] = l[i] * n[i];
        }

        for (int i = 0; i < L.length; i++) {
            sum += L[i];
        }

        return sum;
    }

    /**
     * 数组元素的遍历
     *
     * @param array
     */
    public void forArray(double array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("\t\t" + array[i]);
        }
    }

}
