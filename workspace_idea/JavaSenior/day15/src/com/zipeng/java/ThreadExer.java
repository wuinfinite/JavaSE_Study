package com.zipeng.java;

/**
 * @auter zipeng
 * @create &{YEAR}-04-27-14:33
 */
public class ThreadExer {
    public static void main(String[] args) {
//创建Thread类的匿名子类的方式
     new Thread() {
         @Override
         public void run() {
             for (int i = 0; i < 100; i++) {
                 if (i % 2 == 0) {
                     System.out.println(Thread.currentThread().getName() + ":" + i);
                 }
             }
         }
     }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

    }
}
