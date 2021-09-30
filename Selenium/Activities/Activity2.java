package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
WebDriver driver = new FirefoxDriver();

        
    
        driver.get("https://www.training-support.net");
        
   
        String title = driver.getTitle();
    
        System.out.println("Page title is: " + title);
        
    
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLocator.getText());
        
      
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classNameLocator.getText());
        
       
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());
        
     
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());
        
     
        driver.close();
    }

	}


