package com.zipeng.exer;

/**
 * 列主元消元法
 * @auter zipeng
 * @create &{YEAR}-05-19-8:12
 */
public class ZuoYe1 {
    public static void main(String[] args) {
        ZuoYe1 ye1 = new ZuoYe1();

        double x1;
        double x2;
        double x3;
        double x4;

        double arr1[] = {0.3e-15, 59.14, 3.0, 1.0, 59.17};
        double arr2[] = {5.291, -6.130, -1.0, 2.0, 46.78};
        double arr3[] = {11.2, 9.0, 5.0, 2.0, 1.0};
        double arr4[] = {1.0, 2.0, 1.0, 1.0, 2.0};

        //第一列arr3[0]绝对值大，调换1，3位置
        ye1.Change(arr1,arr3);
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {5.291, -6.130, -1.0, 2.0, 46.78};
//        double arr3[] = {0.3e-15, 59.14, 3.0, 1.0, 59.17};
//        double arr4[] = {1.0, 2.0, 1.0, 1.0, 2.0};

        //arr2第一位消元
        ye1.SCMethod1(arr1,arr2);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0.0,-10.381696428571429,-3.3620535714285715,1.0551785714285713,46.307589285714286};
//        double arr3[] = {0.3e-15, 59.14, 3.0, 1.0, 59.17};
//        double arr4[] = {1.0, 2.0, 1.0, 1.0, 2.0};

        //arr3第一位消元
        ye1.SCMethod1(arr1,arr3);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0.0,-10.381696428571429,-3.3620535714285715,1.0551785714285713,46.307589285714286};
//        double arr3[] = {0, 59.14, 3.0, 1.0, 59.17};//精度缺失
//        double arr4[] = {1.0, 2.0, 1.0, 1.0, 2.0};

        //arr4第一位消元
        ye1.SCMethod1(arr1,arr4);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0.0,-10.381696428571429,-3.3620535714285715,1.0551785714285713,46.307589285714286};
//        double arr3[] = {0, 59.14, 3.0, 1.0, 59.17};//精度缺失
//        double arr4[] = {0.0,1.1964285714285714,0.5535714285714286,0.8214285714285714,1.9107142857142858};


        //第二列arr3[1]绝对值大，调换2，3位置
       ye1.Change(arr2,arr3);
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0, 59.14, 3.0, 1.0, 59.17};
//        double arr3[] = {0.0,-10.381696428571429,-3.3620535714285715,1.0551785714285713,46.307589285714286};
//        double arr4[] = {0.0,1.1964285714285714,0.5535714285714286,0.8214285714285714,1.9107142857142858};

//        //arr3第二位消元
        ye1.SCMethod2(arr2,arr3);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0, 59.14, 3.0, 1.0, 59.17};
//        double arr3[] = {0.0,0.0,-2.8354203403546068,1.2307229817865597,56.694552046596456};
//        double arr4[] = {0.0,1.1964285714285714,0.5535714285714286,0.8214285714285714,1.9107142857142858};

        //arr4第二位消元
        ye1.SCMethod2(arr2,arr4);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0, 59.14, 3.0, 1.0, 59.17};
//        double arr3[] = {0.0,0.0,-2.8354203403546068,1.2307229817865597,56.694552046596456};
//        double arr4[] = {0.0,0.0,0.49288009082564377,0.8011981255133098,0.7136788009082564};


        //第三列arr3[2]绝对值大，不调换
        //arr4第三位消元
        ye1.SCMethod3(arr3,arr4);//更新
//        double arr1[] = {11.2, 9.0, 5.0, 2.0, 1.0};
//        double arr2[] = {0, 59.14, 3.0, 1.0, 59.17};
//        double arr3[] = {0.0,0.0,-2.8354203403546068,1.2307229817865597,56.694552046596456};
//        double arr4[] = {0.0,0.0,0.0,1.015134255691562,10.568872249422114};
//        ye1.ForArray(arr1);
//        System.out.println();
//        ye1.ForArray(arr2);
//        System.out.println();
//        ye1.ForArray(arr3);
//        System.out.println();
//        ye1.ForArray(arr4);

        x4 = arr4[4] / arr4[3];
        x3 = (arr3[4] - x4 * arr3[3]) / arr3[2];
        x2 = (arr2[4] - x4 * arr2[3] - x3 * arr2[2]) / arr2[1];
        x1 = (arr1[4] - x4 * arr1[3] - x3 * arr1[2] - x2 * arr1[1]) / arr1[0];

        System.out.println("x1的值为：" + x1);
        System.out.println("x2的值为：" + x2);
        System.out.println("x3的值为：" + x3);
        System.out.println("x4的值为：" + x4);
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

        for (int i = 1; i < array.length; i++) {

            array2[i] = array2[i] - (array[i] / array[2]) * a;
        }
    }

    public void ForArray(double array[]) {//数组元素的遍历
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t\t" + array[i]);
        }
    }


    public void Change(double arr[],double array[]) {//数组的互换
        double[] array1 = new double[5];
        for (int i = 0; i < array.length; i++) {
            array1[i] = arr[i];
            arr[i] = array[i];
            array[i] = array1[i];
        }
    }
}
