package com.ip.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
public class Updateclient {
	public static void main(String[] args) throws Exception, IOException {
		Socket khdtjz=new Socket("10.2.103.35",8899);
		OutputStream os =khdtjz.getOutputStream();
		File khdscdwj=new File("d:\\1.jpg");
		FileInputStream fin=new FileInputStream(khdscdwj);
		 byte[] zjhc=new byte[1024];
		 int b=fin.read(zjhc);
		 while(b!=-1) {
			 os.write(zjhc,0,b);
			 b=fin.read(zjhc);
		 }
	}
}

	


