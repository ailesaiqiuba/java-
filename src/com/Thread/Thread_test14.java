package com.Thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object kinfeAndFork=new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (kinfeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---kinfeAndFork");
					}
				}
				
			}
			
		}
		else {
				while(true) {
					synchronized (kinfeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---kinfeAndFork");
						synchronized (chopsticks) {
							System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					}
				}
			}
		}
	}
		
}
public class Thread_test14 {
	public static void main(String[] args) {
	DeadLockThread thread1=new DeadLockThread(true);
	DeadLockThread thread2=new DeadLockThread(false);
	new Thread(thread1,"chinese").start();
	new Thread(thread2,"nmcnhdbh").start();

	}

}
