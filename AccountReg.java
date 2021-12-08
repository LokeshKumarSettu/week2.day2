package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountReg {

	public static void main(String[] args) {
		
		
         WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://WWW.opencart.com/index.php?route=account/register");
		 driver.findElement(By.id("input-username")).sendKeys("Lokesh");
		 driver.findElement(By.name("firstname")).sendKeys("Lokesh");
		 driver.findElement(By.name("lastname")).sendKeys("Kumar");
		 driver.findElement(By.id("input-email")).sendKeys("slokshkumar19@gmail.com");
		 
		 WebElement countryid = driver.findElement(By.id("input-country")); 
		 Select select = new Select(countryid);
		 select.selectByVisibleText("India");
		 
		 driver.findElement(By.id("input-password")).sendKeys("1234567890");
		 driver.findElement(By.className("bg-info")).click();
		 driver.findElement(By.xpath("html[1]")).click();
		 

	}

}
