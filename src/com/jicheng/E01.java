package com.jicheng;
//定义类
class Animal{
	String name;
	public  Animal() {
		System.out.println("我是这个世界上最美的人");
	}
	public  Animal(String name) {
		System.out.println("墨镜墨镜谁是世界上最美的人               "+name);
	}
	void shout(){
		System.out.println("在镜子里站着");
	}
}
//继承类
class Dog extends Animal{
	public Dog() {
		super("白雪公主");
	}
	
	void printName() {
	System.out.println("这是我的狗"+name);
	}
	@Override
		void shout(){
		super.shout();
			System.out.println("汪汪汪");
	}
}
//定义测试类
public class E01 {
public static void main(String[] args) {
	Dog dog=new Dog();
	/*dog.name="二哈";
	dog.printName();//调用自己的方法
	dog.shout();//调用副类的方法
	*/
  }
}
