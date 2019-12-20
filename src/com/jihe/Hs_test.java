package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int hashCode() {
		return  name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return name.equals(other.name);
	}
}
public class Hs_test {
	public static void main(String[] args) {
		HashSet <Person>hSet=new HashSet<Person>();
		hSet.add(new Person("Jack",20));
		hSet.add(new Person("Jack",20));
		hSet.add(new Person("Mike",18));
		System.out.println(hSet);
	}
}
