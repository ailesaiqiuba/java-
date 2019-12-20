package com.school;
public class Student {
	//定义两个成员变量
	//没有修饰符：包可见性 当前属性只能在本包中被访问
	//private：类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有就是类的封装
	//外部方法要访问这个成员变量，必须通过共有的getter setter 方法
     private String name;//字符串类型的名字
	 private int score;//整形的成绩
	//get:获取    set:设置
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//如果没有定义任何构造方法，java虚拟机会创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会创建一个无参的构造方法
	//定义无参的构造方法
	//构造方法是一种特殊的方法：修饰符+类名([参数类型 参数名]){}
	public Student() {
		super();
		
	}
	//定义有参的构造方法
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}
