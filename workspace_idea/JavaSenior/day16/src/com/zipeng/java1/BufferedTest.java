package com.zipeng.java1;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @auter zipeng
 * @create &{YEAR}-05-11-9:13
 */
public class BufferedTest {
//  实现非文本的复制
    @Test
    public void BufferedStreamTest() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //方式一：
            //1.造文件
            File scrFile = new File("1.jpg");
            File destFile = new File("3.jpg");
            //2.造流
            //2.1造节点流
            fis = new FileInputStream(scrFile);
            fos = new FileOutputStream(destFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制的细节:读取、写入
            byte[] buffer = new byte[5];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭:先关外层，在关内层
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            //4.1关闭外层的同时也会关闭内层
//            fis.close();
//            fos.close();
        }
    }



    @Test
    //文本文件的复制
    public void testBufferedReaderBufferedWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //创建文件和相应地流
            br = new BufferedReader(new FileReader(new File("jjd.txt")));
            bw = new BufferedWriter(new FileWriter(new File("jjd1.txt")));

            //方式一：
//            //读写操作
//            char[] cubf = new char[1024];
//            int len;
//            while ((len = br.read()) != -1) {
//                bw.write(cubf,0,len);
//    //            bw.flush();
//            }

            //方式二：
            //读写操作
            String data;
            while ((data = br.readLine())!= null) {
                //bw.write(data);//data中不包含换行符
                //换行方式一：
                //bw.write(data + "\n");

                //换行方式二:
                bw.write(data);
                bw.newLine();

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
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
