package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
        //Enter UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        //Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
        //Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		//Type first name with your name
		driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name='firstName']")).sendKeys("lokesh");
		//Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		
		Thread.sleep(3000);
		//Print the first contact id
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		
		//click first contact id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
		
		
	}

}

