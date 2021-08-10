package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	
	@BeforeClass
	public void Beforeclass6()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/login-form");	
	}
	
	@Test
	@Parameters({"username","password"})
	public void TestAct6(String username,String password) {
		WebElement user1 = driver.findElement(By.id("username"));
		user1.sendKeys(username);
		WebElement pass1= driver.findElement(By.id("password"));
		pass1.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
	}
	
	@AfterClass
	public void AfterClass6()
	{
	driver.close();	
	}

}
