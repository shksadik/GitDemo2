package com.sadik.Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test 
	public void TestGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("flipkart",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

	
	@Test 
	public void TestFacebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sadik@gmail.com");
		
		
		Thread.sleep(3000);
		
SoftAssert softAssert=new SoftAssert();
		
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		softAssert.assertEquals(actualTitle,expectedTitle,"Title is mismatched");
		//softAssert.assertEquals(expectedTitle, actualTitle);

		
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.facebook.com/login/web/?email=s.sadikbasha143%40gmail.com&is_from_lara=1";
	softAssert.assertNotEquals(actualUrl,expectedUrl,"Url is mismatched");
		
		String actualText=driver.findElement(By.id("email")).getAttribute("value");
		String expectedText="s.sadikbasha143@gmail.com";
		softAssert.assertEquals(actualText,expectedText,"Username Text is mismatched");
		
		
		String actualerrormessage=driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		String expectederrormessage="The email address you entered isn't connected to an account. Find your account and log in.";
		assertEquals(actualerrormessage,expectederrormessage,"Username  is mismatched");
		
driver.quit();
	softAssert.assertAll();
	
		
	}
}

		
