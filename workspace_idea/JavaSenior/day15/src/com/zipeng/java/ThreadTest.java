package com.zipeng.java;

/**
 *多线程
 *
 *
 * @auter zipeng
 * @create &{YEAR}-04-26-11:01
 */

class  MyThead extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThead t1 = new MyThead();//主线程行为,创建Thread类的子类对象

//      t1.run();单线程
        t1.start();//启动当前线程；调用当前线程的run()体现多线程
        //在启动一个线程遍历100以内的偶数，不可用已经start（）的线程去执行
        MyThead t2 = new MyThead();
        t2.start();//重新创建线程的对象

//        System.out.println("hello");
        //如下操作依然在main线程中执行
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "main**********");
            }
        }
    }
    
}
