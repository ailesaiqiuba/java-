package com.functional_;

@FunctionalInterface
interface Calcable {
	int calc(int num);
}

class math {
	public static int abs(int num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
}

public class E24 {
	private static void printAbs(int num, Calcable calcable) {
		System.out.println(calcable.calc(num));
	}

	public static void main(String[] args) {
		// 使用lambda表达式
		printAbs(-10, n -> math.abs(n));
		// 使用方法引用的方式：类名：：静态方法名
		printAbs(-50, math::abs);
	}
}
