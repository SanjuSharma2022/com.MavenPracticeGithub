package com.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.utility.ExcelLibrary;

public class Baseclass {
	public WebDriver driver;
	ExcelLibrary obj = new ExcelLibrary();
	@BeforeMethod
	public void main() {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		System.out.println("Browser is launched");
		//Thread.sleep(50000);

}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
//	@DataProvider(name="creds")
//	public Object[][] getdata() {
//		
//		Object[][] data = new Object[2][2];
//		
//		data[0][0]= "Admin";
//		data[0][1]="admin123";
//		
//		
//		
//		data[1][0]= "Admin";
//		data[1][1]="admin123";
//		return data;
//		
//	}
	@DataProvider(name="creds")
	public Object[][] getexceldata() {
		int rows = obj.getRowCount("Data");
		int cols = obj.getColumnCount("Data");
		//For username password rows
		int actrows = rows-1;
		
		Object[][] data = new Object[actrows][cols];
		
		for(int i=0; i<actrows; i++) {
			for (int j=0; j<cols; j++) {
				data[i][j]=obj.getCellData("Data", j, i+2);
				
			}
			
		}
		return data;
	}
}

	
