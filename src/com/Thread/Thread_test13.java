package com.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class lockThread implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
	public void run() {
		while (true) {
			lock.lock();
			if(tickets>0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
				
			}
		}
	}
}

public class Thread_test13 {

	public static void main(String[] args) {
		lockThread  saleThread=new lockThread ();
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();

	}

}
