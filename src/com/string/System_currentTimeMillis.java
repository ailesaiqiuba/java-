package com.string;

public class System_currentTimeMillis {
	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for(long  i=0;i<10000000000l;i++) {
			sum+=i;
		}
		long jusj=System.currentTimeMillis();
		System.out.println("运行的时间为："+(jusj-kssj)+"毫秒");
		
	}

}
