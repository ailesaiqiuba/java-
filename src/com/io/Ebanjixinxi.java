package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ebanjixinxi {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("d:/shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		//定义要输出的sheet
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		//System.out.println(rows);
	if(rows==0) {
		throw new RuntimeException("表格中没有数据.....");
	}
	XSSFRow rowi=null;
	Iterator<Cell> cell_jihe=null;
	ArrayList list=new ArrayList();
	
	for(int i=0;i<=rows;i++) {
		rowi=sheet.getRow(i);
		cell_jihe=rowi.cellIterator();
		while(cell_jihe .hasNext()) {
			Cell cell=(Cell) cell_jihe.next();
			if(cell.getCellType()==CellType.NUMERIC) {
				list.add(cell.getNumericCellValue());
				
			}else if(cell.getCellType()==CellType.STRING) {
				list.add(cell.getStringCellValue());
		}
	}
}
	 System.out.println(list);
	}


}


