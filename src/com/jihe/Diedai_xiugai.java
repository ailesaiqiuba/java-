package com.jihe;
import java.util.ArrayList;
import java.util.Iterator;
public class Diedai_xiugai {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		Iterator diedai=list.iterator();
		while (diedai.hasNext()) {
			Object obj=diedai.next();
			if ("stu2".equals(obj)) {
				list.remove(obj);
				break;
			}
			
		}
		System.out.println(list);	
		
		

	}

}
