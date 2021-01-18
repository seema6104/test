package stepDifinitions;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LaunchContentPlayerPage;
import pageObjects.LoginPage;
public class SamSteps extends BaseClass{
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		login= new LoginPage(driver);
		System.out.println("Sam Login Steps class");
	}

	@When("User Launch SAM URL {string}")
	public void user_launch_sam_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uName, String pwd) {
		login.enterUsername(uName);
		login.enterPassword(pwd);
	  }

    @When("Click on Login")
	public void click_on_login() throws Exception {
		login.clickOnLogin();
    	login.newSessionOKBTN();
    	login.enterKeyLaterButton();
    	Thread.sleep(2000);
      }
	
	@Then("Student user can see Dashboard")
	public void student_user_can_see_dashboard() {
		String actualTitle= driver.getTitle();
    	System.out.println("actualTitle after Login: " +actualTitle);
		Assert.assertEquals(actualTitle, "SAM - Login");
	    
	}
	
	//Reduce the number of retakes on Content Player 
	
	@Then("Student user Navigates to Activity List")
	public void student_user_navigates_to_activity_list() {
		cpPage= new LaunchContentPlayerPage(driver); 
		cpPage.clickOnActivityListTab();
		cpPage.selectCourseTab();
		
		
	}

	@Then("Student user clicks on SAM assignment and dialog box opens")
	public void student_user_clicks_on_sam_assignment_and_dialog_box_opens() {
		cpPage.selectSamExam();
		
	}

	@Then("Retake of the assignment should not get reduced")
	public void retake_of_the_assignment_should_not_get_reduced() {
		
		
	}

}
