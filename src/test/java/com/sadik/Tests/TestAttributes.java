package com.sadik.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAttributes {

	@Test( invocationTimeOut = 20000  ,threadPoolSize = 2)
	public void testmethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
         
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		
		driver.quit();
		
	
	
		
		
	}
}
