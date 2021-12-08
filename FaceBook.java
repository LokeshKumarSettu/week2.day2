package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		

		//Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();;
		//Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Lokesh");
		//Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		//Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9003286541");
		//Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("@lokeshkumar");
		//Step 11: Handle all the three drop downs
		WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("19");
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select select1 = new Select(dropdown2);
		select1.selectByVisibleText("Dec");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("1999");

		//Step 12: Select the radio button "male"
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}

