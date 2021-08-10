package testNGTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod9()
	{
	driver.switchTo().defaultContent();
	}
	
	@BeforeTest
	public void beforetest9()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\Drivers\\chromedriver.exe");
		Reporter.log("Starting Test |");
		driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		Reporter.log("Browser opened");
	}
	
	@AfterTest
	public void aftertest9()
	{
		driver.close();
		Reporter.log("Browser closed");
	}
	
	@Test
	public void simpleAlertTestCase()
	{
		WebElement simple = driver.findElement(By.id("simple"));
		simple.click();
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println("Simple alert text.. "+simpleAlertText);
		simpleAlert.accept();
		Reporter.log("alert1 accepted");
	}
	@Test
	public void confirmAlertTestCase()
	{
		WebElement confirm =driver.findElement(By.id("confirm"));
		confirm.click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmAlertText = confirmAlert.getText();
		System.out.println("The text of confirm alert ..."+confirmAlertText);
		confirmAlert.accept();
		Reporter.log("alert2 accepted");
		
	}
	@Test
	public void promtAlertTestCase()
	{
		WebElement promt =driver.findElement(By.id("prompt"));
		promt.click();
		Alert promtAlert = driver.switchTo().alert();
		String promtAlertText = promtAlert.getText();
		System.out.println("The text of promt alert ..."+promtAlertText);
		promtAlert.accept();
		Reporter.log("alert3 accepted");
	}

}
