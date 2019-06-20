package MyPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		//driver.get("http://irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//a[@title='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[@href='/motorola?otracker=hp_header_nmenu_sub_Electronics_0_Motorola']")).click();
		//driver.findElement(By.linkText("Motorola"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator))
		driver.findElement(By.xpath("//a[@href='/mobiles/~moto-g-3rd-gen/pr?sid=tyy%2C4io']")).click();
		

	}

}
