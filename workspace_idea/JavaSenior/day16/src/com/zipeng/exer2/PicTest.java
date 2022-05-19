package com.zipeng.exer2;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auter zipeng
 * @create &{YEAR}-05-11-15:05
 */
public class PicTest {
    //图片加密
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("1.jpg");
            fos = new FileOutputStream("1secret.jpg");

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read()) != -1) {
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i]^5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    //图片解密
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("1secret.jpg");
            fos = new FileOutputStream("4.jpg");

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read()) != -1) {
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i]^5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
