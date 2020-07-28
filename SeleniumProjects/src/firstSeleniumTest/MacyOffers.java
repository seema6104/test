package firstSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MacyOffers {
	
    	public static void main(String[] args) {
    		
    	
    		WebDriverManager.chromedriver().setup();
    		WebDriver driver = new ChromeDriver();
    		
           driver.get("https://www.macys.com/");
    		
   List<WebElement> list=driver.findElements(By.xpath("//div[@class='badge  finalPrice subsequentBadges  ']/ancestor::div"));
            
    	System.out.println("Total list are: " + list);
    	}
}
