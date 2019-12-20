package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Parallel_bingxingliuchuanxingliu {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("张","三","李","四");
		Stream<String>liu=list.parallelStream();
		if(liu.isParallel()) {
			System.out.println("liu是一个串行流");
		}
		Stream<String>liu1=list.stream();
		if(!liu1.isParallel()) {
			System.out.println("liu1是一个并行流");
		}
		
		
	}

}
