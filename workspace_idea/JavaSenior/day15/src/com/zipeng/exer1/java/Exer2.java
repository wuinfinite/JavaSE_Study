package com.zipeng.exer1.java;

/**
 * @auter zipeng
 * @create &{YEAR}-04-26-19:12
 */

public class Exer2 {
    public static void main(String[] args) {
        String str = "this is Java";
        System.out.println(removeCharAt(str,3));
    }
    public static String removeCharAt(String s,int pos){
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
