package org.iit.mmp.patiengtmodule.tests;
import java.util.HashMap;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.ScheduleAppointmentPage;

import org.iit.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 public class ScheduleAppointmentTest extends TestBase {

	HelperClass helper;
	ScheduleAppointmentPage saPage;
	   
  @Parameters({"url","uname", "pword", "drName"})
  @Test(description="US_004 Validate Schedule appointment",groups={"sanity", "regression", "UI", "patientmodule","US_004"})
	public void validateScheduleAppointment(String url, String uname, String pword, String drName ) throws Exception
	  {
	saPage= new ScheduleAppointmentPage(driver);
	helper= new HelperClass(driver);
	helper.launchPatientModule(url);
	helper.patientLogin(uname, pword);
	helper.navigateToModule("Schedule Appointment");
	HashMap<String, String> hMap = saPage.bookAnAppointment(drName);
	helper.navigateToModule("Schedule Appointment");
	boolean result = saPage.validateAppointmentDetailsinSchedulePage(hMap);
	Assert.assertTrue(result);
	  }
  
//     @Test(description="US_004 Validate Schedule appointment",groups= {"regression", "API", "patientmodule","US_004"})
//	public void validateScheduleAppointment1(String url, String uname, String pword, String drName )
//	  {
//	  
//	  }
//  
//   @Test(description="US_004 Validate Schedule appointment",groups= {"sanity","UI","US_004"})
//	public void validateScheduleAppointment2(String url, String uname, String pword, String drName )
//	  {
//	  
//	  }
 }