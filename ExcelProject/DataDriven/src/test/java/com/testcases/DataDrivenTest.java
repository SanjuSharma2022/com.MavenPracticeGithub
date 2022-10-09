package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Baseclass;

public class DataDrivenTest extends Baseclass{
	@Test(dataProvider="creds")
	public void test(String username, String password) {
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		System.out.println(username+" || "+password);
		
		String title = driver.getCurrentUrl();
		String Expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(title, Expected);
		System.out.println(title);
		 
		
		
	}

}
