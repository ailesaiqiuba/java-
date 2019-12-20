package com.ip.chat;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class chatSend implements Runnable {
	private DatagramSocket Client;
	private int targetPort;
	
	public chatSend(DatagramSocket client, int targetPort) {
		this.Client=client;
		this.targetPort=targetPort;
	}
	@Override
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			while(true) {
				String data=sc.nextLine();
				byte[] buy=data .getBytes();
					DatagramPacket packet=new DatagramPacket(buy, buy.length,InetAddress.getByName("10.2.103.35"),targetPort);
					Client.send(packet);
			}
		}catch (Exception e) {
				e.printStackTrace();
		}
	}
}

	


