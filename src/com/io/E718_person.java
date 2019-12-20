package com.io;

import java.io.Serializable;

public class E718_person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public E718_person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public E718_person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name;
	}
		

}
