package org.iit.mmp.patiengtmodule.tests;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.ViewHistoryPage;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewHistoryTest extends TestBase{
	
	HelperClass helper;
	ViewHistoryPage viewHP;
	
	@Test
	public void viewHistory() throws Exception
	
	{
		
		helper = new HelperClass(driver);
//		driver.findElement(By.linkText("Patient Login")).click();
//        driver.findElement(By.linkText("Login")).click();
//        Thread.sleep(3000);
//		helper.patientLogin("ria1", "Ria12345");
		helper.navigateToModule("Profile");
		Thread.sleep(5000);
		viewHP.search();
		
	}
	
	
	

}
