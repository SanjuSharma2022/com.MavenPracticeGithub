package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		
		
		System.out.println("Browser is launched");
		
		Thread.sleep(10000);
		
		
		
		
		Thread.sleep(10000);
		
		JavascriptExecutor xy=(JavascriptExecutor)driver;
		xy.executeScript("window.scroll(0,1500)");
		
		driver.findElement(By.name("firstname")).sendKeys("Robert"); 
		
		driver.findElement(By.name("lastname")).sendKeys("Downey");
		
		String text1 = driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[2]/input[1]")).getAttribute("value");
		
		System.out.println("Firstname = " + text1);
		
		String text2 = driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[2]/input[2]")).getAttribute("value");
		
		System.out.println("Lastname = " + text2);
		
		
		
		
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[2]/input[3]")).click();
		
		System.out.print("THE END");
		
		driver.quit();

	}

}
