package com.excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel  {
	@Test
	public void WriteExcel(String sheetName, String cellvalue, int row, int col) throws IOException{
		String excelpath = "D:\\\\ExcelProject\\\\TestData\\\\DataSheet.xlsx";
		
		File file = new File (excelpath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		sheet.getRow(row).createCell(col).setCellValue(cellvalue);
		
		FileOutputStream fos = new FileOutputStream(new File (excelpath));
		
		wb.write(fos);
		fos.close();
		wb.close();
		
		}
	

}
