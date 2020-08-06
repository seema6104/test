package org.iit.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	                        
	 public String url1 = "http://96.84.175.78/MMP-Release1-Integrated-Build.2.4.000/";
     public String url2= "http://96.84.175.78/MMP-Release1-Integrated-Build.2.4.000/portal/profile.php";
     public String adminUrl = "http://96.84.175.78/MMP-Release1-Integrated-Build.2.4.000/admin/login.php";
	 public WebDriver driver;
	  
	   @BeforeTest
	   public void launchdriver() throws Exception {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   //WebDriverManager.firefoxdriver().setup();
	  //driver = new FirefoxDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(url2);
	    
    	}

	@AfterTest
    public void closeBrowser() throws Exception {
    	Thread.sleep(5000);
    	driver.quit();
    	
    	
    	 
    }
 
   
   
    }
