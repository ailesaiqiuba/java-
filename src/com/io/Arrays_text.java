package com.io;

import java.io.File;
public class Arrays_text {
	public static void main(String[] args) {
		File file=new File("d:\\BOM");
		fileDir(file);		
		/*if(file.isDirectory()) {
			String[] filename=file.list((dir,name)->name.endsWith(".html"));
			Arrays.stream(filename).forEach(f->System.out.println(f));
			
		}*/
	}
	private static void fileDir(File file) {
		File[] files=file.listFiles();
		for (File f : files) {
			if(f.isDirectory()) {
				fileDir(f);
			}
				System.out.println(f);				
			}
	}
		
		
	}


