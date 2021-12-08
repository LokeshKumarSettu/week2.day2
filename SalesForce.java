package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
	    // Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    // Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Lokesh");
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		driver.findElement(By.name("UserEmail")).sendKeys("slokeshkumar19@gmail.com");
		
		WebElement jobtitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select select1 =new Select(jobtitle);
		select1.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement empname = driver.findElement(By.xpath("//select[@name ='CompanyEmployees']"));
		Select select2 =new Select(empname);
		select2.selectByVisibleText("101 - 500 employees");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select select3 =new Select(country);
		select3.selectByVisibleText("India");
		
	    // Step 8: Click the check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.findElement(By.name("start my free trial")).click();
	    // Step 9: Close the browser
		driver.close();
	    

	}

}
