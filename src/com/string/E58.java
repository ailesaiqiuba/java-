package com.string;
public class E58 {

	public static void main(String[] args) {
		System.out.println("添加----------");
		add();
		System.out.println("修改----------");
		update();
		System.out.println("删除----------");
		delete();	
	
	}
private static void update() {
	StringBuffer sr=new StringBuffer("AB,CDEF");
	sr.replace(2, 3, "。");
	System.out.println("替换指定位置的字符"+sr);
	sr.setCharAt(0, '2');
	System.out.println("setCharAt替换指定位置的字符"+sr);
		
	}
private static void delete() {
		StringBuffer sb=new StringBuffer("AB,CDEF");
		sb.delete(2, 3);
		System.out.println("删除既定位置的结果"+sb);
		sb.deleteCharAt(2);
		System.out.println("删除后结果"+sb);
		sb.delete(0, sb.length());
		System.out.println("清空缓冲区结果"+sb);
		
	}
public static void add() {
	StringBuffer string=new StringBuffer();
	string.append("abc");
	System.out.println("append添加结果："+string);
	string.insert(3, "DE");
}
}
