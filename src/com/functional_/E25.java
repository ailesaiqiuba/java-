package com.functional_;
@FunctionalInterface
interface printable{
	void print(String str);
}
class stringutils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}

	
}

public class E25 {
	private static void printUpper(String text,printable pt ) {
		pt.print(text);
		}
public static void main(String[] args) {
	stringutils stu=new stringutils();
	
}
}