package com.Thread;


	class MyThread_ extends Thread{

		public MyThread_(String name) {
			super(name);
			// TODO 自动生成的构造函数存根
		}
		public void run() {
			int i=0;
			while(i++<5) {
				System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
				//i++;
			}
		}
	 }

	public class Thread_test2 {

		public static void main(String[] args) {
			MyThread_ thread1=new MyThread_("线程1");
			Thread t1=new Thread(thread1,"线程1");
			t1.start();
			MyThread_ thread2=new MyThread_("线程2");
			Thread t2=new Thread(thread2,"线程2");
			t2.start();
			
		}

	}


