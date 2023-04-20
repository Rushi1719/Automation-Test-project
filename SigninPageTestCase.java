package StepDefination;

import org.openqa.selenium.WebDriver;


import ObjectRepository.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPageTestCase {
	
	
	WebDriver driver;
	
	SigninPage obj = new SigninPage();
	

	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
	    obj.launchApplication();
	}

	

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		obj.enterUserName("rushikeshkulkarni06@gmail.com");
	    obj.enterPassword("Rushi@123");
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		obj.clickButton();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	    obj.closeBrowser();
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		obj.enterUserName("rushikeshkulkarni06@gmail.com");
	    obj.enterPassword("Rushi@1234");
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	   
		
	}
	
}
