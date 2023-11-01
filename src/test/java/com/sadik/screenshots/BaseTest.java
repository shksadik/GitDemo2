package com.sadik.screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static  String screenshotSubFolderName;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

}
	@AfterMethod
	public void screenshotCapture(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			captureScreenshot(result.getMethod().getMethodName()+".jpg");
		}
		
	
	
}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
		
		
	public void captureScreenshot(String fileName) {
		if(screenshotSubFolderName==null)
		{
		LocalDateTime mydateobj=LocalDateTime.now();
		
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("ddmmyyyyhhmmss");
		screenshotSubFolderName= mydateobj.format(myFormatObj);
		
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/"+ screenshotSubFolderName+"/" +fileName);
	try {
	FileUtils.copyFile(sourceFile, destFile);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	
	System.out.println("Screenshot saved successfully");
}
}
}