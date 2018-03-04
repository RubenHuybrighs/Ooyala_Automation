package steps;

import org.openqa.selenium.By;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	private LoginPage log;
	private Base basePage;

	@Given("^I am on the internet website$")
	public void i_am_on_the_internet_website() throws Throwable {
		basePage = new Base();
		log = new LoginPage();
		log.verifyTitle(log.getLoginTitle());
		log.verifyLoginDescription();
	}
	
	@When("^I enter a valid username$")
	public void i_enter_a_valid_username() throws Throwable {
		log.enterUsername();
	}

	@When("^I enter a valid password$")
	public void i_enter_a_valid_password() throws Throwable {
		log.enterPassword();
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
	    log.clickLoginButton();
	}

	@Then("^I check I am in the secure area$")
	public void i_check_I_am_in_the_secure_area() throws Throwable {
		log.verifyConfirmationText();
	}
	
	@Then("^I should be able to log out$")
	public void i_should_be_able_to_log_out() throws Throwable {
	    log.logOut();
	    log.verifyTitle(log.getLoginTitle());
		log.verifyLoginDescription();
	}

	@After public void cleanUp(){
		log.getDriver().close();
	} 
}
