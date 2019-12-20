package com.string;

import java.util.Random;

public class Randon_text {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("生成 boolean类型的随机数"+r.nextBoolean());
		System.out.println("生成double类型的随机数"+r.nextDouble());
		System.out.println("生成 float类型的随机数"+r.nextFloat());
		System.out.println("生成int类型的随机数"+r.nextInt());
		System.out.println("生成 0~10之间int类型的随机数"+r.nextInt(10));
		System.out.println("生成 long类型的随机数"+r.nextLong());
	}

}
