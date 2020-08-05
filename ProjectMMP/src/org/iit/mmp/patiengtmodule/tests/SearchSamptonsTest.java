package org.iit.mmp.patiengtmodule.tests;
import java.util.List;
import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.SearchSamptonsPage;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchSamptonsTest extends TestBase{
	  
	     WebDriver driver;
	     SearchSamptonsPage ssPage;
	     HelperClass helper;
	    
	    @Test(priority=3)
	    public void validSearchSymptoms() throws Exception {
	    	helper = new HelperClass(driver);
	    	Thread.sleep(3000);
	    	helper.navigateToModule("Search Symptoms");
	    	ssPage = new SearchSamptonsPage(driver);
            ssPage.enterData("flu");
            //Validating the title of the page
            String actualTitle = driver.getTitle();
            System.out.println("Current title of the page is :" +actualTitle);
             if (actualTitle.contains("search Symptoms")) {
            	Assert.assertTrue(true);
            	System.out.println("Test Passed!");
            } else {
            	System.out.println("Test Failed!!");
            }
            
            List<WebElement> trData = (List<WebElement>) driver.findElement(By.xpath("//table[@class='table']//tbody//tr/td"));
	    	 System.out.println("Size of data coloumn is :" +trData);
	    	 
	    	 if (trData.size()==3) {
	    		 System.out.println("Data displayed!!");
	    	 }
	    	 else {
	    		 System.out.println("Data is not displayed!!");
	    	 }
	    	 
//	    	 String validateText = driver.findElement(By.xpath("//body//td[1][contains(text(),'flu')]")).getText();
//		    	System.out.println("Valid symptom " +validateText);
//	    	 if(validateText.contains("flu")) {
//	    		 System.out.println("Valid input!!Test passed");
//	    	 } else {
//	    		 System.out.println("Invalid input");
//	    	 }
	     	
	    }
       
	    //@Test(priority=5)
	    public void inValidSearchSymptoms() {
          
	    	driver.findElement(By.xpath("//span[contains(text(),'Search Symptoms')]")).click();
	    	driver.findElement(By.id("search")).click();
	    	driver.findElement(By.id("search")).sendKeys("xyz");
	    	driver.findElement(By.xpath("//input[@name='submit']")).click();
	    	
	    	  String exPectedTitle= driver.getTitle();
	    	  System.out.println("Title of the page is " +exPectedTitle);
	    	  
	    	 
	    	if(exPectedTitle.equals(exPectedTitle)) {
	    		 System.out.println("Invalid input!!Test passed");
	    	 } else {
	    		 System.out.println("Valid Input!! Test failed");
	    	 }

	    }
 
  
       }
