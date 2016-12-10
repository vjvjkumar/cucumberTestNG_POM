package com.cucumber.testcases;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.ParentScenario;
import com.cucumber.pages.CreatePaymentPage;
import com.cucumber.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
Createpaymentpage
ModifyPaymentPage
OriginativePayer
IntermidiareeBank
ExistingPayment
 *
 */

public class StepDefinitions extends ParentScenario{
	
	HomePage homePage=null;
	CreatePaymentPage createPaymentPage=null;
	
	@Given("^I navigate to UAE Exchange Landing page$")
	public void i_navigate_to_UAE_Exchange_Landing_page() throws Throwable {
	    System.out.println("I navigate to UAE Exchange Landing page");
	    openbrowser();
	    navigate("http://www.uaeexchangeindia.com/");
	}

	@When("^I clicked on Pay Money and selected paymoney$")
	public void i_clicked_on_Pay_Money_and_selected_paymoney() throws Throwable {
	    System.out.println("I clicked on Pay Money and selected paymoney");	   
	    //HomePage hp=PageFactory.initElements(driver, HomePage.class);
	    homePage=new HomePage(driver);
	    homePage.Gotocreatepayment();
	   
	}

	@Then("^I create a payment$")
	public void i_create_a_payment() throws Throwable{
	   System.out.println("I create a payment");
	   //checktitle("Foreign Exchange / Currency Exchange / Money Exchange / Send Money Abroad");
	}
	
	@Then("^I check all the details are validated$")
	public void i_check_all_the_details_are_validated(DataTable table) throws Throwable {
	   System.out.println("I check all the details are validated");
	   List<List<String>> data=table.raw();
	   for(int j=1;j<=3;j++){
		   for(int i=0;i<=4;i++){
			   System.out.print(data.get(j).get(i)+"===");
		   }
		   System.out.println();
	   }
	}	

}
