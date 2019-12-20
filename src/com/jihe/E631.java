package com.jihe;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E631 {

	public static void main(String[] args) {
		List<String > list=new ArrayList<String>();
		list.add("张理");
		list.add("历史");
		list.add("张问");
		list.add("张学");
		list.add("张老大");
		list.add("张大佬");
		list.add("张学友");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(4);
		
		stream3.forEach(j->System.out.println(j));
		System.out.println("===========");
		list.stream().filter(i->i.startsWith("张")).filter(i->i.length()>2)
		.skip(1).forEach(j->System.out.println(j));
		
		
		
		
		String shu=list.stream().filter(i->i.startsWith("张")).collect(Collectors.joining("  "));
		System.out.println(shu);
		List<String> shu1=list.stream().filter(i->i.startsWith("张")).collect(Collectors.toList());
		System.out.println(shu1);
	}

}
