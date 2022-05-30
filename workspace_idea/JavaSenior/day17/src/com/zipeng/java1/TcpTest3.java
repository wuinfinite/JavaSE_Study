package com.zipeng.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP网络编程
 * 例题3：从客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端，并关闭相应的连接
 * @author
 * @create 2022-05-03-15:48
 */
public class TcpTest3 {
    //这里涉及到的异常应该使用try-catch-finally处理

    @Test
    public void client() throws IOException {
        //1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        //2.
        OutputStream os = socket.getOutputStream();
        //3.
        FileInputStream fis = new FileInputStream(new File("preview.jpg"));
        //4.
        byte[] buffer=new byte[1024];
        int len;
        while ((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }

        //关闭数据的输出，如果不关闭，服务器端一直都在等待传输数据
        socket.shutdownOutput();

        //5.接受来自于服务器端的数据，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] buffer1=new byte[20];
        int len1;
        while ((len1=is.read(buffer1))!=-1){
            baos.write(buffer1,0,len1);

        }
        System.out.println(baos.toString());
        //6.
        baos.close();
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        //1.
        ServerSocket serverSocket = new ServerSocket(9090);
        //2.
        Socket socket = serverSocket.accept();
        //3.
        InputStream is = socket.getInputStream();
        //4.
        FileOutputStream fos = new FileOutputStream(new File("preview1.jpg"));
        //5.
        byte[] buffer=new byte[1024];
        int len;
        while ((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        System.out.println("图片传输完成！");

        //6.服务器端给与客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，客户端，你的文件已经收到".getBytes());

        //7.
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
