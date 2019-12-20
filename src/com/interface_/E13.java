package com.interface_;
interface Animal{
	//接口没有成员变量
	//只有public static final的成员常量
	//public static final三个关键字可以省略
    int ID=1;
	//abstract 抽象
	//接口中的方法public abstract
	//public abstract关键字可以省略
    void shout();
    static int getID(){
		return Animal.ID;
	
    	
    }
}
interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
//必须重写父类中的抽象方法
	@Override
	public void shout() {
	System.out.println("汪汪。。。。");
	}

@Override
public void run() {
	System.out.println("小狗跑");
	
    }
}

public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.getID());
	}

}
