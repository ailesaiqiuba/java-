package com.io;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Filechannels {

	public static void main(String[] args) throws IOException {
		RandomAccessFile yswj=new RandomAccessFile("d:\\fengmain.png","rw");
		RandomAccessFile mbwj=new RandomAccessFile("d:\\fengmain1.png","rw");
		FileChannel finc=yswj.getChannel();
		FileChannel foutc=yswj.getChannel();
		long wjdx=finc.transferTo(0,finc.size(),foutc);
		if(wjdx>0) {
			System.out.println("复制成功");
		}
		

	}

}
