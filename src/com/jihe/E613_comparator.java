package com.jihe;
import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()-s2.length();
	}
	
}
public class E613_comparator {

	public static void main(String[] args) {
		//使用自定义的比较器插入字符串，则会使用字符串的comparator方法
		//按字母或数字的顺序排序插入集合进行排列
		//使用默认的比较器插入字符串，则会使用字符串的compataTo方法
		//按长度的顺序排序插入集合进行排列
		//如果长度相同，则认为是同一个元素
		TreeSet<String> ts1=new TreeSet<String>(new MyComparator());
		ts1.add("Jake");
		ts1.add("Helena");
		ts1.add("Eva");
		System.out.println(ts1);

	}

}
