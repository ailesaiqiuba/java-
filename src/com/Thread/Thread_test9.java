package com.Thread;
class YiedThread extends Thread{
	public YiedThread(String name) {
		super(name);
	}
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			if(i==2) {
				System.out.println(Thread.currentThread().getName()+"线程让步");
				Thread.yield();
			}
		}
	}
}
public class Thread_test9 {

	public static void main(String[] args) {
		new YiedThread("thread1").start();
		new YiedThread("thread2").start();

	}

}
