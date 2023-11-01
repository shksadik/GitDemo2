package com.sadik.Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void TestGoogle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("amazon.in", Keys.ENTER);
	String expectedtitle="amazon.in - Google Search";
	String actualtiltle="amazon.in - Google Search";
	Assert.assertEquals(actualtiltle, expectedtitle);
	driver.quit();
	
		
	}
	
	@Test
	public void TestFacebook(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("s.sadikbasha143@gmail.com",Keys.ENTER);
		String expectedtitle="s.sadikbasha143@gmail.com - Facebook";
		String actualtitle="s.sadikbasha143@gmail.com - Facebook";
		Assert.assertNotEquals(actualtitle, expectedtitle);
		driver.quit();
		
		
		
		
	}
}
