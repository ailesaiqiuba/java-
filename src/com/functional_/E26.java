package com.functional_;
@FunctionalInterface
interface PersonBuilder{
	Person builidperson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class E26 {

	

	public static void main(String[] args) {
		PrintName("老龙王",new PersonBuilder() {
			
			@Override
			public Person builidperson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
		PrintName("张杰",name->new Person(name));
		PrintName("谢娜",Person::new);
	}

	private static void PrintName(String name, PersonBuilder pb) {
		System.out.println(pb.builidperson(name).getName());
		
	}

}
