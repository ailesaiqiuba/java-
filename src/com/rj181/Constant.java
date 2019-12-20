package com.rj181;
public class Constant {
public static void main(String[] args) {
	System.out.println("二进制以0b开头"+0b11000110);
	System.out.println("八进制以0开头"+0306);
	System.out.println("十进制"+198);
	System.out.println("十六进制以0x开头"+0xc6);
	System.out.println("单精度浮点数"+5.022e+8f);
//	双精度d可以不写
	System.out.println("双精度浮点数"+5.022e+8d);
	System.out.println("双精度浮点数"+5.022e+8);
	System.out.println("我的名字是"+'\u8d75'+'\u7389'+'\u83B9');
//	字符串常量
	System.out.println("welcome to\n daliang ");
//	布尔常量
	System.out.println("布尔常量"+true+"或者"+false);
//	null常量
	System.out.println("引用数据常量"+null);
//	基本数据常量不能赋值NULL
	int a=5;
	//a=null
//	引用数据类型的变量可以赋值为null
	Constant   constant=new Constant();
	 constant =null;
//	如果在类型的前面加上final关键字作为修饰符,那么被修饰的变量就成为常量
//	 他不是字面意义的常量
	 final int b=6;
	 //b=7;
}
}