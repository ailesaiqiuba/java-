package com.io;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.swetake.util.Qrcode;
public class Wen {
	public static void main(String[] args) throws IOException {
		Qrcode ewm=new Qrcode();
		int width=300;
		int height=300;
		BufferedImage hctx=new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		Graphics2D ewhb=hctx.createGraphics();
		ewhb.setBackground(Color.white);
		ewhb.setColor(Color.black);
		ewhb.clearRect(0, 0,width*height,width*height);
		String zf="锦觅似繁花安宁，淡云流水度此生。";
		byte[] zjsz=zf.getBytes();
		int pianyi=2;
		if(zjsz.length>0&&zjsz.length<100) {
			boolean[][] ewsz=ewm.calQrcode(zjsz);
			for(int i=0;i<ewsz.length;i++) {
				for(int j=0;j<ewsz.length;j++) {
					if (ewsz[j][i]) {
						ewhb.fillRect(j*3+pianyi, i*3+pianyi, 3, 3);
					}
				}
			}
		}
		ewhb.dispose();
		hctx.flush();
		ImageIO.write(hctx,"jpg",new File("ewn.jpg") );
	}

}
