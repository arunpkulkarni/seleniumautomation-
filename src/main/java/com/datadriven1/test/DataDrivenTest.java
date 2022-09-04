package com.datadriven1.test;


import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	
//	static WebDriver driver;
	
	public static void main(String[]args) {
		
				//Get test data from Excel;
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\arunk\\eclipse-workspace\\Seleniumautomation\\src\\main\\java\\com\\testdata\\HalfEbayTestData1.xlsx");
		
		
		String firstName = reader.getCellData("RegTestData","firstname", 2);
		System.out.println(firstName);
		
		
		String lastName = reader.getCellData("RegTestData","lastname", 2);
		System.out.println(lastName);
		
		
		String Email = reader.getCellData("RegTestData","email", 2);
		System.out.println(Email);
		
		
		String password = reader.getCellData("RegTestData","password", 2);
		System.out.println(password);
		
		
		
	///Webdrivercode	
	
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver(); 		// Launch Chrome
		driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200, 1));
			driver.get("https://scgi.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo=c");          //enter url
		
			driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(Email);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		
	//	Select select = new Select (driver.findElement(By.xpath()))

	
	

} 
}