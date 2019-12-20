package com.ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver_user {

	public static void main(String[] args) throws IOException {
		DatagramSocket server=new DatagramSocket(8900);
		byte[] buy=new  byte[1024];
		DatagramPacket packet=new DatagramPacket(buy, buy.length);
		System.out.println("等待接受数据");
		while(true) {
			server.receive(packet);
			String str=new String(packet.getData());
			System.out.println(packet.getAddress().getHostAddress()+":"+str);
		}

	}

}
