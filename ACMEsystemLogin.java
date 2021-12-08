package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMEsystemLogin {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		
		//2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//4. Click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//5. Get the title of the page and print
		String title = driver.getTitle();
		System.out.println(title);
		//6. Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		//7. Close the browser (use -driver.close())
		driver.close();

	}

}
