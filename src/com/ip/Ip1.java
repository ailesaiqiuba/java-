package com.ip;
import java.io.IOException;
import java.net.InetAddress;
public class Ip1 {

	public static void main(String[] args) throws IOException {
		InetAddress localAddress =InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
		System.out.println("本机的ip地址"+localAddress.getHostAddress());
		System.out.println("itcast的ip地址"+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问"+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名"+remoteAddress.getHostName());
		

	}

}
