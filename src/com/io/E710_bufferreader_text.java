package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class E710_bufferreader_text {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/reader.txt");
		BufferedReader ln=new BufferedReader(fr);
		BufferedWriter li=new BufferedWriter(new FileWriter("d:/write.txt"));
		//bufferreader的读方法结果是一个字符串
		String str=ln.readLine();
		while(str !=null) {
			li.write(str);
			str=ln.readLine();
			
		}
		fr.close();
		li.close();
		ln.close();
		

	}

}
