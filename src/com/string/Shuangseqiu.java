package com.string;

import java.util.HashSet;
import java.util.Random;

public class Shuangseqiu {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖结果：");
		System.out.println("六个红球号码是：");
		Random random=new Random();
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<6;i++) {
			Integer hq = random.nextInt(33)+1;
			if(hs.size()==6) {
				break;
			}
			hs.add(hq);
			
		}
		for(Integer hq:hs) {
			System.out.println(hq+"");
			Thread.sleep(1000);
		}
	}

}
