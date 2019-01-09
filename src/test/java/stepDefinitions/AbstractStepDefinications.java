package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.AbstractPageObject;
import pageObjects.HomePageObject;
import pageObjects.PageFactoryManager;

public class AbstractStepDefinications {

		private WebDriver driver;
		private AbstractPageObject abstractPage;
		private AbstractTest abstractTest;
		public AbstractStepDefinications() {
			driver = Hooks.openBrowser();
			abstractPage = PageFactoryManager.openAbstractPage(driver);
		}
		
		@When("^I input to \"([^\"]*)\" textbox with data \"([^\"]*)\"$")
		public void iInputToDynamicTextboxWithDynamicData(String textboxID, String value)
		{
			abstractPage.inputToDynamicTextbox(textboxID, value);
			
		}
		@When("^I input to \"([^\"]*)\" textbox with random data \"([^\"]*)\"$")
		public void iInputToDynamicTextboxWithDynamicRandomData(String textboxID, String value)
		{
			value = value + " " + abstractTest.randomNumber();
			abstractPage.inputToDynamicTextbox(textboxID, value);
			
		}
		@When("^I input to \"([^\"]*)\" textbox with \"([^\"]*)\" data \"([^\"]*)\"$")
		public void iInputToDynamicTextboxWithRandomData(String textboxID,String statusRandom, String value)
		{
			if(statusRandom.equals("1")) {
			value = value + " " + abstractTest.randomNumber();
			}else if(statusRandom.equals("2")) {
				System.out.println(abstractTest.randomEmail());
				value = value + abstractTest.randomEmail();
				
				
			}
			abstractPage.inputToDynamicTextbox(textboxID, value);
			
		}
		
		@When("^I input to \"([^\"]*)\" textarea with data \"([^\"]*)\"$")
		public void iInputToDynamicTextAreaWithDynamicData(String textareaID, String value)
		{
			abstractPage.inputToDynamicTextArea(textareaID, value);
			
		}
		
		@When("^I select item in \"([^\"]*)\" dropdown with data \"([^\"]*)\"$")
		public void iSelectToDynamicDropdownWishlistWithDynamicData(String dropdownID, String value)
		{
			abstractPage.selectDynamicDropdownList(dropdownID, value);
			
		}
		@When("^I select \"([^\"]*)\" radio button$")
		public void iSelectToDynamicRadioButtonWithDynamicData(String radioButtonID)
		{
			abstractPage.clickToDynamicRadioButton(radioButtonID);
			
		}
		@When("^Verify message \"([^\"]*)\" displayed success$")
		public void verifyDynamicMesssageDisplay(String message)
		{
			abstractTest.verifyTrue(abstractPage.isDynamicMessageDisplayed(message));
			
			
		}
		
		@Given("^I open \"([^\"]*)\" page$")
		public void iOpenDynamicPage(String pageName)
		{
			abstractPage.clickToDynamicPageLink(pageName);
			
		}
		@When("^I click to \"([^\"]*)\" button$")
		public void iClickToDynamicButton(String buttonID)
		{
			abstractPage.clickToDynamicButton(buttonID);
			
		}
		
		@When("^I sleep with \"([^\"]*)\" times$")
		public void iSleepDynamicTimes(String times)
		{
			abstractPage.sleepWithDynamicTimes(times);
			
		}
}
