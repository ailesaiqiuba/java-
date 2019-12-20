package com.Thread;
class DamonThread implements Runnable {
	public void run() {
		while(true) {
			System.out .println(Thread.currentThread().getName());
		}
	}
}
public class Test7 {

	public static void main(String[] args) {
		if(!Thread.currentThread().isDaemon()) {
			System.out.println("main线程是前台线程");
		}
		DamonThread dt=new DamonThread();
		Thread t=new Thread(dt,"后台线程");
		
		if(!t.isDaemon()) {
			System.out.println("thread线程不是后台线程");	
		}
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
