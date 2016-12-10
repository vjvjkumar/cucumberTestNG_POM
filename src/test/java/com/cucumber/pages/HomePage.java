package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.ParentPage;

public class HomePage extends ParentPage{
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath="//*[@id='content1']/div[1]/div[1]/div[1]/div/div[1]/a")
	public WebElement paymoneyicon;
	
	public CreatePaymentPage Gotocreatepayment(){
		paymoneyicon.click();		
		return new CreatePaymentPage(driver);
	}

}
