package com.zipeng.java;

import sun.print.SunMinMaxPage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @auter zipeng
 * @create &{YEAR}-04-28-11:51
 */
//1.创建一个实现Callable的实现类
class Numthread implements Callable{
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;//不需要返回值即return null
    }

}

public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        Numthread numthread = new Numthread();
        //4.将此Callable接口实现类的对象作为参数传递到FutureTask的构造器中，去创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numthread);
        //5.将FutureTask类的对象作为参数传递到Thread类的构造器中，创建Thead对象，并调用start()
        new Thread(futureTask).start();

        Object sum = null;
        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为futureTask构造器参数Callable实现类重写call()的返回值
            sum = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("总和为：" + sum);

    }
}
