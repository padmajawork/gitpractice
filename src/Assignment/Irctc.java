package Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//a[@href='http://www.irctctourism.com/']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[@href='http://www.irctctourism.com/cgi-bin/dev1.dll/irctc/booking/vatplanner.do?screen=fromCity&Submit=Search&frompackage=true&cityName=0&bhTirth=&packageCategory=AIR%20PACKAGES&submitClicks=0&categoryName=AIR%20PACKAGES&destinationCity=&packageCity=0']")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("ViewPackageDetails")).click();
 		

	}

}
