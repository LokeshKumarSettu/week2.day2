package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeads {

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
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Lead
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//input the number
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//click findlead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		String text2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text2);
		//click the first match
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		//click delete lead
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(text2);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String text3 = driver.findElement(By.className("x-paging-info")).getText();
		String text3 = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text3);
		//System.out.println(text3);
		if (text3.equals("No records to display")) {
			System.out.println("Text matched");
		}
		 else 
			{System.out.println("Text not matched");
			}
		
	}

}

