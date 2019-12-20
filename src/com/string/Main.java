package com.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();

		ArrayList arrayList = new ArrayList<>();
		long kssj1 = System.currentTimeMillis();
		test.listText(arrayList);
		long jssj1 = System.currentTimeMillis();
		System.out.println("用ArrayList插入15万个元素花费" + (jssj1 - kssj1) + "毫秒");

		LinkedList LinkList = new LinkedList<>();
		long kssj2 = System.currentTimeMillis();
		test.listText(LinkList);
		long jssj2 = System.currentTimeMillis();
		System.out.println("用LinkedList插入15万个元素花费" + (jssj2 - kssj2) + "毫秒");

		long kssj3 = System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3 = System.currentTimeMillis();
		System.out.println("用ArrayList读取15万个元素花费" + (jssj3 - kssj3) + "毫秒");

		long kssj4 = System.currentTimeMillis();
		test.listRead(LinkList);
		long jssj4 = System.currentTimeMillis();
		System.out.println("用LinkedList读取15万个元素花费" + (jssj4 - kssj4) + "毫秒");
	}
}

class Test {
	// Random random=new Random();
	public void listText(List list) {
		for (int i = 0; i < 15000; i++) {
			list.add(0, i);
		}
	}

	public void listRead(List list) {
		for (int i = 15000 - 1; i >= 0; i--) {
			list.get(i);
		}
	}
}
