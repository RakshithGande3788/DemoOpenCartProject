package com.Opencart.stepdefinition;

import com.Opencart.pages.Opencart_ValidSearchPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opencart_ValidSearchStepdefination {
	 Opencart_ValidSearchPage sp= new Opencart_ValidSearchPage();
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable 
	{
	  sp.url();
	}

	@When("^the user opens the opencart search page$")
	public void the_user_opens_the_opencart_search_page() throws Throwable 
	{
		sp.search_page();
	  
	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable 
	{
		sp.search_product();
	}

	@Then("^the user close the search page$")
	public void the_user_close_the_search_page() throws Throwable 
	{
		sp.close_search();
	}

}
