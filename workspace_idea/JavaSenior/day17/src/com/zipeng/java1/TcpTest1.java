package com.zipeng.java1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auter zipeng
 * @create &{YEAR}-05-29-17:23
 */
public class TcpTest1 {
    @Test
    //客户端
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        try {
            //1.创建了Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);

            //2.获取一个输出流，用来输出数据
            os = socket.getOutputStream();

            //3.写出数据的操作
            os.write("hello,server!".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源的关闭
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    //服务器端
    public void server() {

        Socket socket = null;
        InputStream is = null;
        ServerSocket  ss = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);

            //2.调用accept()表示接收来自的客户端的socket
            socket = ss.accept();

            //3.获取一个输入流
            is = socket.getInputStream();

            //不建议这样谢，可能会乱码
//            byte[] buffer = new byte[20];
//            int len;
//            while ((len = is.read(buffer)) != -1) {
//                String str = new String(buffer,0,len);
//                System.out.println(str);
//        }

            //4.读取输入流的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[20];
            int len;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer,0,len);//存入baos内部数组
            }

            System.out.println(baos.toString());//从baos内部数组输出数据
            System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+ "的数据");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.资源的关闭
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
