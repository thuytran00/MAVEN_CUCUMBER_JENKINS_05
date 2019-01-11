package commons;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

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
				if (condition == true)
					log.info("===PASSED===");
				else
					log.info("===FAILED===");
				Assert.assertFalse(condition);
			} catch (Throwable e) {
				pass = false;
				log.info(e);
				VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
				Reporter.getCurrentTestResult().setThrowable(e);
			}
			return pass;
		}
	  
		public boolean verifyFalse(boolean condition) {
			return checkFailed(condition);
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
