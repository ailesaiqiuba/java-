package com.gc;
class person{
	public void finalize(){
		System.out.println("对象将被作为垃圾回收。。。");
	}	
}

public class E37 {
	public static void main(String[] args) {
		lajihushou1();
		System.out.println("------------------------------");
		lajihuishou2();
		
	}
	private static void lajihushou1() {
		person p1=new person();
		p1=null;
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中......");
			i++;
		}
		
	}

	private static void lajihuishou2() {
		person p2=new person();
		p2=null;//使p1对象成为垃圾，对象为空，不再使用
		System.gc();//强制垃圾回收
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中......");
			i++;
		}
		
	}

	
}
