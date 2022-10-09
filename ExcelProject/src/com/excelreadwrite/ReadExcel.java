package com.excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	//public static String path = System.getProperty("user.dir")+"/TestData/DataSheet.xlsx";
	//public ReadExcel() {
		//this.path = path;
		//String path = "D:\\ExcelProject\\TestData\\DataSheet.xlsx";
	//}
//	public ReadExcel(String path) {
//		//this.excelpath = path;
//		// TODO Auto-generated constructor stub
//	}
	String excelpath = "D:\\ExcelProject\\TestData\\DataSheet.xlsx";
	String filename = "DataSheet";
	String sheetname = "Sheet1";
	
	
	

	@Test
	public void readexcel() throws IOException {
		
		
		//String sheet = "Sheet2";
		
		
		// create the object of file class to get the excelpath
		
		File file = new File(excelpath);
		
		//To read the file
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		
		XSSFSheet sheet = wb.getSheet(sheetname);
		
		int rowscounttotal = sheet.getLastRowNum();
		
		String name = sheet.getSheetName();
		
		System.out.println("Total Rows are "+rowscounttotal);
		
		System.out.println("Sheetname is "+name);
		
//		String data = sheet.getRow(0).getCell(0).getStringCellValue();
//		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
//		
//		String data2 = sheet.getRow(1).getCell(0).getStringCellValue();
//		String data3 = sheet.getRow(1).getCell(1).getStringCellValue();
//		
//		String data4 = sheet.getRow(2).getCell(0).getStringCellValue();
//		String data5 = sheet.getRow(2).getCell(1).getStringCellValue();
//		
//		
//		System.out.println(data+" "+data1);
//		System.out.println(data2+ " "+data3);
//		System.out.println(data4+ " "+data5);
		
		//For loop
		
		
		for(int i = 0; i<=rowscounttotal; i++) {
			Row row = sheet.getRow(i);
			for(int j = 0; j<row.getLastCellNum();j++){
					String data = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(" || "+data);
				}
			System.out.println();
			}
			
			// To multiple rows with tabular format
//		

		
		
	}
}



