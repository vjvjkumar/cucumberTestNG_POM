package com.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.cucumber.framework.ParentPage;
public class CreatePaymentPage extends ParentPage{
	protected WebDriver driver;
	public CreatePaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='criteria_dets']/table/tbody/tr[2]/td[3]")
	public WebElement yourmobile; 
	@FindBy(how=How.XPATH, using="//*[@id='accountNo']")
	public WebElement acnumber;
	@FindBy(how=How.XPATH, using="//*[@id='bankAmount']")
	public WebElement amount;
	@FindBy(how=How.XPATH, using="//*[@id='beneficiaryMobileBank']")
	public WebElement benfmobile;
	@FindBy(how=How.XPATH, using="//*[@id='ifscCode']")
	public WebElement ifsccode;
	
	@FindBy(how=How.XPATH, using="//*[@id='dmtBtn']")
	public WebElement continuepayment;
	
	public void fwait(){
		Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS)
	    .pollingEvery(2, TimeUnit.SECONDS)
	    .ignoring(NoSuchElementException.class);
	}
	
	public CreditCardDetailsPage BankTab(String ymob, String acnum, String amou, String benfmob, String ifsc){
		yourmobile.sendKeys(ymob);
		acnumber.sendKeys(acnum);
		amount.sendKeys(amou);
		benfmobile.sendKeys(benfmob);
		ifsccode.sendKeys(ifsc);
		continuepayment.click();
		fwait();
		return new CreditCardDetailsPage(driver);		
	}
	
	
}
