package org.iit.mmp.patientmlodule.pages;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.iit.mmp.helper.HelperClass;
import org.iit.util.AppLibrary;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterAccountPage {
	
	    WebDriver driver;

	   By fNameTB= By.id("firstname");
	   By lNameTB= By.id("lastname");
	   By dobTB = By.id("datepicker");
	   By licenseTB = By.id("license");
	   By ssnTB   = By.id("ssn");
	   By stateTB   = By.id("state");
       By cityTB   = By.id("city");
	   By addressTB   = By.id("address");
	   By zipcodeTB   = By.id("zipcode");
	   By ageTB   = By.id("age");
	   By heightTB =By.id("height");
       By weightTB   = By.id("weight");
	   By pharmacyTB   = By.id("pharmacy");
	   By pharmaAdressTB   = By.id("pharma_adress");
       By emailTB   = By.id("email");
       By pwdTB   = By.id("password");
	   By uNameTB   = By.id("username");
	   By conPWDTB  = By.id("confirmpassword");
	   By securityTB   = By.id("security");
	   By answerTB = By.id("answer");
	   By clkSaveTB = By.xpath("//input[@name='register']");
	   HelperClass helper; 
	   HashMap<String, String> hMap = new HashMap<String, String>();
	   
	   int nChars= 5;
	   
	
	  public RegisterAccountPage(WebDriver driver)
	  {
	 	   this.driver=driver;
	 	   helper= new HelperClass(driver);
	  }
	   
	   public void enterFirstName()
	   {
		   String fNameValue= "ATfname" + AppLibrary.getRandomChars(nChars);
		   driver.findElement(fNameTB).sendKeys(fNameValue);
		   hMap.put("fName", fNameValue); 
		  
	   }
	   public void enterLastName()
	   {
		   String lNameValue= "ATlname" +AppLibrary.getRandomChars(nChars);
		   driver.findElement(lNameTB).sendKeys(lNameValue);
		   hMap.put("lName", lNameValue);
	   }
	   
	   public void enterDob(int n)
	   {
		   String date = AppLibrary.getFutureYear(n, "dd/MM/YYYY");
		   driver.findElement(dobTB).sendKeys(date);
		   hMap.put("dob", date);
	   }
	   public void enterLicence()
	   {
		  Long licenseValue=  AppLibrary.getRandomDigits(7);
		  driver.findElement(licenseTB).sendKeys("23456789");
		  hMap.put("license", licenseValue.toString());
	   }
	   
	   public void enterSSN()
	   {
		   Long ssnValue= AppLibrary.getRandomDigits(8);
		   driver.findElement(ssnTB).sendKeys(ssnValue.toString());
		   hMap.put("ssn", ssnValue.toString());
	   }
	   public void enterState()
	   {
		   int n = new Random().nextInt(2);
		   String stateValue= AppLibrary.stateArr()[n];
		   driver.findElement(stateTB).sendKeys(stateValue);
		   hMap.put("state", stateValue);
		}
	  
	   public void enterCity()
	   {
		  int n = new Random().nextInt(3);
		  String cityValue= AppLibrary.cityArr()[n];
		  driver.findElement(cityTB).sendKeys(cityValue);
		  hMap.put("city", cityValue);
	   }
    
	   public void enterAddress()
	   {
		   String addressValue= "ATaddress" + AppLibrary.getRandomChars(nChars);
		   driver.findElement(addressTB).sendKeys(addressValue);
		   hMap.put("address", addressValue);
	   }
	   
	   public void enterZip()
	   {
		   Long zipValue = AppLibrary.getRandomDigits(4);
		   driver.findElement(zipcodeTB).sendKeys(zipValue.toString());
		   hMap.put("zipcode", zipValue.toString());
	   }
	   public void enterAge()
	   {
		   Long ageValue = AppLibrary.getRandomDigits(1);
		   driver.findElement(ageTB).sendKeys(ageValue.toString());
		   hMap.put("age", ageValue.toString());
	  }
	   public void enterHeight()
	   {
		   Long heightValue= AppLibrary.getRandomDigits(1);
		   driver.findElement(heightTB).sendKeys(heightValue.toString());
		   hMap.put("height", heightValue.toString());
	   }
	   public void enterWeight()
	   {
		   Long weighValue = AppLibrary.getRandomDigits(1);
		   driver.findElement(weightTB).sendKeys(weighValue.toString()); 
		   hMap.put("weight", weighValue.toString());
	   }
	   public void enterPharmacy()
	   {
		   String pharmacyValue = "ATpharmacy"+AppLibrary.getRandomChars(nChars);
		   driver.findElement(pharmacyTB).sendKeys(pharmacyValue);  
		   hMap.put("pharmacy", pharmacyValue);
	   }
    
	   public void pharmacyAddress()
	   {
		String phar_Address_Value= "ATPharmacyAdress"+AppLibrary.getRandomChars(nChars);
		driver.findElement(pharmaAdressTB).sendKeys(phar_Address_Value);
		hMap.put("pharmacy address", phar_Address_Value);
	   }
	 
	   public void enterEmail()
	   {
		   String emailValue="ATFName"+AppLibrary.getRandomChars(nChars)+"@gmail.com";
		   driver.findElement(emailTB).sendKeys(emailValue);
		   hMap.put("email", emailValue);
	   }
	   public void enterUname()
	   {
		   String uNameValue="ATuName" +AppLibrary.getRandomChars(nChars);
		   driver.findElement(uNameTB).sendKeys(uNameValue); 
		   hMap.put("userName", uNameValue);
	   }
	   
	   public void enterPassword()
	   {
		   String passwordValue= "ATFname" +AppLibrary.getRandomChars(nChars) + AppLibrary.getRandomDigits(nChars);
		   driver.findElement(pwdTB).sendKeys(passwordValue);
		   hMap.put("password", passwordValue);
		   
		   driver.findElement(conPWDTB).sendKeys(passwordValue);
		   hMap.put("ConfirmPWD", passwordValue);
		   
		   
	   }

     public void enterSecurityQA()
     {
    	Select question = new Select(driver.findElement(securityTB));
    	question.selectByVisibleText("what is your best friend name");
    	String anserValue ="ATanswer"+AppLibrary.getRandomChars(nChars);
		driver.findElement(answerTB).sendKeys(anserValue); 
		hMap.put("answer", anserValue);
     }
    public void clickSaveButton() throws Exception
     {
    	
	    driver.findElement(clkSaveTB).click();
	    Thread.sleep(5000);
     }
    
    public String readSuccessMsg()
    {
    	Alert alert = driver.switchTo().alert();
    	String actual = alert.getText();
    	alert.accept();
		return actual;
    	
    }
    
   public HashMap<String, String> fillData() throws Exception 
   {
	   enterFirstName();
	   enterLastName();
	   enterDob(-20);
	   enterLicence();
	   enterSSN();
	   enterState();
	   enterCity();
	   enterAddress();
	   enterZip();
	   enterAge();
	   enterHeight();
	   enterWeight();
	   enterPharmacy();
	   pharmacyAddress();
	   enterEmail();
	   enterUname();
	   enterPassword();
	   enterSecurityQA();
	   clickSaveButton();
	   return hMap;
	   
   
   }

}
 
