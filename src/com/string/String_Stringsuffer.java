package com.string;

public class String_Stringsuffer {
	public static void main(String[] args) {
		String s1=	new String("abc");
		String s2=	new String("abc");
		if(s1.equals(s2)) {
			System.out.println("s1和s2相等");
		}
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		if(sb1.equals(sb2)) {
			System.out.println("sb1和sb2相等");
		}else {
			System.out.println("sb1和sb2不相等");
		}	
		
	}

}
