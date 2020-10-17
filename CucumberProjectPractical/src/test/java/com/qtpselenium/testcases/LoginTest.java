package com.qtpselenium.testcases;

import io.cucumber.java.en.*;

public class LoginTest {

	@Given("^User opens the URL$")
	public void user_opens_the_URL() {
	    System.out.println("User is entering username");
	}
	
	@And("^User enter username$")
	public void user_enter_username() {
	    System.out.println("User is entering username");
	}
	
	@And("^User Enter Password$")
	public void user_enter_password() {
		System.out.println("User is entering password");
	}
	
	@And("^User Clicks on submit$")
	public void user_clicks_on_submit() {
		System.out.println("User clicks on submit");
	}
	
	@Then("^User is logged into application$")
	public void user_is_logged_into_application() {
		System.out.println("User is logged into application");
	}
	
	@And("^check for the title$")
	public void check_for_the_title() {
		System.out.println("validating for title");
	}


}
