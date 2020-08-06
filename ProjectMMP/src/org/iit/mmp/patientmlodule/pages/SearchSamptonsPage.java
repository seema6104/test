package org.iit.mmp.patientmlodule.pages;

import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SearchSamptonsPage extends TestBase{
	  
	    WebDriver driver;
	    By symptom = By.id("search");
	    By submitBtn = By.name("submit");
	    
	    
	    public SearchSamptonsPage(WebDriver driver)
	    {
	    	this.driver = driver;
	    }
	 
	    public void enterSymptoms(String sym)
	    {
            
	    	driver.findElement(symptom).sendKeys(sym);
	    }
	    public void clickSubmit() throws Exception
	     {
	    	 driver.findElement(submitBtn).click();
	    	 Thread.sleep(5000);
	      }
	    
	    public void enterData(String symptom) throws Exception
	    {
	    	enterSymptoms(symptom);
	    	clickSubmit();
	    }
	 
	    	 
      }

   

