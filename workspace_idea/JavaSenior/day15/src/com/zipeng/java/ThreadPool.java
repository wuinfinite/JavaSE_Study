package com.zipeng.java;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auter zipeng
 * @create &{YEAR}-04-28-18:34
 */

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池service
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2.执行指定的线程操作。需要提供实现Runnable接口或者Callable接口实现类的对象
        service.execute(new NumberThread());//适合使用于Runnable
        service.execute(new NumberThread1());//适合使用于Runnable

        //service.submit();适合使用Callable

        service.shutdown();//3.关闭连接池

    }
}
