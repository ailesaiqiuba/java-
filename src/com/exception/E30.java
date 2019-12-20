package com.exception;
class BLCException extends Exception{

	public BLCException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BLCException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E30 {
	public static int divide(int x,int y)throws BLCException {
		if(y==0) {
			throw new BLCException("除数为0"); 
		}
			int result=x/y;
			return result;
	}
	public static void main(String[] args) {
		try {
			int result=divide(4,0);
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("捕获的异常信息为："+e.getMessage());
		}
	}
}
