package com.zipeng.java;

/**
 * 三个窗口卖100张票,使用继承Thread类的方法
 *
 *                 存在线程安全问题-->同步代码块解决
 *
 * @auter zipeng
 * @create &{YEAR}-04-27-15:48
 */
public class WindowsTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}


class Window extends Thread{
    private static int ticket = 100;//静态票即三个窗口公用100张票

    //private static Object obj = new Object();//同一把锁
    @Override
    public void run() {

        while (true) {
            //synchronized (obj) {
            synchronized (Window.class) {//类也是对象
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}