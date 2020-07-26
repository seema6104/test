package org.iit.mmp.patiengtmodule.tests;
import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.EditProfilePage;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTest extends TestBase{
	
	  HelperClass helper;
	  EditProfilePage myPP;
	  @Test(priority=1)
	  public void editPatientDetail() throws Exception {
		helper = new HelperClass(driver);
	    myPP = new EditProfilePage(driver);
		System.out.println("Logging in to my account");
        driver.findElement(By.linkText("Patient Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
		helper.patientLogin("ria1", "Ria12345");
		myPP.fillData();
		System.out.println("Clicking on confirmation Alert!!");
		Thread.sleep(5000);
		String actualMS= myPP.readSuccessMsg();
		System.out.println("Actual Message :" + actualMS);
		String expected = "Your Profile has been updated.";
		 Assert.assertEquals(actualMS, expected);
		
		 if (actualMS.contains(expected)) {
			 System.out.println("Test successfully passed!!");
		 }
		 else {
			 System.out.println("Test failed!!");
		 }
	  }

   }
