package Scripts;

import org.testng.annotations.Test;

import POM.EnterTimeTrackPage;
import POM.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
  @Test
  public void validLoginLogoutTest()
  {
	  LoginPage l=new LoginPage(driver);
	  l.SetUserName("admin");
	  l.SetPassword("manager");
	  l.ClickOnLoginButton();
	  EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	  e.clickOnLogoutLink();
	  
  }
}
