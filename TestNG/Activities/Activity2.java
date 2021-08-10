package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}
	
	@Test
	public void Test11()
	{
		String title = driver.getTitle();
		System.out.println("The title o the page is...." +title);
		Assert.assertEquals(title,"Target Practice");
	}
	@Test
	public void Test22()
	{
		WebElement black = driver.findElement(By.cssSelector("button.black"));
		System.out.println("Black button is found");
		Assert.assertEquals(black.getText(),"black");
		System.out.println("Assertion is passed");
		
	}
	@Test(enabled = false)
	public void Test33()
	{
	System.out.println("This test case is meant to be skipped");	
	}
	@Test
	public void Test44() 
	{
		String condition ="Skip test";
		if(condition.equals("Skip test"))
		{
			throw new SkipException("this is meant to be skipped and reported in reports as well");
		}
	}
	
	@AfterClass
	public void aterclass()
	{
		driver.close();
	}
	

}
