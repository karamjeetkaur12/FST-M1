package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) {

    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KARAMJEETKAUR\\Desktop\\FST Training\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        checkboxInput.click();

        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        driver.close();

    }

}