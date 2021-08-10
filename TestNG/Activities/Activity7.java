package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity7 {
	
WebDriver driver;
	
	@BeforeClass
	public void Beforeclass7()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/login-form");	
	}
	@DataProvider(name ="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {{"admin","password"}};	
	}
	@Test(dataProvider = "Authentication")
	public void TestAct7(String username,String password) {
		WebElement user2 = driver.findElement(By.id("username"));
		user2.sendKeys(username);
		WebElement pass2= driver.findElement(By.id("password"));
		pass2.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
	}
	
	@AfterClass
	public void AfterClass7()
	{
	driver.close();	
	}

}
