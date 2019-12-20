package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class E711 {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入您的年龄");
		InputStream is=System.in;
		InputStreamReader ir=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(ir);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\ade.txt")));
		String line=br.readLine();
		if(Integer.parseInt(line)>18) {
			bw.write("海绵宝宝");
			bw.write("和派大星");
			System.out.println("您已成年");
		}
		bw.flush();
		is.close();
		ir.close();
		br.close();
		bw.close();
		
		
	}

}
