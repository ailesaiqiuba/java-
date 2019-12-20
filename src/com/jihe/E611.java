package com.jihe;

import java.util.TreeSet;

public class E611 {
public static void main(String[] args) {
	TreeSet <Integer> tSet=new TreeSet<Integer>();
	tSet.add(3);
	tSet.add(45);
	tSet.add(35);
	tSet.add(11);
	tSet.add(43);
	tSet.add(45);
	tSet.add(55);
	tSet.add(10);
	System.out.println("创建的集合为"+tSet);
	System.out.println("集合尾部的元素为"+tSet.last());
	System.out.println("集合首的元素为"+tSet.first());
	System.out.println("集合中小于或等于35的一个最大的元素为"+tSet.floor(35));
	System.out.println("集合中da于10的一个最小的元素为"+tSet.higher(10));
	System.out.println("集合中da于100的一个最小的元素为"+tSet.higher(100));
	
	Object first=tSet.pollFirst();
	System.out.println("删除的第一个元素是"+first);
	System.out.println("删除第一个元素后集合变为"+tSet);
}
}
