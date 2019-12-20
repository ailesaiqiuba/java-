package com.school;

import java.util.ArrayList;

public class Text {

	public static void main(String[] args) {
		//student 是类名，s1是类的对象名
		//NEW关键字用来创建一个student类，类名后面要有小括号
		Student s1=new Student();
		s1.setName("MIKE");
		s1.setScore(580);
		System.out.println(s1.getName()+" 考了"+s1.getScore());
		Student s2=new Student("Alice",590);
		System.out.println(s2.getName()+" 考了"+s2.getScore());
		
		
		Course c1=new Course();
		c1.setBook("java基础入门");
		c1.setId("java程序设计");
		c1.setName("java基础");
		System.out.println(c1.getId());
		System.out.println(c1.getName()+"这门课程使用的教材《"+c1.getBook()+"》");
	}

	
}
