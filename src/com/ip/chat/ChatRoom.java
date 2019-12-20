package com.ip.chat;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;
public class ChatRoom {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入端口号：");
		int serverPort=sc.nextInt();
		System.out.println("请输入发送信息的目标端口号：");
		int targetPort=sc.nextInt();
		System.out.println("聊天系统初始化完成并启动！！！");
		try {
			DatagramSocket socket=new DatagramSocket(serverPort);
			new Thread(new chatReceiver(socket),"接受服务").start();
			new Thread(new chatSend(socket,targetPort),"发送服务").start();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}

