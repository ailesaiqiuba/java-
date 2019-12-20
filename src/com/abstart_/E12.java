package com.abstart_;
 abstract class Animal{
	public abstract void shout();
}
class Dog extends Animal{
//必须重写父类中的抽象方法
	@Override
	public void shout() {
	System.out.println("汪汪。。。。");
		
	}
	
}
public class E12 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}

}
