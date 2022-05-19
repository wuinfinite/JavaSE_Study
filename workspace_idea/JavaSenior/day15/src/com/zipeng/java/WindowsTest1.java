package com.zipeng.java;

/**
 * 三个窗口卖100张票
 *                  存在线程安全问题-->同步代码块解决
 * @auter zipeng
 * @create &{YEAR}-04-27-16:20
 */
public class WindowsTest1 {
    public static void main(String[] args) {
        Windows1 w = new Windows1();

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

class Windows1 implements Runnable{
    private  int ticket = 100;//不需要static

    //Object obj = new Object();//多个线程公用一个锁

    @Override
    public void run() {
        while (true) {
            //synchronized (obj) {
            synchronized (this) {//此时的this唯一
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}