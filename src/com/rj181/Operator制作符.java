package com.rj181;
public class Operator制作符 {
	public static void main(String[] args) {
//		运算符++
		int a=1;
		int b=1;
		System.out.println("先加表达式的值等于变量的值加一,也就是"+(++a));
		System.out.println("后加表达式的值等于变量的值,也就是"+(b++));
		System.out.println("不管是先加还是后加,变量的值都加了一,也就是"+(+a));
		System.out.println("不管是先加还是后加,变量的值都加了一,也就是"+(+b));
//		赋值运算
		int c=2;
		c+=3;
		System.out.println("执行后变量的值等于"+c);
//		比较运算==
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		E04 t1=new E04();
		E04 t2=new E04();
		System.out.println(t1==t2);
	}

}
