package com.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Quanbanjihe {
	static HashMap<String,Integer> hSet=new HashMap<>();
	public static void main(String[] args) throws IOException {
		
		FileInputStream fIn=new FileInputStream("d:\\18rj1.txt");
		BufferedReader bReader=new BufferedReader(new InputStreamReader(fIn));
		String xsm=bReader.readLine();
		while(xsm!=null) {
			 hSet.put(xsm,0);
			 xsm=bReader.readLine();
		}
		//System.out.println(hSet);
		File file=new File("d:\\18软件1班作业");
		fileDir(file);
		System.out.println(hSet);
}
	private static void fileDir(File file) {
		File[] listfiles=file.listFiles();
		for (File f:listfiles) {
			if(f.isDirectory()) {
				String wjm=f.getName();
				hSet.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
						cs=cs+1;
						hSet.put(xsm,cs);
					}
				});
				fileDir(f);	
			}
						
			}
	}
}
