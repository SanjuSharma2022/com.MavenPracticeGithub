package com.MavenPractice2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.MavenPractice.Baseclass;

public class Testcases extends Baseclass{
	
	
	
	@Test
	public void test(){
		
		
		driver.close();
		
		System.out.println("closed");
	}
	
	
	

}
