package com.functional_;
//声明这是一个无参数和无返回值类型的函数接口，有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}
//声明这是一个有参数和有返回值类型的函数接口，有且仅有一个抽象方法
@FunctionalInterface
interface Calculate{
	int sum(int x,int y);
}
public class E23 {

	public static void main(String[] args) {
	animalshout(()->System.out.println("无参，无返回值的函数类型"));
	showsum(10,20,(x,y)->x+y);
	}

	private static void showsum(int x, int y, Calculate calculate) {
		System.out.println(x+"+"+y+"的和为："+calculate.sum(x, y));
		
	}

	private static void animalshout(Animal an) {
		an.shout();
		
	}

}
