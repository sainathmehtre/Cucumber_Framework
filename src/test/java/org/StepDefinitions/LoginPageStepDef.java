package org.StepDefinitions;

import org.utilities.BaseUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	
	@Given("User is no login page")
	public void user_is_no_login_page() {
	
	 BaseUtility bu = new BaseUtility();
	 bu.WebDriver();
	 
	}
	@When("User gets title of the page")
	public void user_gets_title_of_the_page() {
	 
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	  
	}
}
