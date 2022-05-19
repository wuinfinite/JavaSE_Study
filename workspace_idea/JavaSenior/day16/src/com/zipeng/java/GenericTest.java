package com.zipeng.java;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @auter zipeng
 * @create &{YEAR}-05-05-9:35
 */
public class GenericTest {
    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(89);
        list.add(70);
        list.add(60);

//        for (Integer score : list) {
//            int stuScore = score;
//            System.out.println(stuScore);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);

        }

    }

    @Test
    public void test2() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 78);
        map.put("Jack", 60);
        map.put("Jerry", 98);
//      泛型的嵌套
        Set<Map.Entry<String,Integer>> entry =  map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            int value = e.getValue();
//            System.out.println(e);

            System.out.println(key + "----" + value);

        }
    }
}
