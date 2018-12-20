package live.pageObjects;

import org.openqa.selenium.WebDriver;

//Quan ly tap trung nhung phan khoi tao cua page object
public class PageFactoryManager {
	private WebDriver driver;
	
	
	public static MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);
	}
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static MyDashbboardPageObject getMyDashboardPage(WebDriver driver) {
		return new MyDashbboardPageObject(driver);
	}
	public static MobilePageObject getMobilePage(WebDriver driver) {
		return new MobilePageObject(driver);
	}
	public static TVPageObject getTVPage(WebDriver driver) {
		return new TVPageObject(driver);
	}

	public static WithdrawPageObject openWithdrawPage(WebDriver driver) {
		return new WithdrawPageObject(driver);
	}
	public static HomePageObject openHomepage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static NewCustomerPageObject openNewCustomerPage(WebDriver driver) {
		return new NewCustomerPageObject(driver);
	}
	public static EditCustomerPageObject openEditCustomerPage(WebDriver driver) {
		return new EditCustomerPageObject(driver);
	}
	public static DeleteAccountPageObject openDeleteAccountPage(WebDriver driver) {
		return new DeleteAccountPageObject(driver);
	}
}
