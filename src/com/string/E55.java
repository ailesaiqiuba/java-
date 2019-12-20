package com.string;

public class E55 {
public static void main(String[] args) {
	String s="sncxhajhxjhsaxa.text";
	String s2="st";
	System.out.println("判断是否以字符串sn开头吗"+s.startsWith("sn"));
	System.out.println("判断是否以字符串.text结尾吗"+s.endsWith(".text"));
	System.out.println("判断字符串是否为空"+s.contains("ar"));
	System.out.println("判断俩字符串是否相等"+s.equals(s2));
}
}
