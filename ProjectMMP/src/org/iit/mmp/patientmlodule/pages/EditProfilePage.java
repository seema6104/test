package org.iit.mmp.patientmlodule.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfilePage {
	 
	
	WebDriver driver;
	 By clkProfile = By.xpath("//span[contains(text(),'Profile')]");
	 By editBTn = By.id("Ebtn");
	 By editAge = By.id("age");
     By editWeigh = By.id("weight");
     By editSave  = By.id("Sbtn");
    

       public EditProfilePage(WebDriver driver)
       {
    	  this.driver=driver;
       }
     
       public void clickOnProfile()
       {
    	   driver.findElement(clkProfile).click();
       }
       
       public void clickOnEdit()
       {
    	   driver.findElement(editBTn).click(); 
       }
       
       public void editAge(String age)
       {
    	   driver.findElement(editAge).clear();
    	   driver.findElement(editAge).sendKeys(age);
       }
      public void editweigh(String weigh) 
       {
    	 
    	  driver.findElement(editWeigh).clear();
    	  driver.findElement(editWeigh).sendKeys(weigh);
      }
      
      public void clickOnSaveBTn()
      {
    	  driver.findElement(editSave).click();
      }
      
      public String readSuccessMsg()
      {
    	  Alert alert= driver.switchTo().alert();
    	  String actual =alert.getText();
    	  alert.accept();
		  return actual;
    	  
      }
      
      public void fillData()
      {
    	  clickOnProfile();
    	  clickOnEdit();
    	  editAge("34");
    	  editweigh("134");
    	  clickOnSaveBTn();
    	  
    	  
      }
//      public void editProfileWithInvalidCredentials(String eAge, String weigh) 
//      {
//    	  driver.findElement(clkProfile).click();
//    	  driver.findElement(editBTn).click();
//    	  driver.findElement(editAge).clear();
//    	  driver.findElement(editAge).sendKeys(eAge);
//    	  driver.findElement(editWeigh).clear();
//    	  driver.findElement(editWeigh).sendKeys(weigh);
//    	  driver.findElement(editSave).click();
//    	  
//      }








    


  }
