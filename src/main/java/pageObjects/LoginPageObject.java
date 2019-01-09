package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.AbstractPage;
import pageUIs.LoginPageUI;



public class LoginPageObject extends AbstractPage{
	
	WebDriver driver;
	
	
	 public LoginPageObject(WebDriver mappingDriver) {
			
			driver = mappingDriver;
		}
	 public LoginPageObject(WebDriver mappingDrive, WebDriverWait wait) {
			
			driver = mappingDrive;
		}
	 public String getLoginPageUrl(WebDriver driver) {
			return driver.getCurrentUrl();
		}
	 public String getLoginPageUrl() {
			return getCurrentPageUrl(driver);
		}
		
		public void inputToUserIDTextbox(String userName) {
			waitForControlVisible(driver, LoginPageUI.USERID_TEXTBOX);
			sendKeyToElement(driver, LoginPageUI.USERID_TEXTBOX, userName);
		}
		
		public void inputToPasswordTextbox(String password) {
			waitForControlVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
			sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		}
		
		public HomePageObject clickToLoginButton() {
			waitForControlVisible(driver, LoginPageUI.LOGIN_BUTTON);
			clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
			//return new HomePageObject(driver);
			return PageFactoryManager.openHomepage(driver);
		}
		public RegisterPageObject clickHereLink() {
			waitForControlVisible(driver, LoginPageUI.HERE_LINK);
			clickToElement(driver, LoginPageUI.HERE_LINK);
			return PageFactoryManager.openRegisterPage(driver);
		}
}
