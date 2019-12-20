package com.io;

import java.nio.CharBuffer;

public class Echarbuffer_cd {

	public static void main(String[] args) {
		CharBuffer charBuffer=CharBuffer.allocate(6);
		System.out.println("容量"+charBuffer.capacity());
		System.out.println("界限值"+charBuffer.limit());
		System.out.println("初始位置"+charBuffer.position());
		
		charBuffer.put("a");
		charBuffer.put("b");
		charBuffer.put("c");
		
		System.out.println("加入元素后的界限值"+charBuffer.limit());
		System.out.println("加入元素后的位置"+charBuffer.position());
		//反转
		charBuffer.flip();
		System.out.println("反转之后的界限值"+charBuffer.limit());
		System.out.println("反转之后的位置"+charBuffer.position());
		System.out.println("反转之后取出的第一个元素为"+charBuffer.get());
		System.out.println("反转之后取出的第一个元素界限值"+charBuffer.limit());
		System.out.println("反转之后取出的第一个元素位置"+charBuffer.position());
		//清除
		charBuffer.clear();
		System.out.println("清除之后的界限值"+charBuffer.limit());
		System.out.println("清除之后的位置"+charBuffer.position());
		System.out.println("清除之后取出的第一个元素为"+charBuffer.get());
		System.out.println("清除之后取出的第一个元素界限值"+charBuffer.limit());
		System.out.println("清除之后取出的第一个元素位置"+charBuffer.position());
		
		

	}

}
