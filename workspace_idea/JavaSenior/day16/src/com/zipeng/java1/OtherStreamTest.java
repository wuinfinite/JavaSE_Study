package com.zipeng.java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auter zipeng
 * @create &{YEAR}-05-11-18:46
 */
public class OtherStreamTest {

    //键盘输入字符串，要求将读取到整行字符串转成大写输出。然后继续进行输入操作，直到输入“e”或“exit”时，退出程序。
    //方法一：使用Scanner实现，调用next()返回一个字符串
    //方法二：使用System.in实现,System.in----->转换流------> BufferredReader的readerLine()
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while (true) {
                System.out.println("请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data)||"exit".equalsIgnoreCase(data)) {
                    System.out.println("程序结束!");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

