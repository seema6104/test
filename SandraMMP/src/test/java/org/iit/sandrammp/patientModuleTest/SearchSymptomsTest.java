package org.iit.sandrammp.patientModuleTest;
import java.util.List;
import org.iit.sandrammp.helper.mmpHelperClass;
import org.iit.sandrammp.patientModulePage.SearchSymptomsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSymptomsTest {
	 WebDriver driver;
	 SearchSymptomsPage ssPage;
     mmpHelperClass helper;
    @Test
    public void validSearchSymptoms() throws Exception {
    	helper = new mmpHelperClass(driver);
    	Thread.sleep(3000);
    	helper.navigateToModule("Search Symptoms");
    	ssPage = new SearchSymptomsPage(driver);
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
