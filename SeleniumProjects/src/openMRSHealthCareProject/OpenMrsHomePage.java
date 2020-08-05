package openMRSHealthCareProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class OpenMrsHomePage {
	
	WebDriver driver;
	
	By paitentUName = By.id("username");
	By paitentpwd = By.id("password");
	By clkIsoiLationWard = By.id("Isolation Ward");
	By loginBtn = By.id("loginButton");
	By findPRecord = By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
	By patientSearch = By.xpath("//td[contains(text(),'Anthony Desilva')]");
	
	
	
	OpenMrsHomePage(WebDriver d)
	{
		driver = d;
	}
	 public void getUname(String uname) {
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
	
	public void getfindPRecord()
	 {
		driver.findElement(findPRecord).click();
		
	}
	
	 public void getpatientSearch()
	 {
		 driver.findElement(patientSearch).click();
		 
	 }

	 
		 

	

}
