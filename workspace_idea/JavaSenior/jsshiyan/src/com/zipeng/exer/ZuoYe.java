package com.zipeng.exer;

/**
 *不选主元消元法
 *
 * @auter zipeng
 * @create &{YEAR}-05-18-18:56
 */
public class ZuoYe {
    public static void main(String[] args) {

        ZuoYe zuoYe1 = new ZuoYe();

        double x1;
        double x2;
        double x3;
        double x4;

        double arr11[] = {0.3e-15, 59.14, 3.0, 1.0, 59.17};
        double arr22[] = {5.291, -6.130, -1.0, 2.0, 46.78};
        double arr33[] = {11.2, 9.0, 5.0, 2.0, 1.0};

        double arr1[] = {0.3e-15, 59.14, 3.0, 1.0, 59.17};
        double arr2[] = {5.291, -6.130, -1.0, 2.0, 46.78};
        double arr3[] = {11.2, 9.0, 5.0, 2.0, 1.0};
        double arr4[] = {1.0, 2.0, 1.0, 1.0, 2.0};

        //arr2第一位消元
        zuoYe1.SCMethod1(arr11,arr2);//更新
//        zuoYe1.ForArray(arr1);
//        System.out.println();
//        zuoYe1.ForArray(arr2);
//        System.out.println();
//        zuoYe1.ForArray(arr3);
//        System.out.println();
//        zuoYe1.ForArray(arr4);

        zuoYe1.RSMethod(arr22,arr2);
        //重置arr11
        zuoYe1.RSMethod(arr11,arr1);

        //arr3第一位消元
        zuoYe1.SCMethod1(arr11,arr3);//更新
//        zuoYe1.ForArray(arr3);
        //重置arr11
        zuoYe1.RSMethod(arr11,arr1);

        //arr4第一位消元
        zuoYe1.SCMethod1(arr11,arr4);//更新
//        zuoYe1.ForArray(arr4);


        //arr3第二位消元
        zuoYe1.SCMethod2(arr22,arr3);//更新
//        zuoYe1.ForArray(arr3);
        zuoYe1.RSMethod(arr33,arr3);
        //重置arr22
        zuoYe1.RSMethod(arr22,arr2);

        //arr4第二位消元
        zuoYe1.SCMethod2(arr22,arr4);//更新
//        zuoYe1.ForArray(arr4);



        //arr4第三位消元
        zuoYe1.SCMethod3(arr33,arr4);//更新
//        zuoYe1.ForArray(arr4);

        zuoYe1.ForArray(arr1);
        System.out.println();
        zuoYe1.ForArray(arr2);
        System.out.println();
        zuoYe1.ForArray(arr3);
        System.out.println();
        zuoYe1.ForArray(arr4);

//        x4 = arr4[4] / arr4[3];
//        x3 = (arr3[4] - x4 * arr3[3]) / arr3[2];
//        x2 = (arr2[4] - x4 * arr2[3] - x3 * arr2[2]) / arr2[1];
//        x1 = (arr1[4] - x4 * arr1[3] - x3 * arr1[2] - x2 * arr1[1]) / arr1[0];
//
//        System.out.println("x1的值为：" + x1);
//        System.out.println("x2的值为：" + x2);
//        System.out.println("x3的值为：" + x3);
//        System.out.println("x4的值为：" + x4);






    }


    public void SCMethod1(double array[],double array2[]) {//数组元素的第一次更新

        double a= array2[0];

        for (int i = 0; i < array.length; i++) {

            array2[i] = array2[i] - (array[i] / array[0]) * a;
        }
    }

    public void SCMethod2(double array[],double array2[]) {//数组元素的第二次更新

        double a= array2[1];

        for (int i = 1; i < array.length; i++) {

            array2[i] = array2[i] - (array[i] / array[1]) * a;
        }
    }

    public void SCMethod3(double array[],double array2[]) {//数组元素的第三次更新

        double a= array2[2];

        for (int i = 2; i < array.length; i++) {

            array2[i] = array2[i] - (array[i] / array[2]) * a;
        }
    }

    public void RSMethod(double arr[],double array[]) {//数组元素的重置

        for (int i = 0; i < array.length; i++) {
            arr[i]=array[i];
        }
    }


    public void ForArray(double array[]) {//数组元素的遍历
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t\t" + array[i]);
        }
    }


//    public double CutOff(double m) {//保留小数点后15位
//
//        DecimalFormat df=new DecimalFormat("#.000000000000000");
//        df.setRoundingMode(RoundingMode.FLOOR);
//        double s = Double.parseDouble(df.format(m));//将字符串转换为数字
//        return s;
//    }
}

