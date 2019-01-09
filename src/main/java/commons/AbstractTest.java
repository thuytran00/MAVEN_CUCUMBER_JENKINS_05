package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.jetty.log.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPageObject;

public class AbstractTest {
	WebDriver driver;
	protected final Log log;
	public AbstractTest() {
		log = LogFactory.getLog(getClass());
	}
	
	  public static int randomNumber()
	  {
		  Random rand =new Random();
		  int n= rand.nextInt(999999)+1;
		  return n;
	  }
	  private boolean checkPassed(boolean condition) {
		  boolean pass =true;
		  try {
			  if(condition == true)
				log.info("==PASS==");
			  else
				  log.info("==FAILED==");
			  Assert.assertTrue(condition);
			
		  }catch(Throwable e) {
			  pass=false;
			  Reporter.getCurrentTestResult().setThrowable(e);
		  }
		  return pass;
	  }
	  private boolean checkFailed(boolean condition) {
		  boolean pass = true;
		  try {
			  
			  Assert.assertTrue(condition);
			
		  }catch(Throwable e) {
			  pass=false;
			  Reporter.getCurrentTestResult().setThrowable(e);
		  }
		  return pass;
	  }
	  public boolean verifyTrue(boolean condition) {
		  return checkPassed(condition);
	  }
	  public static String randomEmail() {
			Random random = new Random();
			String randomEmail = random.nextInt(99999) + "@gmail.com";
			return randomEmail;
		}
}
