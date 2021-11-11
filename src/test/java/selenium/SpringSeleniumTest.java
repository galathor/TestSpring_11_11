package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpringSeleniumTest {
	
	WebDriver driver;
	WebElement element;
	
	@BeforeTest
	public void firstStep() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost:8092/");
	}
	
	@Test
	public void startUp() {
		driver.findElement(By.cssSelector("a[href=\"/product/new\"]")).click();
		driver.findElement(By.id("productId")).sendKeys("5552211");
		driver.findElement(By.id("description")).sendKeys("onemli malzeme");
		driver.findElement(By.id("price")).sendKeys("13.90");
		driver.findElement(By.id("imageUrl")).sendKeys("www.google.com");
		driver.findElement(By.cssSelector(".btn-default")).click();
	}

}
