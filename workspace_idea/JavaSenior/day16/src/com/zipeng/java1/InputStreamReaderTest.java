package com.zipeng.java1;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @auter zipeng
 * @create &{YEAR}-05-11-15:56
 */
public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("jjd.txt");
        //InputStreamReader isr = new InputStreamReader(fis);//使用系统默认字符集
        //参数二指明了字符集，具体使用哪个字符集，取决于存取jjd时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        char[] cubf = new char[20];
        int len;
        while ((len = isr.read(cubf)) != -1) {
            String str = new String(cubf,0,len);
            System.out.println(str);
        }

        isr.close();

    }

    @Test
    public void test2() throws IOException {

        File file1 = new File("jjd.txt");
        File file2 = new File("jjd_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");

        char[] cubf = new char[20];
        int len;
        while ((len = isr.read(cubf)) != -1) {
            osw.write(cubf,0,len);
        }

        isr.close();
        osw.close();

    }
}
