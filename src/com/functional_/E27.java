package com.functional_;
@FunctionalInterface 
interface _Printable{
	void print(_stringutils su,String text);
}
class _stringutils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {
	public static void main(String[] args) {
		printUpper(new _stringutils(),"hello",(object,t)->object.printUpperCase(t));
		printUpper(new _stringutils(),"wold",_stringutils::printUpperCase);
	}

	private static void printUpper(_stringutils  su, String text, _Printable pt) {
		pt.print(su, text);
		
	}

}
