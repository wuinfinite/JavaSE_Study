package com.zipeng.java1;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auter zipeng
 * @create &{YEAR}-05-10-9:45
 */
public class FileInputOutputSteamTest {

    @Test
    public void testFileInputOutputSteam() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1.造文件
            File srcfile = new File("1.jpg");
            File destfile = new File("2.jpg");

            //2.造流
            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);

            //3.复制过程
            byte[] buffer = new byte[5];
            int len;//记录每次读取字符的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    //4.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    //4.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //指定路径下的文件复制
    public void copyFile(String scrPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1.造文件
            File srcfile = new File(scrPath);
            File destfile = new File(destPath);

            //2.造流
            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(destfile);

            //3.复制过程
            byte[] buffer = new byte[1024];
            int len;//记录每次读取字符的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    //4.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    //4.关闭资源
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();

        String srcPath="C:\\Users\\wu\\Desktop\\1.jpg";
        String destPath="C:\\Users\\wu\\Desktop\\2.jpg";
        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间：" +(end-start));//15
    }
}