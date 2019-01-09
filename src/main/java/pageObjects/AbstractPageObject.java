package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.AbstractPageUI;

public class AbstractPageObject extends AbstractPage{

	WebDriver driver;
	public AbstractPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	
	public void inputToDynamicTextbox(String textboxID,String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTBOX,textboxID);
		sendKeyToElement(driver, AbstractPageUI.DYNAMIC_TEXTBOX,textboxID, value);
	}
	
	public void inputToDynamicTextArea(String textareaID,String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTAREA,textareaID);
		sendKeyToElement(driver, AbstractPageUI.DYNAMIC_TEXTAREA,textareaID, value);
	}
	
	public void selectDynamicDropdownList(String dropdownID, String item) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_DROPDOWNLIST,dropdownID);
		selectItemInCustomDropDown(driver, AbstractPageUI.DYNAMIC_DROPDOWNLIST,item,dropdownID);
	}
	public void clickToDynamicRadioButton(String radioButtonID) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_RADIO_BUTTON,radioButtonID);
		clickToElement(driver, AbstractPageUI.DYNAMIC_RADIO_BUTTON, radioButtonID);
}
	public void clickToDynamicButton(String buttonID) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_BUTTON,buttonID);
		clickToElement(driver, AbstractPageUI.DYNAMIC_BUTTON, buttonID);
	}
	public boolean isDynamicMessageDisplayed(String message) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MESSAGE,message);
		return isControlDisplay(driver, AbstractPageUI.DYNAMIC_MESSAGE,message);
	}
	public void clickToDynamicPageLink(String pageName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGE_LINK,pageName);
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGE_LINK,pageName);
		
	}
	public void sleepWithDynamicTimes(String timeMinute) {
		long tine = Long.parseLong(timeMinute);
		try {
			Thread.sleep(tine *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
