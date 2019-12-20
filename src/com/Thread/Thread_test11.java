package com.Thread;


class SaleThread implements Runnable{
	private int tickets=100;
	Object lock=new Object();
	public void run() {
		while (true) {
			synchronized (lock) {
				if(tickets>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				}
			}
		}
		
	}
			}
			
public class Thread_test11 {

	public static void main(String[] args) {
		SaleThread saleThread=new SaleThread();
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();
	}

}
