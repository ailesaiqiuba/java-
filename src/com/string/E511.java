package com.string;

public class E511 {
public static void main(String[] args) {
	int[] srcArry= {1,2,3,4,5,6};
	int[] destArry= {01,02,03,04,05};
	System.arraycopy(srcArry,2,destArry,0,4);
	for(int i=0;i<destArry.length;i++) {
		System.out.print(destArry[i]+",");
	}
}
}
