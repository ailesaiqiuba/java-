package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		Iterator iterator=list.iterator();
		//用diedai来遍历即合理的每一个元素
		System.out.println("\n1.用diedai来遍历即合理的每一个元素");
		while (iterator.hasNext()) {
			String sym=(String) iterator.next();
			System.out.print(sym+"  ");
		}
		//用foreach循环来遍历即合理的每一个元素
		System.out.println("\n2.用foreach循环来遍历即合理的每一个元素");
		for(Object obj:list) {
			System.out.print(obj+"  ");
		}
		//用lanmand表达式来遍历即合理的每一个元素
		System.out.println("\n3.用lanmand表达式来遍历即合理的每一个元素");
		list.forEach(obj->System.out.print(obj+"  "));
		//迭代表达式来遍历即合理的每一个元素
		System.out.println("\n4.迭代表达式来遍历即合理的每一个元素");
		Iterator it=list.iterator();
		it.forEachRemaining(obj->System.out.print(obj+"  "));
	}

}
