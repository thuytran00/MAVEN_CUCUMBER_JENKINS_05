package live.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.AbstractPage;


public class LoginPageObject extends AbstractPage{
	
	WebDriver driver;
	
	
	 public LoginPageObject(WebDriver mappingDriver) {
			
			driver = mappingDriver;
		}
	 public LoginPageObject(WebDriver mappingDrive, WebDriverWait wait) {
			
			driver = mappingDrive;
		}
}
