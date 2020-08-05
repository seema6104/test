package firstSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;


public class AmazonPurchase {
	
	   WebDriver driver;

	
	@BeforeTest
	  public void launch() throws Exception	{
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\seema\\OneDrive\\Desktop\\Selenium\\software\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  driver.get("https://www.amazon.com/");
		  Thread.sleep(5000);
		  
		  Actions action = new Actions(driver);
		  
		  driver.findElement(By.className("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
	
         }
	
	//@Test
	public void loginAmazonAccount() {
		
		
		
		
	}
	
	
	
	
}
