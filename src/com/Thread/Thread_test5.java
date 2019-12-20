package com.Thread;
class TicketWindow2  implements Runnable{

	private int xuexibiji=80;
	public void run() {
		while(true) {
			if(xuexibiji>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+xuexibiji--+"分笔记");
			}	
		}
	}
 }
public class Thread_test5 {

	public static void main(String[] args) {
		TicketWindow2 tWindow2=new TicketWindow2();
		new Thread(tWindow2,"王老师").start();
		new Thread(tWindow2,"李老师").start();
		new Thread(tWindow2,"张老师").start();
	

	}

}