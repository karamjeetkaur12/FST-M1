package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe"); 
		 driver= new ChromeDriver();
		driver.get("https://www.training-support.net");
		
		}
	
	@Test 
	public void sampletest() {
		
		//Use getTitle() to get and print the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is ....."+title);
		
		//Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
		Assert.assertEquals("Training Support", title);
		
		//Use findElement() to find the "About Us" Button on the page and click it
		 driver.findElement(By.id("about-link")).click();
		
		 //Get and print the title of the new page
		 title=driver.getTitle();
		 System.out.println("The title of new page is...."+title);
		 
		 //Assert the title of the new page
		 Assert.assertEquals(driver.getTitle(), "About Training Support");
		 
		 }
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
		}
	}
	


