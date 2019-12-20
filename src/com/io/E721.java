package com.io;

import java.io.File;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class E721 {

	public static void main(String[] args) throws Exception{
		//创建目录
		Path XM=Paths.get("D:\\Favorites");
		try{
			Files.createDirectories(XM);
			System.out.println("创建目录成功");
		}catch (Exception e) {
			System.out.println("创建目录不成功");
		}
		//创建文件
		Path wj=Paths.get("D:\\Favorites\\text.txt");
		try{
			Files.createFile(wj);
			System.out.println("创建文件成功");
		}catch (Exception e) {
			System.out.println("创建文件不成功");
		}
		//集合中写入文件
		List <String>list=new ArrayList<>();
		list.add("这是一个测试文件");
		try{
			Files.write(wj, list,StandardOpenOption.APPEND);
			System.out.println("文件写入成功");
		}catch (Exception e) {
			System.out.println("文件写入不成功");
		}
		//读取文件
		List lines=(List) Files.readAllLines(wj);
		System.out.println("文件的内容是"+lines);
		System.out.println("文件的大小是"+Files.size(wj));
	}
	
}
