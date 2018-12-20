package live.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import live.pageUIs.LiveMyDashBoardUI;


public class TVPageObject extends AbstractPage{
	
	WebDriver driver;
	public TVPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	
}
