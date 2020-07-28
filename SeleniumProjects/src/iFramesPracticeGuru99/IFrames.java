package iFramesPracticeGuru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class IFrames {

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\seema\\OneDrive\\Desktop\\Selenium\\software\\driver\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");

	}
	
	@Test
	public void iFrameApp()
	
	{
		
		int size = driver.findElements(By.tagName("frame")).size();
		System.out.println("Size of iFrames are: " +size);
		//driver.switchTo().frame(0);
		String expectedTitle =driver.getTitle();
		System.out.println("Title is: " +expectedTitle);
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();

		
		
		driver.switchTo().frame("classFrame");
		String actual= driver.findElement(By.className("title")).getText();
		System.out.println("Text recived from web page: " +actual);
		boolean result = actual.contentEquals("WebDriver");
		
		if(result) {
		System.out.println("Passed");
			
		} else {
			System.out.println("Failed");
		}
		
	}
	
	
	

}
