package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;

public class LoginSteps {
	WebDriver driver;
	
	@Given("^I open application$")
	public void iopen_application() throws Throwable {
	  driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/V1/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I input to Username \"(.*?)\"$")
	public void i_input_to_Username(String userName) throws Throwable {
	  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userName);
	}

	@When("^I input to Password \"(.*?)\"$")
	public void i_input_to_Password(String password) throws Throwable {
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
   
	}

	@When("^I click to Login button$")
	public void i_click_to_Login_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

	@When("^I input with all data to New Customer$")
	public void i_input_with_all_data_to_New_Customer(DataTable table)  {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  
	}
	@SuppressWarnings("deprecation")
	@Then("^Verify Home page displayed with message \"([^\"]*)\"$")
	public void verify_Homepage_displayed(String messageName) {
		 Assert.assertTrue(driver.findElement(By.xpath("//marquee[text()=\""+messageName+"\"]")).isDisplayed());
		
	}
	@Then("^I close browser$")
	public void i_close_browser()  {
		driver.quit();

	}
}
