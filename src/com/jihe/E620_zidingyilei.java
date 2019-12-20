package com.jihe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class CustomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String) o1;
		String key2=(String) o2;
		return key2.compareTo(key1);
	}
	
}
public class E620_zidingyilei {

	public static void main(String[] args) {
		Map <String,String>map=new TreeMap<String,String>(new CustomComparator());
		map.put("2", "Lucy");
		map.put("3", "Smith");
		map.put("1", "Johe");
		map.put("5", "Amanda");
		map.put("4", "Aimee");
		System.out.println(map);
		
		Set jianzhidui=map.entrySet();
		 Iterator it1=jianzhidui.iterator();
		 while(it1.hasNext()) {
			 
			 Map.Entry zhi=(Map.Entry) it1.next();
			 
			 Object key=zhi.getKey();
			 Object value=zhi.getValue();
			 System.out.println(key+":"+value);
			 
		 }

	}

}
