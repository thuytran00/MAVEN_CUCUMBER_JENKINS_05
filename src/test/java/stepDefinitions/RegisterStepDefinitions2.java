package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.LoginPageObject;
import pageObjects.PageFactoryManager;
import pageObjects.RegisterPageObject;

public class RegisterStepDefinitions2 {
	WebDriver driver;
	static String userID, password;
	private RegisterPageObject registerPage;
	private AbstractTest abstractTest;
	
	public RegisterStepDefinitions2() {
		//Get Driver ID
		driver = Hooks.openBrowser();
		
		//Set Driver ID for Login page
		registerPage = PageFactoryManager.openRegisterPage(driver);
		abstractTest = new AbstractTest();
		
	}
	@When("^I input to email textbox with data \"(.*?)\"$")
	public void iInputToEmailTextboxWithData(String email) {
		registerPage.inputToEmailTextbox(email +abstractTest.randomNumber()+"@gmail.com");
	}
	
	@When("^I click to Submit button at Register page$")
	public void iClickToSubmitButtonAtRegiaterPage() {
		registerPage.clickSubmitButton();
	}
	
	@Then("^I get UserID infor$")
	public void iGetUserIDInfor() {
		userID = registerPage.getUserID();
		System.out.println(userID);
	}

	@Then("^I get Password infor$")
	public void iGetPasswordInfor() {
		password = registerPage.getPassword();
		System.out.println(password);
	}
	
	@When("^I open Login page again$")
	public void iOpenLoginPageAgain() {
		registerPage.openAnyUrl(driver,LoginStepDefinitions.loginPageUrl);
	}
	
	
}
