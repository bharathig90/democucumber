 package org.stepdef;

import org.baseclass.Baseclass;
import org.fb_pom.Fb_Login_Pom;
import org.fb_runner.Fb_Login_runner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class Fb_Login_StepDef extends Baseclass {
	
	
	WebDriver driver=Fb_Login_runner.driver;
	
	Fb_Login_Pom fb=new Fb_Login_Pom(driver);
	
	
	@Given("user launch the url and maximizing")
	public void user_launch_the_url_and_maximizing() {
	    
		url(driver, "https:www.facebook.com/");
		maximize(driver);
		
	}

	@When("I enter the valid {string}")
	public void i_enter_the_valid(String username) {
	    
	tosendvalues(fb.getEmail(), username);
	}

	@When("I enter the {string}")
	public void i_enter_the(String password) {
	    
		tosendvalues(fb.getPassword(), password);
		
	}

	@Then("I click the login button")
	public void i_click_the_login_button() {
		
		toclick(fb.getLogin());
	    
	}


}
