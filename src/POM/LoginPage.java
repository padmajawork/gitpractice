package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement userNameEdtBox;
	 
	@FindBy(name="pwd")
	private WebElement pwdEditBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement verifyErrorMsg;
	
	public void SetUserName(String un)
	{
		userNameEdtBox.sendKeys(un);
	}
	
	public void SetPassword(String pwd)
	{
		pwdEditBox.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void VerifyErrorMsg()
	{
		Assert.assertTrue(verifyErrorMsg.isDisplayed());
	}
	
	
	
	
	
}


