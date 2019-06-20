package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args){
	
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("padmajashastri20@gmail.com");
driver.findElement(By.id("pass")).sendKeys("padduilu");
driver.findElement(By.id("u_0_w")).click();

	
	
	
	
	
	
}
}
