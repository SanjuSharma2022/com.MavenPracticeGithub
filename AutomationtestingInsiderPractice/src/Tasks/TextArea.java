package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TextArea {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		
		
		System.out.println("Browser is launched");
		
		Thread.sleep(10000);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
		
		JavascriptExecutor xy=(JavascriptExecutor)driver;
		xy.executeScript("window.scroll(0,1000)");
		
		driver.findElement(By.name("message")).sendKeys("Text Area Cleared");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[1]/input")).click();
		
		Thread.sleep(10000);
		
		System.out.println("Submit done ");
		
		JavascriptExecutor AB=(JavascriptExecutor)driver;
		AB.executeScript("window.scroll(0,1200)");
		
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File ("C:\\Users\\sanju\\Desktop\\workspace\\DLC.jpg"));
		
		
		driver.quit();
		
		System.out.println("Screenshot attached in preferred location");

	}

}
