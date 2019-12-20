package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ebiaogeheji {

	public static void main(String[] args) throws Exception {
		//excel文件输入流
		FileInputStream fin=new FileInputStream("shili.xlsx");
		//创建一个excel文件的workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		//获得workbook的第一个表格
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//获得workbook的第一个表格的所有行
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++) {
			//获取从第二行开始的每一行
			XSSFRow row=sheet.getRow(i);
			//获取每一行中的第四个单元格
			XSSFCell cell=row.getCell(3);
			//从这个单元格中取出字符串保存在xuehao变量中
			String xuehao=cell.getStringCellValue();
			//获取每一行中的第十五个单元格
			XSSFCell cell16=row.getCell(15);
			String z_shili=cell16.getStringCellValue();
			//获取每一行中的第十六个单元格
			XSSFCell cell17=row.getCell(16);
			String y_shili=cell17.getStringCellValue();
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8","root","12345");
			Statement yuju=lianjie.createStatement();
			String sql="update 18rj1 set  `左眼裸眼视力`='"+z_shili+"',`右眼裸眼视力`='"+y_shili+"' where `学号` ='"+xuehao+"' ";
			yuju.execute(sql);
			
			/*System.out.println(xuehao);
			System.out.println(z_shili);
			System.out.println(y_shili);*/
		}
		
		

	}

}
