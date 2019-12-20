package com.string;

public class E54 {
	public static void main(String[] args) {
		String s="     http://localhost:  8080    ";
		System.out.println("去掉字符串俩端的空格："+s.trim());
		System.out.println("去掉字符串中所有的空格"+s.replace(" ",""));
		System.out.println("正则表达式:去掉所有的空格"+s.replaceAll("\\s+",""));
	}
	}


