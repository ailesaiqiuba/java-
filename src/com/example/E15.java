package com.example;
 interface Animal{
	 void shout();
 }
 class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵。。。。");
	}
	 public void CatchMouse() {
	 System.out.println("猫捉老鼠");
	 }
 }
 class Dog implements Animal{

	@Override
	public void shout() {
		System.out.println("汪汪。。。");
		
	}
 }
public class E15 {
	public static void main(String[] args) {
		Animal s1=new Cat();
		s1.shout();
		Animal s2=new Dog();
		s2.shout();
		if(s1 instanceof Cat) {
			Cat mao=(Cat)s1;
			mao.CatchMouse();
		}
		else {
		System.out.println("该类型对象不是mao");
		}
	}

}
