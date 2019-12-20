package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object o) {
		Teacher teacher=(Teacher)o;
		return this.age-teacher.age;
	}
	@Override
	public String toString() {
		return  name + ":" + age; 
	}
	
}
public class E612_comparable {

	public static void main(String[] args) {
		TreeSet<Teacher> tSet=new TreeSet<Teacher>();
		tSet.add(new Teacher("刘德华", 36));
		tSet.add(new Teacher("周星驰", 45));
		tSet.add(new Teacher("古天月", 55));
		tSet.add(new Teacher("刘德华", 36));
		System.out.println(tSet);

	}

}
