package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.HomePageUI;


public class HomePageObject extends AbstractPage {
	WebDriver driver;
	public HomePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public boolean isHomepageDisplay(String message) {
		waitForControlVisible(driver, HomePageUI.WELCOME_MESSAGE,message);
		return isControlDisplay(driver, HomePageUI.WELCOME_MESSAGE,message);
		
	}

}
