package com.ip.chat;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class chatReceiver extends Runable implements Runnable{
	private DatagramSocket server;
	public chatReceiver(DatagramSocket servers) {
		this.server=servers;
	}
	@Override
	public void run() {
		try {
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
			while(true) {
				server.receive(packet);
				String str=new String(packet.getData(),"UFT-8");
				System.out.println(packet.getAddress().getHostAddress()+":"+str);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
}


	


