package openMRSHealthCareProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.ui.Select;

 
    public class RegisterPatient {
	
  
	  WebDriver driver;
	  
	    By paitentUName = By.id("username");
		By paitentpwd = By.id("password");
		By clkIsoiLationWard = By.id("Isolation Ward");
		By loginBtn = By.id("loginButton");
		By registerPatient = By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension");
	    By patientName =By.name("givenName");
		By familyName =By.name("familyName");
		By patientGender =By.id("genderLabel");
		By clkPatientGendMale= By.xpath("//select[@id='gender-field']/option[1]");
		By clkPatientGendFemale= By.xpath("//select[@id='gender-field']/option[2]");
		By dob  =By.id("birthdateLabel");
		By dobDay =By.id("birthdateDay-field");
		By selMonth =By.id("birthdateMonth-field");
		By selYear = By.id("birthdateYear-field");
		By address =By.xpath("//span//font//font[contains(text(),'Address')]");
		By StreetAdd1 = By.id("address1");
		By city = By.id("cityVillage");
		By state =By.id("stateProvince");
		By country= By.id("country");
		By zCode =By.id("fr2798");
		By clkPhNum= By.xpath("//span//font//font[contains(text(),'Phone number')]");
		By enterPhone= By.id("fr5335-field");
		By familyMember =By.xpath("//span//font//font[contains(text(),'Family members')]");
		By relationType =By.id("relationship_type");
		By clkConfirm = By.id("confirmation_label");
		By submit =By.id("submit");
		
		RegisterPatient(WebDriver dr)
	     {
	    	
	    	driver = dr;
    	 }
	    
		public void getUname(String uname) 
		 {
			 driver.findElement(paitentUName).sendKeys(uname);
			
		 }
		 public void getPwd(String pwd)
		 
		 {
			 driver.findElement(paitentpwd).sendKeys(pwd);
		 }
		
		 public void getclkILWard()
		 {
			 driver.findElement(clkIsoiLationWard).click();
		 }
		
		public void clkLoginBtn()
		{
			driver.findElement(loginBtn).click();
		}
		
		public void registPatient()
		{
			driver.findElement(registerPatient).click();
		}
	
	    public void GivenName(String  gName)
	    {
		driver.findElement(patientName).sendKeys(gName);
	    }
	
	    public void familyName(String fName)
	    {
		  driver.findElement(familyName).sendKeys(fName);
	    }
 
	    public void patientGend() 
	    {
		  driver.findElement(patientGender).click();
	    }
	  
	    public void clkOnGender(String genderSel)
	     {
		  
//		 Select pGender= (Select) driver.findElement(clkPatientGend);
//		 pGender.selectByValue(gender);
		  driver.findElement(clkPatientGendMale).click();
		  
//		  WebElement male= driver.findElement(clkPatientGendMale);
//		  WebElement female= driver.findElement(clkPatientGendFemale);
	   	  
	     }
	  
	  
	    public void setDOB (String daySelect, String m)
	    {
		  driver.findElement(dob).click();
		  driver.findElement(dobDay).sendKeys(daySelect);
		  
		  Select month=new Select (driver.findElement(selMonth));
		  month.selectByValue(m);
		  
		  driver.findElement(selYear).sendKeys("1967");
			 
	     }
	  
	  
	   public void setAddress(String add1, String ct, String st, String count, String zip) 
	   {
		  
		  driver.findElement(address).click();
		  driver.findElement(StreetAdd1).sendKeys(add1);
		  driver.findElement(city).sendKeys(ct);
		  driver.findElement(state).sendKeys(st);
		  driver.findElement(country).sendKeys(count);
		  driver.findElement(zCode).sendKeys(zip);
		
	    }
	  
	    public void setPhone(String ph)
	     {
		  
		  driver.findElement(clkPhNum).click();
		  driver.findElement(enterPhone).sendKeys(ph);
	     }
	    
	    public void selFamMember(String fm)
	     {
		  driver.findElement(familyMember).click();
		  driver.findElement(relationType).click();
		  
		  Select famMem=new Select (driver.findElement(relationType));
		  famMem.selectByValue(fm);
		  
		 }
	  
	  public void conFirmSubmit() 
	   {
		  driver.findElement(clkConfirm).click();
		  driver.findElement(submit).click();
	   }
	  
	  
}
