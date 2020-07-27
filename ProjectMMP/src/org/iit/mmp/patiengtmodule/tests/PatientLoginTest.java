package org.iit.mmp.patiengtmodule.tests;

import org.iit.mmp.helper.HelperClass;
import org.iit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class PatientLoginTest extends TestBase{
	
	HelperClass helper;
		
        @Test
       	public void loginPage() throws Exception  {
        helper = new HelperClass(driver);
       // helper.launchPatentModule(url1);
        Thread.sleep(5000);
        System.out.println("Loging in to my account");
        driver.findElement(By.linkText("Patient Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
        helper.patientLogin("ria1", "Ria12345");
      
        
       
          
//           
//           driver.findElement(By.xpath("//input[@name='submit']")).click();
//         	 //validating the login
           
           
//           String expectedTitle = driver.getCurrentUrl();
//           System.out.println("Current title of the page is: " +expectedTitle);
//           
//          String actualTitle ="http://96.84.175.78/MMP-Release1-Integrated-Build.2.4.000/portal/index.php";
//           if (expectedTitle.contains(actualTitle))
//           {
//          	 System.out.println("Test Passed!!");
//           }
//           else {
//          	 System.out.println("Test failed!!");
//           }
//         
        	  
        }
     	
     	
     	

   }
