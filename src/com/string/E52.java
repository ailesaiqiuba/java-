package com.string;

public class E52 {
public static void main(String[] args) {
	int a[]= {1,2,3};
	System.out.println(a.length);
	String string="abcabcabcabc";
	System.out.println("字符串的长度为："+string.length());
	System.out.println("字符串中的第一个字符"+string.charAt(0));
	System.out.println("字符串中的第er个字符"+string.charAt(1));
	//'A'=65 'a'=97 'c'=99
	System.out.println("字符c第一次出现的位置"+string.indexOf('c'));
	//驼峰命名原则：除了第一个英语单词首字母小写
	//其他英语单词都是首字母大写
	System.out.println("字符c最后一次出现的位置"+string.lastIndexOf('c'));
	System.out.println("子字符串第一次出现的位置"+string.indexOf("ab"));
	System.out.println("子字符串最后一次出现的位置"+string.lastIndexOf("ab"));
}
}
