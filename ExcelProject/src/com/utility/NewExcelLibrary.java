package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewExcelLibrary {
	public static String path = System.getProperty("user.dir")+"/TestData/DataSheet.xlsx";
	public static String filename = "DataSheet";
	public static String sheetname = "Sheet1";
	public static String sheet = "Sheet2";

	
	public NewExcelLibrary(String path) {
		this.path=path;
		// TODO Auto-generated constructor stub
	}



	@Test
	public void readexcel() throws IOException {
		//String excelpath = "D:\\ExcelProject\\TestData\\DataSheet.xlsx";
		String filename = "DataSheet";
		String sheetname = "Sheet1";
		String sheet = "Sheet2";
		
		// create the object of file class to get the excelpath
		
		File file = new File(path);
		
		//To read the file
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		
		XSSFSheet sheet1 = wb.getSheet(sheetname);
		
		int rowscounttotal = sheet1.getLastRowNum();
		
		String name = sheet1.getSheetName();
		
		//System.out.println("Total Rows are "+rowscounttotal);
		
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
			Row row = sheet1.getRow(i);
			for(int j = 0; j<row.getLastCellNum();j++){
					String data = sheet1.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
				}
			System.out.println();
			}
			
			// To multiple rows with tabular format
//		

		
		
	}



	public int getRowCount(String string) {
		Class<? extends String> rowscounttotal = sheet.getClass();		
		return 0;
	}



	public int getRowCount1() {
		Class<? extends String> rowcount = sheet.getClass();// TODO Auto-generated method stub
		return 0;
	}






}

