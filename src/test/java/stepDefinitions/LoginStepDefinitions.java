package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.LoginPageObject;
import pageObjects.PageFactoryManager;

public class LoginStepDefinitions {

	WebDriver driver;
	static String loginPageUrl;
	private LoginPageObject loginPage;
	private AbstractTest abstractTest;
	public LoginStepDefinitions() {
		//Get Driver ID
		driver = Hooks.openBrowser();
		
		//Set Driver ID for Login page
		loginPage = PageFactoryManager.openLoginPage(driver);
		abstractTest = new AbstractTest();
	}
	
	@When("^I get Login page Url$")
	public void iGetLoginPageUrl() {
		loginPageUrl = loginPage.getLoginPageUrl();
		
	}
	
	@When("^I click to here link$")
	public void iClickToHereLink() {
		loginPage.clickHereLink();
	}
	
	@When("^I input to Username textbox$")
	public void i_input_to_UserID_textbox() {
		
		loginPage.inputToUserIDTextbox(RegisterStepDefinitions2.userID);
		
	}
	
	@When("^I input to Password textbox$")
	public void i_input_to_Password_textbox() {
		loginPage.inputToPasswordTextbox(RegisterStepDefinitions2.password);
	}
	@When("^I click to Login button at Login page$")
	public void i_click_to_Login_button_at_Login_page() {
		loginPage.clickToLoginButton();
	}
}
