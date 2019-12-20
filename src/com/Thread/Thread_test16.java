package com.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//定义一个实现callable接口的实现类
class MyThread4 implements Callable<Object>{
//重写callable接口的call()方法
	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call()方法在运行");
		}
		return i;
	}
	
}

public class Thread_test16 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建callable接口的实现类对象
		MyThread4 myThread4=new MyThread4();
		//使用executors线程执行器类创建可扩展的线程池
		ExecutorService executor=Executors.newCachedThreadPool();
		//将callable接口实现类对象提交到线程池进行管理
		Future<Object>result1=executor.submit(myThread4);
		Future<Object>result2=executor.submit(myThread4);
		//关闭线程池
		executor.shutdown();
		//对于有返回值的线程任务，获取执行结果  
		System.out.println("thread-1返回结果："+result1.get());
		System.out.println("thread-2返回结果："+result2.get());

	}

}
