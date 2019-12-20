package com.rj181;
public class E06 {
	public static void main(String[] args) {
//		逻辑运算
		int x=0;      //定义变量x,初始值为0
		int y=0;      //定义变量y,初始值为0
		int z=0;      //定义变量z,初始值为0
		boolean a,b;
		a=x>0&y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		b=x>0&&z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
//		条件运算
		int store=200;
		System.out.println(store<0?"没有库存啦":store>150?"库存充足":"库存量为:"+store);
	}

}
