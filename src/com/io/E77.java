package com.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E77 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/reader.txt");
		int len=fr.read();
		while(len!=-1) {
			System.out.print((char)len);
			len=fr.read();
		}
		fr.close();
		FileWriter fw=new FileWriter("d:/write.txt");
		fw.write("  再别康桥  \r\n");
		fw.write("     徐志摩  \r\n");
		fw.write("轻轻地我走了  \r\n");
		fw.write("正如我轻轻地来  \r\n");
		fw.write("我轻轻地招手  \r\n");
		fw.write("作别西天的云彩  \r\n");
		fw.close();
	}
}
