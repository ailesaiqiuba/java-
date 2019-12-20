package com.school;

public class Shenghuo {
	public Shenghuo() {
		System.out.println("构造方法一被调用了");
	}
	public Shenghuo(int x) {
		this();
		System.out.println("构造方法二被调用了 ");
	}
	public Shenghuo(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public static void main(String[] args) {
		Shenghuo test=new Shenghuo(true);
	}

}
