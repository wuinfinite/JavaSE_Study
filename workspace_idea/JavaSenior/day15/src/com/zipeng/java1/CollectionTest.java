package com.zipeng.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auter zipeng
 * @create &{YEAR}-04-30-18:02
 */
public class CollectionTest {
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add(-14);
        list.add(88);
        list.add(56);
        list.add(0);

//        System.out.println(list);

        //Collections.reverse(list);
        //Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.swap(list,1,4);
//        Comparable max = Collections.max(list);
        List dest = Arrays.asList(new Object[list.size()]);//6个null元素放入

        Collections.copy(dest,list);
        System.out.println(dest.size());

        //返回list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);


//        System.out.println(list);
        System.out.println(dest);

    }


}
