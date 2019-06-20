package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='popup-menu-button'])[3]")
	private WebElement clickOnHelpLink;
	
	@FindBy(xpath="(//a[text()='About actiTIME]")
	private WebElement aboutActitime;
	
	@FindBy(id="aboutpopup")
	private WebElement actitimepopup;
	
	@FindBy(xpath="//img[@title='close']")
	private WebElement closeButton;
	
	public void clickOnLogoutLink()
	
	{
		logoutLink.click();
		
	}
public void ClickOnHelpLink()

{
	clickOnHelpLink.click();
	
}

public void ClickOnAboutActitime()
{

	aboutActitime.click();
	
}

public void verifyAboutActitime()
{
	Assert.assertTrue(actitimepopup.isDisplayed());
	
}
public void clickoncloseButton()
{
	closeButton.click();
}

}




