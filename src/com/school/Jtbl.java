package com.school;
class ka{
	static String schoolName;
}
public class Jtbl {
	public static void main(String[] args) {
		ka s1=new ka();
		ka s2=new ka();
		ka.schoolName="江汉艺术职业学院";
				System.out.println("我是"+s1.schoolName+"的学生");
				System.out.println("我是"+s2.schoolName+"的学生");
	}
}


