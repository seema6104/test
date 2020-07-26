package org.iit.mmp.patientmlodule.pages;

import org.iit.mmp.helper.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewReportsPage {
	
	WebDriver driver;
	
	By ClickViewReports = By.xpath("//button[contains(text(),'View Reports')]");
	By viewRep   =       By.xpath("//td//a//h4[contains(text(),'x-ray')]");
	HelperClass helper;
	
	public ViewReportsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickViewRep()
	{
	
	driver.findElement(ClickViewReports).click();
	}
	
	public void viewReport()
	{
		driver.findElement(viewRep).click();
	}

	
	public void addData()
	{
		clickViewRep();
		viewReport();
	}
}
