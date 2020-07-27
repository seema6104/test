package org.iit.mmp.patientmlodule.pages;
import java.util.HashMap;
import org.iit.mmp.helper.HelperClass;
import org.iit.util.AppLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointmentPage {
	
	  By createNewAppBtn = By.xpath("//input[@value='Create new appointment']");
	  By datePicker = By.id("datepicker");
	  By selectTime = By.id("time");
	  By continueButton  = By.id("ChangeHeatName");
	  By symptomTxtBox = By.id("sym");
	  By submitButton = By.xpath("//input[@value='Submit']");
	  By providerNameDetail = By.xpath("//a[contains(text(),'Provider')]");
	  By timeDetails = By.xpath("//a[contains(text(),'Time')]");
	  By symDetails = By.xpath("//a[contains(text(),'Symptoms')]");
	  By headerDetails = By.xpath("(//h3[@class='panel-title'])[2]");
	  
	  
	 WebDriver driver;
	 HelperClass helper;
	 
	 public ScheduleAppointmentPage(WebDriver driver)
	 {
		this.driver=driver;
		helper = new HelperClass(driver);
	 }
	 
	 public HashMap<String, String> bookAnAppointment(String doctorName)
	 {
		HashMap<String, String> hMap = new HashMap<String, String>();
		
		String time = "10Am";
		String dateOfApp = AppLibrary.getFutureDate(20);
		String sym = "Booking an appointment " +doctorName+" on date "+dateOfApp+" for symptom fever";
		driver.findElement(createNewAppBtn).click();
		driver.findElement(By.xpath("//h4[text()='"+doctorName+"']/ancestor::ul/following-sibling::button")).click();
        driver= helper.switchToAFrameAvailable("myframe", 20);
		driver.findElement(datePicker).sendKeys(dateOfApp);
		driver.findElement(datePicker).sendKeys(Keys.TAB);
		Select timeSelect = new Select(driver.findElement(By.id("time")));
		timeSelect.selectByVisibleText(time);
		driver.findElement(continueButton).click();
        driver.findElement(symptomTxtBox).sendKeys(sym);
		driver.findElement(submitButton).click();
		hMap.put("time", "10Am");
		hMap.put("doctorName", doctorName);
		hMap.put("sym", sym);
		hMap.put("dateOfApp", dateOfApp);
		return hMap;
	        
	 }
	 
	 public boolean validateAppointmentDetailsinSchedulePage(HashMap<String,String> hMap) throws Exception
		{
		 hMap = new HashMap<String, String>();
		 boolean result = false;
		 helper.navigateToModule("Schedule Appointment");
		 String providerArr[] = driver.findElement(providerNameDetail).getText().split(":");
		 String timeArr[]= driver.findElement(timeDetails).getText().split(":");
		 String appTime = driver.findElement(headerDetails).getText();
		 String symArr[]= driver.findElement(symDetails).getText().split(":");
		 if (hMap.get("doctorName").contains(providerArr[1]) && hMap.get("time").contains(timeArr[1]) &&
		 hMap.get("dateOfApp").contains(appTime) &&	hMap.get("sym").contains(symArr[1]));
		 {
			result = true;
			System.out.println("Data for schedule appointment is displayed successfully");
	 	 }
	    
		 return result;	
   }
}

	 
	   
	     
	     
	     
	     
			
			
	
	


