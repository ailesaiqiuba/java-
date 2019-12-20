package com.ip.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException, Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		
		while(true) {
			 Socket khdtjz=fwqtjz.accept();
			 new Thread(() -> {
					try {// 获取客户端的端口号
						
						String  ip=khdtjz.getInetAddress().getHostAddress();
						int port=khdtjz.getPort();
						 System.out.println("与端口号"+port+"连接成功");
						 InputStream is;
						 is=khdtjz.getInputStream();
						 
						 File wj=new File("d:\\upload"+ip+".jpg");
							FileOutputStream fout=new FileOutputStream(wj);
							byte[] zjhc=new byte[1024];
							int b=is.read(zjhc);
							while(b!=-1) {
								//写到文件;
								fout.write(zjhc,0,b);
								b=is.read(zjhc);
							}
							OutputStream os;
							os = khdtjz.getOutputStream();
							String s=ip+"上传成功";
							 zjhc=s.getBytes();
							 os.write(zjhc);
							 Thread.sleep(5000);
							os.close();
							khdtjz.close();
							}catch (Exception e) {
				e.printStackTrace();
			}
			 	}).start();
	}

}
}
