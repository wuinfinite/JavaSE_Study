package com.zipeng.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @auter zipeng
 * @create &{YEAR}-04-30-8:51
 */

public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "BB", "DD", "MM", "JJ", "CC"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[3];
        arr[0] = new Goods("xiaomi", 3500);
        arr[1] = new Goods("hongmi", 2000);
        arr[2] = new Goods("huawei", 2070);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3() {
        String[] arr = new String[]{"AA", "BB", "DD", "MM", "JJ", "CC"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入数据不一致！");
            }

        });
        System.out.println(Arrays.toString(arr));

    }

}
