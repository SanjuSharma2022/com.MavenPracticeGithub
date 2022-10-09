package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoDropdown { 

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://testngjar//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		//driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		System.out.println("Browser is launched");
		Thread.sleep(50000);
		
//		WebElement MultiBox = driver.findElement(By.id("multiselect1"));
//		Select select1 = new Select (MultiBox);
//		select1.selectByVisibleText("Hyundai");
//		List<WebElement> options = select1.getOptions();
//		
//		for (WebElement element : options) {
//			
//			System.out.println(element.getText());		}
//		
//		
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("drop1")).click();
//		//dropdown.click();
//		WebElement dropdown = driver.findElement(By.id("drop1"));
//		Select select2 = new Select (dropdown);
//		select2.selectByVisibleText("doc 3");
//		
//		List <WebElement> options1 = select2.getOptions();
//		for (WebElement XYZ : options1) {
//			System.out.println(XYZ.getText());
//		}
		
//		List<WebElement>  ABC= driver.findElements(By.partialLinkText("Page"));
//		//((WebElement) ABC).click();
//		
//		for (WebElement GHJ : ABC){
//			String text = GHJ.getText();
//			System.out.println(text);
//		}
//		
//		WebElement WER = driver.findElement(By.partialLinkText("Page"));
//		String text = WER.getText();
//		WER.click();
//		
//		
//		if (text != null) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False");
//		}
			
//		WebElement button = driver.findElement(By.id("but2"));
//		System.out.println(button.isEnabled());
//		 
//		System.out.println(driver.findElement(By.id("but1")).isEnabled());
//		
		
//		WebElement checkbox = driver.findElement(By.id("checkbox1"));
//		System.out.println(checkbox.isSelected());
//		
//		File srcScreenshot = driver.findElement(By.id("checkbox1")).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcScreenshot, new File(System.getProperty("user.dir")+ "\\screens\\Checkbox.png"));
		
		
//		String P = driver.getPageSource();
//		
//		System.out.println(P);
		
//		JavascriptExecutor xy=(JavascriptExecutor)driver;
//		xy.executeScript("window,scroll(0,800)");
//		
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys("SANJU");
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]"));
//		password.submit();
//		
//		Thread.sleep(10000);
		
//		String window1 = driver.getWindowHandle();
//		
//		driver.findElement(By.linkText("Open a popup window")).click();
//		
//		Set<String> windows = driver.getWindowHandles();
//		
//		Iterator<String> itrwin = windows.iterator();
//		
//		while(itrwin.hasNext()){
//			
//			String window = itrwin.next();
//			
//			driver.switchTo().window(window);
//			
//			if (driver.getTitle().equals("Basic Web Page Title")) {
//				//System.out.println();
//				driver.close();
//				
//			}
//			else {
//				WebElement radiobutton = driver.findElement(By.id("radio1"));
//				radiobutton.click();
//				System.out.println(radiobutton.getAttribute("value"));
//			}
//		}
//		String cla = checkbox.getClass().getSimpleName();
//		
//		System.out.println(cla);
//		

//		String abc = checkbox.getTagName();
//		System.out.println(abc);
		
//		if(driver.findElement(By.id("iframe2")) != null) {
//			System.out.println("frame returns");
//			driver.switchTo().defaultContent();
//			System.out.println("default returns");
//		}
//		else {
//			System.out.println("failed");
//		}
		
//		driver.findElement(By.className("dropbtn")).click();
//		
//		WebDriverWait waittime = new WebDriverWait(driver, 15);
//		
//		waittime.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
//		
//		driver.findElement(By.linkText("Facebook")).click();
		
		
//		WebElement checkthis = driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button"));
//		
//		checkthis.click();
//		
//		WebDriverWait waitagain = new WebDriverWait(driver,20);
//		
//		waitagain.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
//		
//		WebElement Mroption = driver.findElement(By.id("dte"));
//		if (Mroption!= null) {
//			
//			Mroption.click();
//			System.out.println("Checkbox clicked");
//			
//		}
//		
//		else {
//			System.out.println("Not clicked");;
//		}
//		
//		WebDriverWait wait2 = new WebDriverWait (driver,30);
//		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("deletesuccess")));
//		
//		driver.findElement(By.xpath("//*[@id=\"alert2\"]")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		
//		System.out.println(text);
//		
//		 alert.accept();
//		
//		if (text==null) {
//			
//			System.out.println(text);
//			
//		}
//		else {
//			System.out.println("0");
//		}
	
	
//	WebDriverWait wait3 = new WebDriverWait (driver,5);
//	List<WebElement> text = wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("delayedText")));
	
		
//		driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]/button[2]")).click();
//		
//		Thread.sleep(20000);
//		
//		System.out.println(driver.findElement(By.id("myBtn")).isEnabled());
//		
		
