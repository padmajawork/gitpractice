package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsOfWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//WebElement str=driver.findElement(By.xpath("//div[@class='logo logo-w']"));
		//System.out.println(str.isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//h2[@class='hidden-small']")).isDisplayed());
		driver.findElement(By.id("Email")).sendKeys("dinesh.rajdesai");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("link-forgot-passwd")).click();
		Thread.sleep(2000);
	driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("account-chooser-link")).click();
		
				
	}

}
