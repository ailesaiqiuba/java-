package com.exception;

public class E29 {
	public static int divide(int x,int y) {
		try {
			int result=x/y;
			return result;
		} catch (Exception e) {
			System.out.println("捕获的信息为："+e.getMessage());
		}finally {
			System.out.println("finally代码块，无论程序是否异常都会执行。");
		}
		return -1;
	}
	public static void main(String[] args) {
		int result=divide(4, 1);
		if(result==-1) {
			System.out.println("程序发生异常");
		}
		else {
			System.out.println(result);
		}
	}

}
