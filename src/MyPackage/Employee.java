package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Employee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://gmail.com");
	
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("dinesh.rajdesai");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("rajkumar241792$$");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span/a[@class='J-Ke n0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":37")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='gb_1a gbii']")).click();
		driver.findElement(By.id("gb_71")).click();
		
		
		//driver.close();
	}

}
