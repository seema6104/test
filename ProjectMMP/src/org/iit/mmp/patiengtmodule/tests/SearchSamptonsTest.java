package org.iit.mmp.patiengtmodule.tests;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.SearchSamptonsPage;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class SearchSamptonsTest extends TestBase{
	  
	     WebDriver driver;
	     SearchSamptonsPage ssp;
	     HelperClass helper;
	    
	    @Test(priority=3)
	    public void validSearchSymptoms() throws Exception {
	    	ssp = new SearchSamptonsPage(driver);
            helper = new HelperClass(driver);
            helper.navigateToModule("Search Symptoms");
	    	ssp.enterData("flu");
	    
	    	String validateText = driver.findElement(By.xpath("//body//td[1][contains(text(),'flu')]")).getText();
	    	 System.out.println("Valid symptom " +validateText);
	    	 String exPectedTitle= driver.getTitle();
	    	  System.out.println("Title of the page is " +exPectedTitle);
	    	  
	    	 if(validateText.contains("flu")) {
	    		 System.out.println("Valid input!!Test passed");
	    	 } else {
	    		 System.out.println("Invalid input");
	    	 }
	     	
	    }
       
//	    @Test(priority=5)
//	    public void inValidSearchSymptoms() {
//          
//	    	driver.findElement(By.xpath("//span[contains(text(),'Search Symptoms')]")).click();
//	    	driver.findElement(By.id("search")).click();
//	    	driver.findElement(By.id("search")).sendKeys("xyz");
//	    	driver.findElement(By.xpath("//input[@name='submit']")).click();
//	    	
//	    	  String exPectedTitle= driver.getTitle();
//	    	  System.out.println("Title of the page is " +exPectedTitle);
//	    	  
//	    	 
//	    	if(exPectedTitle.equals(exPectedTitle)) {
//	    		 System.out.println("Invalid input!!Test passed");
//	    	 } else {
//	    		 System.out.println("Valid Input!! Test failed");
//	    	 }
//
//	    }
 
  
       }
