package com.school;

public class Overload {
	
	//实现两个数相加
	public static int add(int x,int y) {
		return x+y;
	}
	//实现三个数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//实现俩个小数相加
	public static double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(add(3, 9));
		System.out.println(add(4, 7, 2));
		System.out.println(add(3.2, 6.9));
		
	}

}
