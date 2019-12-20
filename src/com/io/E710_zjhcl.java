package com.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class E710_zjhcl {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/a1.txt");
		FileWriter fW=new FileWriter("d:/a2.txt");
			char[]buffer=new char[1024];
			long kssj=System.currentTimeMillis();
			int len=fr.read(buffer);
			while(len!=-1) {
				fW.write(buffer,0,len);
				len=fr.read();
			}
			long jssj=System.currentTimeMillis();
			System.out.print("拷贝所需"+(jssj-kssj)+"毫秒");
			fr.close();
			fW.close();

	
	}
}
