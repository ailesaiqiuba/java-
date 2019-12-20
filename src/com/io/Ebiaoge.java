package com.io;

import java.awt.List;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.lang.model.element.VariableElement;
import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Ebiaoge {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("测试模板");
		//创建第一行
		HSSFRow row0=sheet.createRow(0);
		//创建第一行的第一个单元格
		HSSFCell cell0=row0.createCell(0);
		cell0.setCellValue("年级");
		//第2-8个单元格
		row0.createCell(1).setCellValue("班级编号");
		row0.createCell(2).setCellValue("班级名称 ");
		row0.createCell(3).setCellValue("项目名称");
		row0.createCell(4).setCellValue("测试老师");
		row0.createCell(5).setCellValue("测试时间");
		row0.createCell(6).setCellValue("测试地点");
		row0.createCell(7).setCellValue("测试器材");
		row0.createCell(8).setCellValue("测试方式（手工/仪器）");
		//读取文件
		Path wj=Paths.get("班级信息.txt");
		java.util.List<String> lines =Files.readAllLines(wj);
		int j=0;
		for (String line:lines) {
			String[] zfcsz =line.split("	");
		
		
		
		for (int i =j*10+ 1; i < j*10+ 11; i++) {
			HSSFRow row1=sheet.createRow(i);
			row1.createCell(0).setCellValue("31");
			row1.createCell(1).setCellValue(zfcsz[0] );
			row1.createCell(2).setCellValue(zfcsz[1]);
			
			switch (i) {
			case 1:
				row1.createCell(3).setCellValue("身高");
				row1.createCell(4).setCellValue("高佳明");
				row1.createCell(5).setCellValue("2019/10/29");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			case 2:
				row1.createCell(3).setCellValue("体重");
				row1.createCell(4).setCellValue("李国珍");
				row1.createCell(5).setCellValue("2019/10/29");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			case 3:
				row1.createCell(3).setCellValue("肺活量");
				row1.createCell(4).setCellValue("李雪纯之/刘念念");
				row1.createCell(5).setCellValue("2019/10/29");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			case 4:
				row1.createCell(3).setCellValue("50米跑");
				row1.createCell(4).setCellValue("赵玉巧/李红梅");
				row1.createCell(5).setCellValue("2019/11/9");
				row1.createCell(6).setCellValue("操场");
				row1.createCell(8).setCellValue("1");
				break;
			case 5:
				row1.createCell(3).setCellValue("立定跳远");
				row1.createCell(4).setCellValue("赵武科/小越");
				row1.createCell(5).setCellValue("2019/10/29");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			case 6:
				row1.createCell(3).setCellValue("坐位体前屈");
				row1.createCell(4).setCellValue("卢渊博/周娟");
				row1.createCell(5).setCellValue("2019/9/11");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			case 7:
				row1.createCell(3).setCellValue("1000米跑");
				row1.createCell(4).setCellValue("汪先涛/周天翔");
				row1.createCell(5).setCellValue("2019/10/29");
				row1.createCell(6).setCellValue("操场");
				row1.createCell(8).setCellValue("1");
				break;
			case 8:
				row1.createCell(3).setCellValue("引体向上");
			    row1.createCell(4).setCellValue("陈永军/梅宇洁");
				row1.createCell(5).setCellValue("2019/11/9");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("1");
				break;
			case 9:
				row1.createCell(3).setCellValue("800米跑");
				row1.createCell(4).setCellValue("葛新");
				row1.createCell(5).setCellValue("2019/11/9");
				row1.createCell(6).setCellValue("操场");
				row1.createCell(8).setCellValue("1");
				break;
			case 10:
				row1.createCell(3).setCellValue("一分钟仰卧起坐");
				row1.createCell(4).setCellValue("毛声宇/杨钰莹");
				row1.createCell(5).setCellValue("2019/11/9");
				row1.createCell(6).setCellValue("体育馆");
				row1.createCell(8).setCellValue("2");
				break;
			default:
				row1.createCell(3).setCellValue("身高");
				
			}
		}
		j++;
	}	
		FileOutputStream fOut=new FileOutputStream("d:\\测试模板.xls");
		wb.write(fOut);
		fOut.close();

	}

}
