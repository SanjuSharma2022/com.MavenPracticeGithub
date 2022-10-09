package com.excelreadwrite;

import java.io.IOException;

import org.testng.annotations.Test;

public class writevalue {
	WriteExcel object = new WriteExcel();
	@Test
	public void Writevalue1() throws IOException {
		object.WriteExcel("Sheet1", "male", 0, 2);
		object.WriteExcel("Sheet1", "GO", 0, 4);
		
	}
	@Test
	public void Writevalue2() throws IOException {
		object.WriteExcel("Sheet1", "male", 1, 2);
		
	}
	@Test
	public void Writevalue3() throws IOException {
		object.WriteExcel("Sheet1", "female", 2, 2);
		
	}
	@Test
	public void Writevalue4() throws IOException {
		object.WriteExcel("Sheet1", "male", 3, 2);
		
	}
	@Test
	public void Writevalue5() throws IOException {
		object.WriteExcel("Sheet1", "male", 4, 2);
		
	}
	@Test
	public void Writevalue6() throws IOException {
		object.WriteExcel("Sheet1", "female", 5, 2);
		
	}
	@Test
	public void Writevalue7() throws IOException {
		object.WriteExcel("Sheet1", "male", 6, 2);
		
	}
	@Test
	public void Writevalue8() throws IOException {
		object.WriteExcel("Sheet1", "female", 7, 2);
		
	}
	@Test
	public void Writevalue9() throws IOException {
		object.WriteExcel("Sheet1", "male", 8, 2);
		
	}
	@Test
	public void Writevalue10() throws IOException {
		object.WriteExcel("Sheet1", "male", 9, 2);
		
	}
	

}
