package com.zipeng.java;

import java.io.Serializable;

/**
 * Person满足以下要求，方可序列化
 * 1.需要实现接口：Serializable
 *2.当前类提供一个全局常量：serialVersionUID(标识的作用，任意取值)
 *
 * @auter zipeng
 * @create &{YEAR}-05-28-10:29
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 165461264165L;

    private String name;
    private int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
