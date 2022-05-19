package com.zipeng.java1;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @auter zipeng
 * @create &{YEAR}-05-09-9:29
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsoluteFile());

        File file1 = new File("day16//hello.txt");
        System.out.println(file.getAbsoluteFile());
    }

    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");//相较于当前Module
//        System.out.println(file.getAbsoluteFile());

//      2.提供具体的流
            fr = new FileReader(file);

//      3.数据的读入
            //read()：返回读入的一个字符。如果达到文件末尾，返回-1
            //方式一
//        int data = fr.read();
//        while (data != -1) {
//            System.out.print((char)data);
//            data = fr.read();
//        }
            //方式二:语法上的修改
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //      4.流的关闭操作
            try {
                if (fr != null) {
                    fr.close();//一定要手动关闭，jvm对流无能为力
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
