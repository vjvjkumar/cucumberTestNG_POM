package com.cucumber.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class TestBase {
	private WebDriver driver;
	
	public TestBase(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}	
}
