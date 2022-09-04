package com.datadriven1.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbdayTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 							// Launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200, 1));
		driver.get("https://scgi.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo=c");          //enter url
				
	}
	
	
	@Test
	public void halfEbayRegPageTest() {
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
