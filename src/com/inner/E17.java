package com.inner;

import java.util.Locale.Category;

interface Animal{
	void shout();
}
/*class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵。。。。。");
		
	}
	
}*/
public class E17 {
	public static void main(String[] args) {
		String name="小花";
		//第一种方式：
		//外部类 外部类的对象=new 外部类()创建对象
		//外部类对象。
		animalshout(new Animal(){
		public void shout(){
		System.out.println(name+"喵喵");
		}
		});
		animalshout(()->System.out.println(name+"喵喵"));
	}

	private static void animalshout(Animal an) {
		an.shout();
		
	}

}
