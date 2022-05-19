package com.zipeng.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *
 * @auter zipeng
 * @create &{YEAR}-04-28-10:30
 */
public class WindowsTest2 {
    public static void main(String[] args) {
        Windows2 w = new Windows2();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
class Windows2 implements Runnable{
    private  int ticket = 100;//不需要static

    private ReentrantLock lock = new ReentrantLock();//1.实例化ReentrantLock

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//2.调用锁定方法
                if (ticket > 0) {

                    try {//注意
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;

                }
            }finally {
                lock.unlock();//3.解锁
            }

        }
    }
}