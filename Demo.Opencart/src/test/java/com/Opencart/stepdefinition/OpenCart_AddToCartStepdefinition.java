package com.Opencart.stepdefinition;

import com.Opencart.pages.Opencart_AddToCartPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenCart_AddToCartStepdefinition {
	Opencart_AddToCartPage ac=new Opencart_AddToCartPage();
	
	@Given("^launching the browser$")
	public void launching_the_browser() throws Throwable 
	{
		ac.launch_browser("chrome");
	    
	}

	@When("^the user opens the opencart page$")
	public void the_user_opens_the_opencart_page() throws Throwable 
	{
		ac.opencart_website();
	    
	}

	@Then("^the user select the product and add to cart$")
	public void the_user_select_the_product_and_add_to_cart() throws Throwable 
	{
		ac.add_to_cart();
	   
	}

	@Then("^the user close the website$")
	public void the_user_close_the_website() throws Throwable 
	{
		ac.close_website();
		
	}
	   
}
