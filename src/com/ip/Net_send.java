package com.ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Net_send {

	public static void main(String[] args) throws IOException {
	DatagramSocket client=new DatagramSocket(3000);
	String string="问候";
	DatagramPacket packet=new DatagramPacket(string.getBytes("UTF-8"), 
			string.getBytes().length,InetAddress.getByName("10.2.103.231"),8900);
	System.out.println("开始发送信息......");
	client.send(packet); // 发送数据
	client.close();  //释放资源

	}

}
