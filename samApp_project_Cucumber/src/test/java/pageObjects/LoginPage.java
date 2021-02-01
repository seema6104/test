package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;
public class LoginPage {
	public WebDriver driver;
	WaitHelper waithelp;
	public LoginPage(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(driver, this);
		waithelp= new WaitHelper(driver);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	@FindBy(id="username")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(xpath="//button[@class='login-button']")
	@CacheLookup
	WebElement clickLogin;
	
	
	@FindBy(xpath="//div[@class='banner']//h1[contains(text(),'SAM indicates that you are currently logged in.')]")
	@CacheLookup
	WebElement newSessionText;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	@CacheLookup
	WebElement newSessionOK;
	
	@FindBy(xpath="//button[contains(text(),'Enter later')]")
	@CacheLookup
	WebElement enterKeyCodeLater;
	
	@FindBy(xpath="//span[@class='css-h7o02a']")
	@CacheLookup
	WebElement clickStuProfile;
	
	@FindBy(id="cu-sidebar-sign-out-button")
	@CacheLookup
	WebElement signOut;
	public void enterUsername(String uName)
	{   waithelp.waitForElement(userName, 30);
		userName.clear();
		userName.sendKeys(uName);
	}
	public void enterPassword(String password)
	{   
		waithelp.waitForElement(pwd, 30);
		pwd.clear();
		pwd.sendKeys(password);
	}
	public void clickOnLogin()
	{
		clickLogin.click();
	}
	
	public void newSessionOKBTN() throws Exception
	{
		Thread.sleep(2000);
		if (newSessionText.isDisplayed()) {
			System.out.println("Session Ok button ");
			newSessionOK.click();
		 }
		}
	
	public void enterKeyLaterButton()
	{
	 enterKeyCodeLater.click();
	}
	
	public void clickOnStuProfile() throws Exception
	{
		clickStuProfile.click();
		Thread.sleep(5000);
	}
	public void signOutButton()
	{
		signOut.click();
	}
	

}
