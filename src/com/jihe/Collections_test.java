package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list,"赵","莹","玉");
		System.out.println("排序前"+list);
		Collections.reverse(list);
		System.out.println("反转之后"+list);
		Collections.sort(list);
		System.out.println("排序后"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后"+list);

	}

}
