package MyPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	//	WebElement dp=driver.findElement(By.xpath("//select[@id='year']"));
	//	Select sel=new Select(dp);
	//	sel.selectByValue("2014");
	//	driver.findElement(By.id("u_0_e")).click();;
		
		
		
		}

}