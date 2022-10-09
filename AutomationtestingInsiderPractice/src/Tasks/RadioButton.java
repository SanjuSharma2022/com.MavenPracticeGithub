package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		//driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		
		
		System.out.println("Browser is launched");
		
		Thread.sleep(10000);
		
		JavascriptExecutor xy=(JavascriptExecutor)driver;
		xy.executeScript("window.scroll(0,1600)");
		
		
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/input[1]"));
		radiobutton.click();
		System.out.println("Radiobutton : " + radiobutton.isSelected());
		
		//String text1 = driver.findElement(By.id("pah")).getText();
		//System.out.println(" Page text is shown here : " + text1);
	}
	
	

	}


