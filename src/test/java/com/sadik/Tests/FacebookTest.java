package com.sadik.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
	
	
	
	
	
	
	@BeforeTest
	
	@Parameters("chrome")
	public void IntialiseBrowser(String browserName)throws Exception{
		switch ("browserName") {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			break;

		default:
			System.out.println("Browsername is invalid");
			break;
		}	
		
}
		
	@Parameters("chrome")	
@Test 
	
	public void EnterLoginDetails() throws Exception{
	   driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("s.sadikbasha143@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sadik@01");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
}

		
}


	


	