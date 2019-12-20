package com.string;

public class E53 {

	public static void main(String[] args) {
	String str="ja1va生3fb4活gb6t好tb7rfr2fr5美gnm4jky3好gj87hg";
	char[] charArray=str.toCharArray();
	System.out.print("将字符串转为字符数组的便利结果：");
	/*for(char zf : charArray) {
		if(str.endsWith(""+zf)) 
			System.out.println(zf);
		else
			System.out.println(zf+",");
	}*/
	for(int i=0;i<charArray.length;i++)
		if(i !=charArray.length-1) {
			System.out.print(charArray[i]+",");
		}else {
			System.out.print(charArray[i]);
		}
	System.out.print("\n隐藏在字符串中的数字是：");
		for(char zf:charArray) {
			if(zf>='0'&&zf<'9') {
			System.out.print(zf);
			}
		}
		System.out.print("\n隐藏在字符串中的汉字是：");
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<'\u9FA5') {
			System.out.print(zf);
			}
		}
	System.out.println("\n将 int转换为string的类型结果："+String.valueOf(12));
	System.out.println("将 字符串转换为大写的类型结果："+str.toUpperCase());
	}
}
