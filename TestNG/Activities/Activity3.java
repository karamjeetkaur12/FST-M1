package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/login-form");

	}
	
	@Test
	public void test()
	{
		WebElement username = driver.findElement(By.id("username"));
		System.out.println("username is found");
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("password is found");
		password.sendKeys("password");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println("login button is found");
		login.click();
		
		String title = driver.findElement(By.id("action-confirmation")).getText();
		
	   System.out.println("The title of the pags is .."+title);
	   Assert.assertEquals("Welcome Back, admin",title);
	   System.out.println("assertiion is passed");
	}
	
	@AfterClass
	public void afterclass1()
	{
		driver.quit();
	}

}
