package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void act5Beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
     }
	
	@Test(groups ={"headerTest" , "buttons"})
	public void act5test1()
	{
		String title = driver.getTitle();
		System.out.println("The title of the page is ...." + title);
		Assert.assertEquals("Target Practice", title);
		System.out.println("title assert is passed");
	}
	@Test(dependsOnMethods = {"act5test1"},groups = "headerTest")
	public void act5test2()
	{
		WebElement header = driver.findElement(By.id("third-header"));
		System.out.println("third header is found");
		Assert.assertEquals(header.getText(),"Third header");
		System.out.println("headertext assert is passed");
		Assert.assertEquals(header.getCssValue("color"),"rgba(251, 189, 8, 1)");
	}
	@Test(groups = "buttons")
	public void act5test3()
	{
		WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
		Assert.assertEquals(button1.getText(),"Olive");
		System.out.println("Text of olive is matching");
	}
	@Test(groups = "buttons")
	public void act5test4()
	{
		WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
		Assert.assertEquals(button2.getText(),"Brown");
		System.out.println("Text of brown is matching");
	}
	
	
	@AfterClass(alwaysRun=true)
	public void act5Afterclass()
	{
		driver.quit();
	}

}
