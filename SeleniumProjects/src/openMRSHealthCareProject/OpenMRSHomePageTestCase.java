package openMRSHealthCareProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenMRSHomePageTestCase {
	
	       public WebDriver driver;
    	
	       @BeforeTest
    		public void LaunchBrowser() throws Exception {
    			
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\seema\\OneDrive\\Desktop\\Selenium\\software\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	// System.setProperty("webdriver.gecko.driver", "C:\\Users\\seema\\OneDrive\\Desktop\\Selenium\\software\\driver\\geckodriver.exe");	
	    //  driver = new FirefoxDriver();
    	        driver.manage().window().maximize();
    			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		    driver.get("https://demo.openmrs.org/openmrs/login.htm");
	       }
	       
	       
	      @Test(priority=1)
	        public void regisPaitent() throws Exception {
	    	  System.out.println("I am in Register paitent");
	        	RegisterPatient newRegis = new RegisterPatient(driver);
	        	newRegis.getUname("Admin");
	        	newRegis.getPwd("Admin123");
	        	newRegis.getclkILWard();
	        	newRegis.clkLoginBtn();
	        	newRegis.registPatient();
	        	
	        	//validation 
	        	
	        	
	        	if(driver.getPageSource().contains("What's the patient's name?")) {
	        		System.out.println("Test passed");
	        	  }
	        	
	        	else {
	        		System.out.println("Test Failed");
	        	    }
	        	
	        	newRegis.GivenName("Arun");
	        	newRegis.familyName("Davis");
	        	newRegis.patientGend();
	        	newRegis.clkOnGender("Male");
	            newRegis.setDOB("12","4");
	            Thread.sleep(10000);
	            newRegis.setAddress("2345 vesen drive", "Majori","CA","USA", "23423");
	            newRegis.setPhone("14523451234");
	        	newRegis.selFamMember("Parent");
	        	newRegis.conFirmSubmit();
	           }
	        
	        
    		//@Test(priority=5)
    		 public void findPaitentRecord() throws Exception {
    			System.out.println("I am in find patient Record");
    			 
    		    OpenMrsHomePage myHP = new OpenMrsHomePage(driver);
    		    myHP.getUname("Admin");
    		    myHP.getPwd("Admin123");
    		    myHP.getclkILWard();
    		    myHP.clkLoginBtn();
    		    Thread.sleep(4000);
    		    myHP.getfindPRecord();
    		    myHP.getpatientSearch();
    		    
	

    		     //Validation 
    		    
    		   String actualUrl ="https://demo.openmrs.org/openmrs/referenceapplication/home.page";
    		   String expectURL = driver.getCurrentUrl();
    		   
    		   System.out.println("The Expected URL is ::" +expectURL);
    		 
//    		   try {    
//    			   Assert.assertEquals(actualUrl, expectURL);
//    		   }
    		  if (actualUrl.contains("https://demo.openmrs.org/openmrs/referenceapplication/home.page") )  {
    			  System.out.println("You are succefully login");
    		  }
    		  else {
    			  System.out.println("Login Failed!!!");
    		  }
    		    
    		    
    		  //Verification for patient search
    		  
    		  String currTitle = driver.getTitle();
    		  System.out.println("Current title of the page is: "+currTitle);
    		  String actualtitle ="OpenMRS Electronic Medical Record";
    		
    		  System.out.println("Actual title of the page: " +actualtitle);
    		  
//    		  if (actualtitle ==currTitle   ) {
//    			  System.out.println("Test Pass");
//    		  } else {
//    			  System.out.println("Test failed");
//    		  }
    		  
    		  //Verification different way
    		  
    		  if (driver.getTitle().contains("OpenMRS Electronic Medical Record")) {
    			  System.out.println("Test Pass");
    		  } else {
    			  System.out.println("Test failed");
    		  }  
    		  }
	      
	     
    	   // @AfterTest
    		public void closeBrowser() {
	    	   driver.quit();
	    	   
	    	   
	    	   
	    	   
	       }
	       
	       
    		  
      }

	       
 