//		driver.findElement(By.id("confirm")).click();
//		
//		WebDriverWait wait5 = new WebDriverWait (driver,10);
//		wait5.until(ExpectedConditions.alertIsPresent());
//		
//		Alert alert = driver.switchTo().alert();
//		String text1 = alert.getText();
//		
//		if (text1==null) {
//			System.out.println(0); 
//		}
//		else {
//			System.out.println(text1);
//		}
//
//		alert.accept();
		
//		driver.findElement(By.id("prompt")).click();
//		
//		Thread.sleep(10000);
//		
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(20000);
//		
//		alt.sendKeys("firefox");
//		Thread.sleep(20000);
//		
//		alt.getText();
//		
//		alt.accept();
		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.id("blogsmenu"))).build().perform();
//		
		
//		Actions act = new Actions (driver);
//		
//		act.moveToElement(driver.findElement(By.id("confirm"))).click().build().perform();
//		
//		Thread.sleep(20000);
		
//		WebElement drag = driver.findElement(By.id("//*[@id=\"post-body-6103478144908648662\"]/div[1]/div[2]/form/div/div/div[2]/a[1]"));
//		
//		Actions action = new Actions(driver);
//		
//		action.dragAndDropBy(drag, 100, 0);
//	
//		JavascriptExecutor xyz=(JavascriptExecutor)driver;
//		xyz.executeScript("window.scroll(0,2500)"); 
//		
//		Thread.sleep(20000);
//		
//		WebElement DC = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
//		Actions DD = new Actions(driver);
//		
//		DD.doubleClick(DC).build().perform();
//		Thread.sleep(20000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		
//		WebElement line = driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea"));
//		line.clear();
		
//		JavascriptExecutor xyz=(JavascriptExecutor)driver;
//		xyz.executeScript("window.scroll(0,2500)"); 
//		
//		Thread.sleep(20000);
//		
//		String Projpath = System.getProperty("user.dir");
//		
//		driver.findElement(By.id("uploadfile")).sendKeys(Projpath+"\\screens\\Checkbox.png");
		
//		JavascriptExecutor XYZ = (JavascriptExecutor)driver;
//		XYZ.executeScript("alert('Selenium');");
//		Thread.sleep(2000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(alt.getText());
//		alt.accept();	
		
//		JavascriptExecutor XYZ = (JavascriptExecutor)driver;
//		XYZ.executeAsyncScript("window.setTimeout(function(){alert('hello');},4000);alert('WORLD');");
//		
//		Thread.sleep(2000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(alt.getText());
//		alt.accept();
		
//		Set<Cookie> cookie = driver.manage().getCookies();
//		
//		for (Cookie cookie1 : cookie) {
//			System.out.println("Cookie Name :"+cookie1.getName());
//			System.out.println("Cookie Value :"+cookie1.getValue());
//			System.out.println("Cookie path :"+cookie1.getPath());
//			System.out.println("Cookie Expiry :"+cookie1.getExpiry());
//		}
		
//		Cookie cookie = driver.manage().getCookieNamed("language");
//		
//		System.out.println("cookie path"+cookie.getPath());
//		
//		driver.quit();
		
//		Cookie cook = new Cookie("rotten", "cookie");
//		driver.manage().addCookie(cook);
//		Thread.sleep(2000);
		
//		driver.manage().deleteCookieNamed("rotten");
//		Thread.sleep(2000);
//		
//		Cookie cook3 = new Cookie("again", "cook3");
//		
//		driver.manage().addCookie(cook3);
//		
//		Thread.sleep(2000);
//		
//		driver.manage().deleteCookie(cook3);
//		
//		System.out.println(cook3);
//		
//		Thread.sleep(2000);
//		driver.manage().deleteAllCookies();
		
		
		
	
	}
	
}
