package com.string;

public class E56 {
	public static void main(String[] args) {
		String string="2019-10-12";
		System.out.println("今天是"+string.substring(0,4)+"年");
		System.out.println(string.substring(5,7)+"月");
		System.out.println(string.substring(8,10)+"日");
		
		String[] string2 =string.split("-");
		System.out.println("今天是"+string2[0]+"年"+string2[1]+"月"+string2[2]+"日");
	}

}
