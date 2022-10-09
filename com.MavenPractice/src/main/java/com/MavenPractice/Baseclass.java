package com.MavenPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void main() {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		//driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		System.out.println("Browser is launched");
		System.out.println("started");
	}
	@AfterMethod
	public void end() {
		
		System.out.println("ends");
	}
}

