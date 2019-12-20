package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Input_shili {
	static Connection lianjie = null;

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8", "root",
				"12345");
		File mul = new File("d:\\tice");
		File[] files = mul.listFiles();
		System.out.println("一共有" + files.length + "个文件");
		for (File file : files) {
			System.out.println(file);
			if (file.getName().endsWith("xlsx")) {
				dqbxrmgwj_xlsx(file);
			}
			if (file.getName().endsWith("xls")) {
				dqbxrmgwj_xls(file);
			}
		}

	}

	private static void dqbxrmgwj_xls(File file) throws Exception {
		// excel文件输入流
		FileInputStream fin = new FileInputStream(file);
		// 创建一个excel文件的workbook
		HSSFWorkbook workbook = new HSSFWorkbook(fin);
		// 获得workbook的第一个表格
		HSSFSheet sheet = workbook.getSheet("sheet1");
		// 获得workbook的第一个表格的所有行
		int rows = sheet.getLastRowNum();
		for (int i = 0; i <= rows; i++) {
			// 获取从第二行开始的每一行
			HSSFRow row = sheet.getRow(i);
			// 获取每一行中的第四个单元格
			HSSFCell cell = row.getCell(3);
			// 从这个单元格中取出字符串保存在xuehao变量中
			String xuehao = cell.getStringCellValue();
			// 从第一行开始，如果获取的单元格的只是标题行，不需要更新，跳出本次循环
			if (xuehao.equals("学号")) {
				continue;
			}
			HSSFCell cell19 = row.getCell(19);
			HSSFCell cell20 = row.getCell(20);
			if (cell19 != null && cell20 != null) {
				// 获取每一行中的第十五个单元格
				String z_shili = cell19.getStringCellValue();
				// 获取每一行中的第十六个单元格
				String y_shili = cell20.getStringCellValue();

				PreparedStatement yudingyi_yuju = lianjie.prepareStatement("update sheet1 set  `左眼裸眼视力`=? ,`右眼裸眼视力`=? where `学号` =?");
				
				
				 yudingyi_yuju.setString(1,z_shili);
				yudingyi_yuju.setString(2,y_shili);
				yudingyi_yuju.setString(3,xuehao);
				yudingyi_yuju.executeUpdate();
			}

		}
	}

	private static void dqbxrmgwj_xlsx(File file) throws Exception {
		// excel文件输入流
		FileInputStream fin = new FileInputStream(file);
		// 创建一个excel文件的workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		// 获得workbook的第一个表格
		XSSFSheet sheet = workbook.getSheet("sheet1");
		// 获得workbook的第一个表格的所有行
		int rows = sheet.getLastRowNum();
		for (int i = 0; i <= rows; i++) {
			// 获取从第二行开始的每一行
			XSSFRow row = sheet.getRow(i);
			// 获取每一行中的第四个单元格
			XSSFCell cell = row.getCell(3);
			// 从这个单元格中取出字符串保存在xuehao变量中
			String xuehao = cell.getStringCellValue();
			// 从第一行开始，如果获取的单元格的只是标题行，不需要更新，跳出本次循环
			if (xuehao.equals("学号")) {
				continue;
			}
			// 获取每一行中的第十五个单元格
			XSSFCell cell19 = row.getCell(19);
			XSSFCell cell20 = row.getCell(20);
			if (cell19 != null && cell20 != null) {
				String z_shili = cell19.getStringCellValue();
				// 获取每一行中的第十六个单元格
				String y_shili = cell20.getStringCellValue();
			
				PreparedStatement yudingyi_yuju = lianjie.prepareStatement("update sheet1 set  `左眼裸眼视力`=? ,`右眼裸眼视力`=? where `学号` =?");
			
		
				 yudingyi_yuju.setString(1,z_shili);
				yudingyi_yuju.setString(2,y_shili);
				yudingyi_yuju.setString(3,xuehao);
				yudingyi_yuju.executeUpdate();
				
				
			}
		}
	}
}
