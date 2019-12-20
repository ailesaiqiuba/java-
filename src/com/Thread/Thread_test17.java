package com.Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.naming.spi.DirStateFactory.Result;

public class Thread_test17 {

	 public synchronized static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer>completableFuture1=CompletableFuture.supplyAsync(()->{
			int sum=0,i=0;
			while(i++<5) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在进行...i"+i);
				
			}
			return sum;
		}); 
		CompletableFuture<Integer>completableFuture2=CompletableFuture.supplyAsync(()->{
			int sum=0,j=5;
			while(j++<10) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程任务正在进行...j"+j);
				
			}
			return sum;
		}); 
		CompletableFuture<Integer>completableFuture3=completableFuture1.thenCombine(completableFuture2, (result1,result2)->result1+result2);
		System.out.println("1到10相加结果为："+completableFuture3.get());
			
	

	}

}
