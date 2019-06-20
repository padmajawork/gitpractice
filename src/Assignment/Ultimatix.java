package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ultimatix {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultimatix.net");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("USER")).sendKeys("671353");
		driver.findElement(By.id("PASSWORD")).sendKeys("Desai@11");
		/*driver.findElement(By.id("login_button")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/TCSL/Applications/My+Applications']")).click();
		driver.findElement(By.linkText("Timesheet Entry")).click();*/
		
	}

}
