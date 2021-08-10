package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
	
	WebDriver driver;
	Actions builder;
	
	
	@BeforeClass
	public void beforeclass10()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		builder = new Actions(driver);
		driver.get(" https://www.training-support.net/selenium/sliders");
		
	}
	
	@AfterClass
	public void afterclass10()
	{
		driver.close();
	}
	
	@Test
	public void mediumvalue()
	{
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("slider is found");
		slider.click();
		String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
		System.out.println("Volume at middle is .."+volumeLevel);
		Assert.assertEquals(volumeLevel,"49");
		
	}
	@Test
	public void maxvalue()
	{
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("slidermax is found");
		builder.clickAndHold(slider).moveByOffset(75,0).build().perform();
		String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
		System.out.println("Volume at middle is .."+volumeLevel);
		Assert.assertEquals(volumeLevel,"100");
		
	}
	@Test
	public void minvalue()
	{
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("slidermax is found");
		builder.clickAndHold(slider).moveByOffset(-75,0).build().perform();
		String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
		System.out.println("Volume at middle is .."+volumeLevel);
		Assert.assertEquals(volumeLevel,"0");
	}
	@Test
	public void volume30()
	{
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("slidermax is found");
		builder.clickAndHold(slider).moveByOffset(-23,0).build().perform();
		String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
		System.out.println("Volume at middle is .."+volumeLevel);
		Assert.assertEquals(volumeLevel,"30");
	}
	@Test
	public void volume80()
	{
		WebElement slider = driver.findElement(By.id("slider"));
		System.out.println("slidermax is found");
		builder.clickAndHold(slider).moveByOffset(34,0).build().perform();
		String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
		System.out.println("Volume at middle is .."+volumeLevel);
		Assert.assertEquals(volumeLevel,"80");
	}

}
