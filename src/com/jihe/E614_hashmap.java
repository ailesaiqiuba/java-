package com.jihe;
import java.util.HashMap;
import java.util.Map;

public class E614_hashmap {
   public static void main(String[] args) {
	   Map<String,String> map=new HashMap<String,String>();
	   map.put("1","Jake");
	   map.put("2","Mike");
	   map.put("3","Rose");
	   map.put("1","Jake");
	   System.out.println(map);
	   if (map.containsKey("1")) {
		 System.out.println("双列集合map包含键1");
		 System.out.println("双列集合键1的值为："+map.get("1"));
		 //通过keyset(),valuse()方法，获取键对象的集合，值对象的集合
		 //也就是把集合的双列变成单列
		System.out.println("键对象的集合"+map.keySet());
		System.out.println("值对象的集合"+map.values());
		//删除集合中键为1的元素
		map.replace("1","Jack");
		System.out.println(map);
		//删除集合中键为1的元素
		map.remove("1");
		System.out.println(map);
	}
	
}
}
