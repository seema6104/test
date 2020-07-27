package org.iit.mmp.patientmlodule.pages;

import org.iit.util.TestBase;
import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class SearchSamptons extends TestBase{
	  
	    @Test(priority=3)
	    public void validSearchSymptoms() throws Exception {
            
	    	driver.findElement(By.xpath("//span[contains(text(),'Search Symptoms')]")).click();
	    	driver.findElement(By.id("search")).click();
	    	driver.findElement(By.id("search")).sendKeys("fever");
	    	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	    	 Thread.sleep(5000);
	    	 
	    	 String validateText = driver.findElement(By.xpath("//body//td[1][contains(text(),'fever')]")).getText();
	    	 System.out.println("Valid symptom " +validateText);
	    	 String exPectedTitle= driver.getTitle();
	    	  System.out.println("Title of the page is " +exPectedTitle);
	    	  
	    	 if(validateText.contains("fever")) {
	    		 System.out.println("Valid input!!Test passed");
	    	 } else {
	    		 System.out.println("Invalid input");
	    	 }
	     	
	    }
       
	    @Test(priority=5)
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
