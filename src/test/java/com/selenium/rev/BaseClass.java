package com.selenium.rev;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	//	public WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("\"//a[text()='Create an Account'][1]\"")).click();
		 
		

		//		driver.navigate().to("https://www.facebook.com/");

		//		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		//		
		//		
		//		WebElement d = driver.findElement(By.id("form:drag_content"));
		//		WebElement vv = driver.findElement(By.id("form:drop_header"));
		//	
		//		Actions acc = new Actions(driver);

		//        acc.moveToElement(d).build().perform();
		//        acc.contextClick().build().perform();	
		//		  acc.dragAndDrop(d, vv).build().perform();

		//	driver.navigate().to("https://www.leafground.com/alert.xhtml");	
		//		driver.findElement(By.id("j_idt88:j_idt91")).click();
		//		driver.switchTo().alert().accept();

		//		driver.findElement(By.id("j_idt88:j_idt93")).click();
		//		driver.switchTo().alert().dismiss();

		//		driver.findElement(By.id("j_idt88:j_idt104")).click();
		//		driver.switchTo().alert().sendKeys("gtd");
		//		driver.switchTo().alert().accept();


		//		Robot rb = new Robot();
		//		
		//		rb.keyPress(KeyEvent.VK_CONTROL);
		//		rb.keyPress(KeyEvent.VK_SHIFT);
		//		rb.keyPress(KeyEvent.VK_I);
		//		
		//		rb.keyRelease(KeyEvent.VK_CONTROL);
		//		rb.keyRelease(KeyEvent.VK_SHIFT);
		//		rb.keyRelease(KeyEvent.VK_I);

		//	driver.get("https://demo.guru99.com/test/newtours/register.php");
		//		
		//		WebElement sl = driver.findElement(By.id("menu1"));
		//		
		//		Select ss = new Select(sl);
		//		ss.selectByIndex(0);

		//		WebElement ele = driver.findElement(By.name("country"));
		//		Select sc = new Select(ele);

		//	sc.selectByIndex(9);
		//	sc.selectByValue("INDIA");

		//
		//		driver.get("https://output.jsbin.com/osebed/2");
		//
		//		WebElement d = driver.findElement(By.id("fruits"));
		//
		//		Select sc = new Select(d);
		//
		//		System.out.println(sc.isMultiple()); 
		//		sc.selectByIndex(1);
		//		sc.selectByValue("orange");
		//		sc.selectByVisibleText("Grape");
		//		
		//		List<WebElement> c = sc.getAllSelectedOptions();
		//		for (WebElement webElement : c) {
		//			System.out.println(webElement);
		//		}


//		driver.get("https://www.leafground.com/radio.xhtml");
//
//		WebElement ss =  driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']//preceding::div[1]"));
	//	System.out.println(ss.isDisplayed());
		//        System.out.println(ss.isEnabled());
		//        System.out.println(ss.isSelected());



		//		TakesScreenshot ts = (TakesScreenshot) driver;
		//		File ss = ts.getScreenshotAs(OutputType.FILE);
		//		File f1 = new File("Z:\\Automation Testing\\2.SELENIUM\\file.png");
		//		FileHandler.copy(ss, f1);


		//		
		//		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//		
		//		List<WebElement> li = driver.findElements(By.tagName("td"));
		//		for (WebElement webElement : li) {
		//			System.out.println(webElement.getText());
		//		}


		//	driver.get("https://www.leafground.com/frame.xhtml");



		//		List<WebElement> li = driver.findElements(By.tagName("iframe"));
		//		System.out.println(li.size());

		//		driver.switchTo().frame(0);
		//		driver.findElement(By.id("Click")).click();

		//		driver.switchTo().parentFrame();
		//		driver.switchTo().frame(1);
		//		
		//		List<WebElement> li = driver.findElements(By.tagName("iframe"));
		//		System.out.println("frame: "+li.size());
		//		
		//		
		//		driver.switchTo().parentFrame();
		//		driver.switchTo().frame(2);
		//		
		//		List<WebElement> li1 = driver.findElements(By.tagName("iframe"));
		//		System.out.println("frame: "+li1.size());
		//		
		//		driver.switchTo().frame(0);
		//		driver.findElement(By.id("Click")).click();
		//		
		//		driver.switchTo().defaultContent();
		//		
		//		
		//		driver.switchTo().frame(0);
		//		driver.findElement(By.id("Click")).click();



		//		File f = new File(System.getProperty("user.dir")."")

		//		driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
		//		
		//		driver.findElement(By.id("usernameField")).sendKeys("tawfeekrahman98@gmail.com");
		//		driver.findElement(By.id("passwordField")).sendKeys("Feekoshayo3798#");
		//		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.findElement(By.id("attachCV")).click();
		//cc.sendKeys("Z:\\1.pdf");


		//
		//		driver.get("https://online.citibank.co.in/");
		//		String pa = driver.getWindowHandle();
		//		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		
		//		WebDriverWait wait = new WebDriverWait(driver , 10);
		//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Close']"))));
		//		 
		//
		//		WebElement dd = driver.findElement(By.className("txtSign"));	
		//		dd.click();
		//
		//
		//		Set<String> ss = driver.getWindowHandles();
		//		
		//		List<String> allWindows2 = new ArrayList<String>();
		//
		//		for (String window : ss) {
		//			allWindows2.add(window);
		//		}
		//
		//		System.out.println(allWindows2);
		//
		//		driver.switchTo().window(allWindows2.get(allWindows2.size()-1));
		//		driver.findElement(By.id("User_Id")).sendKeys("tawfeek");
		//		
		//		
		//		driver.switchTo().window(pa);
		//         
		//		WebElement dd1 = driver.findElement(By.className("txtSign"));	
		//		dd1.click();

		//		driver.navigate().to("https://www.amazon.in/");

		//		List<WebElement> links = driver.findElements(By.tagName("img"));  //"img"
		//		for(WebElement w :links) {
		//			String url = w.getAttribute("src");  //src
		//			URL linkUrl = new URL(url);	
		//			HttpURLConnection httpConn = (HttpURLConnection) linkUrl.openConnection();
		//			Thread.sleep(3000);
		//			httpConn.connect();
		//			int responseCode = httpConn.getResponseCode();
		//			System.out.println(responseCode);
		//			if(responseCode>=400) {
		//				System.out.println("Broken Link: "+ url);
		//			}
		//			else {
		//				System.out.println("Normal Link: "+ url);
		//			}
		//		}



		//		WebElement w = driver.findElement(By.name("login"));
		//		
		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].setAttribute('value','tawfeek')", w);
		//		js.executeScript("arguments[0].setAttribute('placeholder','user')", w);


		//		Object attributeValue = js.executeScript("return arguments[0].getAttribute('class')", w);
		//		System.out.println(attributeValue);

		//		js.executeScript("arguments[0].click()", w);


		//js.executeScript("window.scroll(0,3000)");
		//		
		//		js.executeScript("window.scroll(0,3000)");
		//WebElement todayDeal = driver.findElement(By.xpath("//h2[text()=\"Today’s Deals\"]"));



		//		driver.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
		//		
		//		
		//		
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait
		//		
		//		// driver.findElement(By.xpath("//a[text()=' X ']")).click();
		//		
		//		
		//		
		//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=' X ']"))));
	
		
//		BaseClass bc = new BaseClass();
	    
		
		
		





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




		//		Thread.sleep(70000);




		//	driver.close();



	}

}
