package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread_i implements Callable<Object> {
	public MyThread_i(String name) {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
			//i++;
		}
		return i;
	}
 }
public class Thread_test3 {
	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread_i thread1=new MyThread_i("线程1");
		FutureTask<Object> ft1=new FutureTask<Object>(thread1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		MyThread_i thread2=new MyThread_i("线程1");
		FutureTask<Object> ft2=new FutureTask<Object>(thread2);
		Thread t2=new Thread(ft2,"线程1");
		t2.start();
		System.out.println("返回线程1结果"+ft1.get());
		System.out.println("返回线程2结果"+ft2.get());
		
		new Thread(new FutureTask<Object>(new MyThread_i("线程3"))).start();
		System.out.println("返回线程1结果"+ft1.get());
		System.out.println("返回线程2结果"+ft2.get());
	}
}
