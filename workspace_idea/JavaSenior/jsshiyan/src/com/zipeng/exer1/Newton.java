package com.zipeng.exer1;

/**
 * @auter zipeng
 * @create &{YEAR}-05-25-0:15
 */

import java.util.Scanner;
public class Newton {
    static double[][] getmat;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int m=scan.nextInt();//插入点总数
        double[][] xy=new double[2][m];//二维数组来存储x和y
        for(int j=0;j<m;j++) {
            xy[0][j]=scan.nextDouble();//第0行放各点的x值
            xy[1][j]=scan.nextDouble();//第1行放各点的y值
        }
        creatgetmat(xy, m);
        int v=scan.nextInt();//所求点的总数
        for(int i=0;i<v;i++) {
            double x=scan.nextDouble();
//            System.out.print("f("+x+")≈"+"Nn("+x+")"+"=");
//            System.out.printf("%.5f", Nn(xy, n, x));
//            System.out.println();

            System.out.println("牛顿插值法计算近似值结果为："+Nt(xy, m, x));
        }
    }


    public static void creatgetmat(double[][] xy,int m) {
        getmat=new double[m-1][m-1];
        for(int i=0;i<m-1;i++) {
            for(int j=0;j<m-1-i;j++) {
                if(i==0) {
                    getmat[i][j]=(xy[1][j]-xy[1][j+1])/(xy[0][j]-xy[0][j+1]);
                }
                else{
                    getmat[i][j]=(getmat[i-1][j]-getmat[i-1][j+1])/(xy[0][j]-xy[0][j+i+1]);
                }
            }
        }
    }

    public static double Nt(double[][] xy,int m,double x) {
        //牛顿插值公式
        double s=xy[1][0];//求和的初始值为f(X0)
        for(int i=0;i<m-1;i++) {
            double c=1;
            for(int j=0;j<i+1;j++) {
                c=(x-xy[0][j])*c;
            }
            s=s+getmat[i][0]*c;
        }
        return s;
    }
}


