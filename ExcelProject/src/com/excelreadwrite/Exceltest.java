package com.excelreadwrite;

import org.testng.annotations.Test;
import com.utility.NewExcelLibrary;

public class Exceltest {
	
	NewExcelLibrary obj = new NewExcelLibrary("D:\\ExcelProject\\TestData\\DataSheet.xlsx");
	@Test
	public void test1() {
		int newsheet = obj.getRowCount("Sheet2");
		System.out.println("Thecount is "+newsheet);
	
		
	}
	
	
}
