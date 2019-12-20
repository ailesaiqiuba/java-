package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E71 {

	public static void main(String[] args) throws IOException {
		FileInputStream io=new FileInputStream("d:\\src.jpg");
		FileOutputStream iout=new FileOutputStream("d:\\src1.jpg");
		long kssj=System.currentTimeMillis();
		//byte[] zjhc=new byte[1024];
		int b=0;
		while((b=io.read()) !=-1) {
		System.out.print((char)b);
			iout.write(b);
		}
		long jssj=System.currentTimeMillis();
		System.out.print("拷贝所需"+(jssj-kssj)+"毫秒");
		//String string=" world！";
		//iout.write(string.getBytes());
		io.close();
		iout.close();
		
	}
	

}