package com.string;
public class E512 {
	public static void main(String[] args) throws Exception {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小"+rt.freeMemory()/1024/1024+"Mb");
		System.out.println("最大可用内存大小"+rt.maxMemory()/1024/1024+"Mb");
		
		 Process process=rt.exec("notepad.exe");
		 Thread.sleep(3000);
		 process.destroy();
	}
	
	
}
