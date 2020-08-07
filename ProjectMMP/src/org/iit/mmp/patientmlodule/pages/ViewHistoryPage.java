package org.iit.mmp.patientmlodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewHistoryPage {
	
	WebDriver driver;
	By viewHisBtn = By.xpath("//button[contains(text(),'View History')]");
	
	
	
	public ViewHistoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickViewHis() throws Exception
	{
		driver.findElement(viewHisBtn).click();
		Thread.sleep(5000);
	}
	
   public void searchhistroyKind(String historyKind)
   {
	   driver.findElement(By.xpath("//input[@value='"+historyKind+"']")).click();
   }
   
   
     public void search() throws Exception
     {
    	 clickViewHis();
    	 searchhistroyKind("Past Transaction");
    	 
    	 //Past Appointments
    	 //Past Diagnosis
    	 //Past Prescription
    	 
     }
}
