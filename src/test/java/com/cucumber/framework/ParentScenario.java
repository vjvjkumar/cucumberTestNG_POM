package com.cucumber.framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.pages.CreatePaymentPage;
public class ParentScenario{
	protected WebDriver driver;	
	
	protected void openbrowser(){
		driver=new FirefoxDriver();
	}
	
	protected void closebrowser(){
		driver.quit();
	}
	
	protected void navigate(String url){
		driver.get(url);
	}
	
	protected CreatePaymentPage checktitle(String expectedresult){
		String actualresult=driver.getTitle();
		MatcherAssert.assertThat(actualresult,(equals(expectedresult)));
		System.out.println("Assertion passed");
		return new CreatePaymentPage(driver);
	}
	
	public Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
	    public int compare(Map<String, String> m1, Map<String, String> m2) {
	        return m1.get("name").compareTo(m2.get("name"));
	    }
	};

	//Collections.sort(list, mapComparator);
}
