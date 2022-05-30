package com.zipeng.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auter zipeng
 * @create &{YEAR}-05-29-18:52
 */
public class TcpTest2 {

    /**
     * 例题2：客户端发送文件给服务端，服务端将文件保存在本地
     *
     * @author
     * @create 2022-05-03-15:25
     */
    /*
    这里涉及到的异常应该使用try-catch-finally处理
     */
        @Test
        public void client() throws IOException {

            Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

            OutputStream os = socket.getOutputStream();

            FileInputStream fis = new FileInputStream(new File("1.jpg"));

            byte[] buffer=new byte[1024];
            int len;
            while ((len=fis.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

            fis.close();
            os.close();
            socket.close();
        }

        @Test
        public void server() throws IOException {

            ServerSocket serverSocket = new ServerSocket(9090);

            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();

            FileOutputStream fos = new FileOutputStream(new File("4.jpg"));

            byte[] buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }

            fos.close();
            is.close();
            socket.close();
            serverSocket.close();
        }

}
