package com.rj181;

public class Danxunhuan {
	 public static void main(String[] args) {
	String[] yb= {"管理学院","教育学院","演艺学院","设计学院","音乐学院","中专部","轮空"};
		/*
		 * 0,1,2,3,4,5
		 * 第一轮
		 * 0 5 1 4 2 3
		 * 第二轮      第一组不动其他组顺移
		 * 0 3 5 1 4 2
		 * 0 2 3 4 5 1
		 * 第三轮      第一组不动其他组顺移
		 * 0 2 3 5 1 4 
		 * 0 4 2 1 3 5
		 * 第四轮      第一组不动其他组顺移
		 * 0 4 2 3 5 1
		 * 0 1 4 5 2 3
		 * 第五轮      第一组不动其他组顺移
		 * 0 1 4 2 3 5
		 * 0 5 1 3 4 2
		 * */
		 for (int i = 1; i < yb.length; i++) {
			 System.out.println("第"+i+"轮");
			 if(i>1) {
				 String stemp=yb[yb.length-1];
				 for (int k = yb.length-1; k > 1; k--) {
					 yb[k]=yb[k-1];
					 
					
				}
				 yb[1]=stemp;
			 }
			 for (int j = 0; j < yb.length/2; j++) {
				System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
				
			}
		}
	}

}
