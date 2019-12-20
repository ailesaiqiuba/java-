package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class E69 {

	public static void main(String[] args) {
		//hashset不出现重复元素，按字母顺序排列
		HashSet <String>set=new HashSet<String>();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		System.out.println(set);
		
		//arraylist重复出现相同的元素
		ArrayList <String>di=new ArrayList<String>();
		di.add("Jack");
		di.add("Eve");
		di.add("Rose");
		di.add("Rose");
		System.out.println(di);

	}

}
