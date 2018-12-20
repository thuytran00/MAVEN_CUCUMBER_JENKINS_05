package live.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;


public class RegisterPageObject extends AbstractPage{
	
	WebDriver driver;
	public RegisterPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public MyDashbboardPageObject clickToRegisterButton() {
		waitForControlVisible(driver, live.pageUIs.RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, live.pageUIs.RegisterPageUI.REGISTER_BUTTON);
		return PageFactoryManager.getMyDashboardPage(driver);
	}
	
}
