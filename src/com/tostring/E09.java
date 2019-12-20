package com.tostring;
class Animal extends Object{
	@Override
	public String toString() {
		return "这是一只小母猪";
	}
}
class dog extends Animal{
	@Override
	public String toString() {
		return "这是一只小狗";
	}

}



public class E09 {
	public static void main(String[] args) {
		Animal  s1=new Animal();
		dog s2=new dog();
		System.out.println(s1.toString());
		System.out.println(s2);
		
	}

}
