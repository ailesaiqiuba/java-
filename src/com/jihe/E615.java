package com.jihe;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class E615 {

	public static void main(String[] args) {
		 Map<String,String> map=new HashMap<String,String>();
		   map.put("1","Jake");
		   map.put("2","Mike");
		   map.put("3","Rose");
		   map.put("1","Jake");
		   Set keySet=map.keySet();
		 Iterator it=keySet.iterator();
		 while(it.hasNext()) {
			 Object key=it.next();
			 Object value=map.get(key);
			 System.out.println(key+":"+value);
		 }
		 
		 
		 System.out.println("键值对输出");
		 Set jianzhidui=map.entrySet();
		 Iterator it1=jianzhidui.iterator();
		 while(it1.hasNext()) {
			 
			 Map.Entry zhi=(Map.Entry) it1.next();
			 
			 Object key=zhi.getKey();
			 Object value=zhi.getValue();
			 System.out.println(key+":"+value);
			 
		 }
			System.out.println("foreach循环遍历集合");
			map.forEach((key,value)->System.out.println(key+":"+value));
		
		 
		 System.out.println("获取集合中value的值");
		Collection zhiji=map.values();
		zhiji.forEach(zhi->System.out.println(zhi));
		

	}

}
