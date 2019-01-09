package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageFactoryManager;


public class HomepageStepDefinications {
	private WebDriver driver;
	static String loginPageUrl;
	private HomePageObject homePage;
	private AbstractTest abstractTest;
	public HomepageStepDefinications() {
		//Get Driver ID
		driver = Hooks.openBrowser();
		
		//Set Driver ID for Login page
		homePage = PageFactoryManager.openHomepage(driver);
		abstractTest = new AbstractTest();
	}
	@SuppressWarnings("deprecation")
	@Then("^Verify Home page displayed with message \"([^\"]*)\"$")
	public void verify_Homepage_displayed_with_message(String messageName) {
		abstractTest.verifyTrue(homePage.isHomepageDisplay(messageName));
		
	}

}
