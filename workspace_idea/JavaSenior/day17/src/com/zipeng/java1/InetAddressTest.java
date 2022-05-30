package com.zipeng.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auter zipeng
 * @create &{YEAR}-05-29-16:39
 */
public class InetAddressTest {

    public static void main(String[] args) {

        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本机ip
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            System.out.println(inet4.getHostName());
            System.out.println(inet4.getHostAddress());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
