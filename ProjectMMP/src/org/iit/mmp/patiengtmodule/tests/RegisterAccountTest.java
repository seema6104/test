package org.iit.mmp.patiengtmodule.tests;

import java.util.HashMap;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.RegisterAccountPage;
import org.iit.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 public class RegisterAccountTest extends TestBase{
	 
	 HelperClass helper;
	 
	 @Parameters({"url"})
	 @Test(description="US_002 Validation of the Registration Func")
	 public void registerAccount(String url) throws Exception {
		 
	helper= new HelperClass(driver);
    RegisterAccountPage regPage = new RegisterAccountPage(driver);
	helper.launchPatientModule(url);	  
    HashMap<String, String> hMap = regPage.fillData();
    String actual= regPage.readSuccessMsg();
    System.out.println("Actual message: " +actual);
    String expected = "Thank you for registering with MMP.";
    Assert.assertEquals(actual.trim(), expected);
		  
		  
		  
		  
		  
		  
		  
		  
//		  String alertMessage= driver.switchTo().alert().getText();
//		  System.out.println("Alert message is: "+ alertMessage);
		  
		  //Registration validation
		  
		  
		  
		  
	 }
//	 @Test(priority=5)
//	 public void regirAccoWithInvCredinal() throws Exception {
//		 
//		  RegisterAccountPage myRegObj = new RegisterAccountPage(driver);
//		  myRegObj.clickLogin();
//		  myRegObj.enterNameAndId(" ", "Batra", "388", "5676");
//		  myRegObj.enterAddress("CA", "New york", "1234", "23467");
//		  myRegObj.enterPAgeHeightAndWeight("5", "16.5", "17.8");
//		  myRegObj.pharmacyDetail("CVS", "1234 ");
//		  myRegObj.createLoginAndPwd("Kavita@1234.com", "Ka4", "Kavita4321", "Ka4");
//		  myRegObj.securityQA("", "Max");
//		  myRegObj.clkSaveBtn();
//		  Thread.sleep(8000);
//  
//  }
   }
