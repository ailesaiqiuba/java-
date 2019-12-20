package com.jihe;

public class E65 {
static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		for(String strs:strs) {
			strs="ddd";
		}
     System.out.println(strs[0]+","+strs[1]+","+strs[2]+",");
		for (int i = 0; i < strs.length; i++) {
			strs[i]="ddd";
			
		}
		 System.out.println(strs[0]+","+strs[1]+","+strs[2]+",");
	}

}
