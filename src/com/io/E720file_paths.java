package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class E720file_paths {

	public static void main(String[] args) {
		Path path=Paths.get("D:\\Favorites");
		System.out.println("path的路径"+path.getRoot());
		System.out.println("path的父路径"+path.getParent());
		System.out.println("path的路径名称数"+path.getNameCount());
		for(int i=0;i<path.getNameCount();i++) {
			Path name=path.getName(i);
			System.out.println("索引为"+i+"的路径的名称为"+name);
		}
		System.out.println("path的uri路径为"+path.toUri());
		System.out.println("path的绝对路径为"+path.toAbsolutePath());
	}

}
