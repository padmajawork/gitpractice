package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.LoginPage;

public class BaseTest {
	WebDriver driver;
  @BeforeClass
  public void preConditionTest()
  {
	  driver=new FirefoxDriver();
  driver.get("http://localhost/login.do");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void postConditionTest()
  {
	driver.quit();  
  }
  
}
