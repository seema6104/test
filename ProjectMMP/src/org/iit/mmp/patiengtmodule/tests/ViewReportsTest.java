package org.iit.mmp.patiengtmodule.tests;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.ViewReportsPage;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewReportsTest extends TestBase{
	
	HelperClass helper;
	
	@Test(priority=1)
	public void viewReport() throws Exception {
		helper= new HelperClass(driver);
		System.out.println("Loging in to my account");
        driver.findElement(By.linkText("Patient Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
		helper.patientLogin("ria1", "Ria12345");
		helper.navigateToModule(" Profile ");
		Thread.sleep(2000);
		ViewReportsPage vrPage = new ViewReportsPage(driver);
		vrPage.addData();
		Thread.sleep(5000);
		String expect = "Providers"; 
		String actualtext = driver.getTitle();
		System.out.println("Actual title of the page is: "+actualtext);
		
		if(actualtext.contains(expect)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
	}
	
	
	
	
	

}
