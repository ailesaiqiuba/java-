package com.rj181;
public class Maopao {
	public static void main(String[] args) {
	int []a= {9,8,3,5,2};
	System.out.println("数组的长度"+a.length);
	System.out.print("初始数组中的每个元素:");
	for(int xiaoa:a) {
		System.out.print(xiaoa+"  ");
	}
	for (int i = 1; i < a.length; i++) {
		for (int j = 0; j < a.length-i; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
	System.out.println();
	System.out.print("排序后的数组:");
	for(int xiaoa:a) {
		System.out.print(xiaoa+"  ");
	}
  }
}
