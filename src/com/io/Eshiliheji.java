package com.io;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Eshiliheji {
		public static void main(String[] args) throws IOException {
			FileInputStream fin=new FileInputStream("shili.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheet("sheet1");
			int rows=sheet.getLastRowNum();
			if(rows==0) {
				throw new RuntimeException("表格中没有数据.....");
			}
			XSSFRow rowi=null;
			Iterator<Cell> cell_jihe=null;
			ArrayList list=new ArrayList<>();
			Map map=new HashMap<>();
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
				map.put(list.get(3),list);
		}
			FileInputStream fin_dest=new FileInputStream("18rj1.xlsx");
			XSSFWorkbook workbook_in_dest=new XSSFWorkbook(fin_dest);
			XSSFSheet sheet_dest=workbook_in_dest.getSheet("sheet1");
			if(rows==0) {
				throw new RuntimeException("表格中没有数据.....");
			}
			XSSFRow rowi_dest=null;
			Iterator<Cell> cell_jihe_dest=null;
			ArrayList list_dest=new ArrayList<>();
			
		for(int i=1;i<=rows;i++) {
			rowi_dest=sheet_dest.getRow(i);
			
		System.out.println(list);
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			ArrayList tcxxjh=(ArrayList)map.get(xuehao);
			System.out.println(tcxxjh);
			//rowi_dest.createCell(15,CellType.STRING).setCellValue("4.7");
					
			
	}
		FileOutputStream fOut=new FileOutputStream("18rj1.xlsx");
		workbook_in_dest.write(fOut);
		fOut.close();
		System.out.println(list_dest);
		}
	}


