
package org.iit.mmp.patiengtmodule.tests;

import java.util.HashMap;

import org.iit.mmp.helper.HelperClass;
import org.iit.mmp.patientmlodule.pages.PayFeesPage;
import org.iit.util.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PayFeesTest extends TestBase{
	
	HelperClass helper;
	
	@Parameters({"url", "uName", "pwd"})
	@Test(description="US_006 Paying fees Module", groups= {"Sanity", "UI", "regression"})
	public void payFeesTest(String url, String uName, String pwd) throws InterruptedException
	{
		helper = new HelperClass(driver);
		PayFeesPage pfPage = new PayFeesPage(driver);
		helper.launchModule(url);
		helper.patientLogin(uName, pwd);
		HashMap<String, String> hmap = pfPage.addingData();
		
		
	}

	
	
	

	


}
