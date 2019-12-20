package com.jihe;

import java.util.HashSet;

class student{
	String id;
	String name;
	public student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		student other=(student) obj;
			return id.equals(other.id);
	}
	public student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
	
}

public class Hashset_text {
  public static void main(String[] args) {
	 HashSet<student> hsj=new HashSet<student>();
	 student stu1=new student("1","Mike");
	 student stu2=new student("1","Mike");
	 student stu3=new student("2","Job");
	 student stu4=new student("3","Tem");
	 hsj.add(stu1);
	 hsj.add(stu2);
	 hsj.add(stu3);
	 hsj.add(stu4);
	 
	 System.out.println(hsj);
	  
	
}
}
