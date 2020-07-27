package org.iit.mmp.patientmlodule.pages;

import java.util.HashMap;

import org.iit.mmp.helper.HelperClass;
import org.iit.util.AppLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PayFeesPage {
	
	
	WebDriver driver;
	By feesBtn = By.xpath("//span[contains(text(),'Fees')]");
	By clickPayNow = By.xpath("//button[contains(text(),'Pay Now')]");
    By selectPayment = By.id("amount");
    By continuBtn = By.xpath("//input[@value='Continue']");
    By nameTB = By.id("name");
    By selectCardName= By.id("card_name");
    By cardNumber = By.id("cid");
    By selCardMonth = By.id("cardMonth");
    By selCardYear = By.id("cardYear");
    By card3DigitCode = By.id("cvv");
    By submitBtn = By.xpath("//input[@value='submit']");
    
    HashMap<String, String> hmap = new HashMap<String, String>();
    int nChars= 15;
    HelperClass helper;
    
    public PayFeesPage(WebDriver driver)
    {
    	this.driver = driver;
    	helper = new HelperClass(driver);
    }
    
    public void ClickonFeesBtn() throws InterruptedException
    {
    	Thread.sleep(5000);
    	driver.findElement(feesBtn).click();
    }
    public void selectPaynowTab() throws InterruptedException
    {
    	Thread.sleep(5000);
    	driver.findElement(clickPayNow).click();
    }
    
    public void selectAmount()
    {
    	Select selectAmount = new Select(driver.findElement(selectPayment));
    	selectAmount.selectByValue("1818");
    	
    }
    
    public void ClickonContiBtn()
    {
    	driver.findElement(continuBtn).click();
    }
    
    public void enterFLName()
    {
    	String nameValue = "First" +AppLibrary.getRandomChars(nChars);
    	driver.findElement(nameTB).sendKeys(nameValue);
    	hmap.put("Name", nameValue);
    }
    
    public void selectCard()
    {
    	Select selectCard = new Select(driver.findElement(selectCardName));
    	selectCard.selectByVisibleText("Visa");
    	
    }
    
    public void enterCardNumber()
    {
    	Long cardValue = AppLibrary.getRandomDigits(15);
    	driver.findElement(cardNumber).sendKeys(cardValue.toString());
    	hmap.put("CardNumber", cardValue.toString());
    }
    
    
    public void selectCardMon()
    {
    	Select selectMonth = new Select(driver.findElement(selCardMonth));
    	selectMonth.selectByVisibleText("February (02)");
    }
    
    public void selectCardYear()
    {
    	Select selectYear = new Select(driver.findElement(selCardYear));
    	selectYear.selectByVisibleText("2023");
    }
    
    public void enterCVVCode()
    {
    	Long cvvValue = AppLibrary.getRandomDigits(2);
    	driver.findElement(card3DigitCode).sendKeys(cvvValue.toString());
    	hmap.put("cvv", cvvValue.toString());
    }
    
    public void clickOnSubmitBtn() throws InterruptedException
    {
    	Thread.sleep(5000);
    	driver.findElement(submitBtn).click();
    }
    
    public HashMap<String, String> addingData() throws InterruptedException
    {
		
    	 ClickonFeesBtn();
    	 selectPaynowTab();
    	 selectAmount();
    	 ClickonContiBtn();
    	 enterFLName();
    	 selectCard();
    	 enterCardNumber();
    	 selectCardMon();
    	 selectCardYear();
    	 enterCVVCode();
    	 clickOnSubmitBtn();
    	return hmap;
    	
    }
    
    
    
  }
