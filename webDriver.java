package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class webDriver {

	public static WebDriver driver;

	
	@BeforeSuite
	public void setup() {

		driver = new ChromeDriver();
	}
	
	@Test
	public void login() {
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("youtube.com");
	}
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}

}
