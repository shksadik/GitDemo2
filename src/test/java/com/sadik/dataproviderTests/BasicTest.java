package com.sadik.dataproviderTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	@Test(dataProvider = "logindata")
	
	public void TestLogin(String userName,String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.quit();
	}

	@DataProvider(parallel =true)
	public Object[][]logindata() {
	Object[][]	data=new Object[8][2];
	data[0][0]="s.sadikbasha143@gmail.com";
	data[0][1]="Sadik@01";
	
	data[1][0]="sadik@gmail.com";
	data[1][1]="Sadik@01";
	
	data[2][0]="shksadikbasha@gmail.com";
	data[2][1]="sadik@67";
	
	data[3][0]="sadikbasha@gmail.com";
	data[3][1]="ghjiddf";
	
	data[4][0]="hyr@gmail.com";
	data[4][1]="ghyddeff";
	
	data[5][0]="bvr@gmail.com";
	data[5][1]="orange@09";
	
	data[6][0]="bvcdee@gmail.com";
	data[6][1]="gfv9@89";
	
	data[7][0]="vcd@gmail.com";
	data[7][1]="fres@09";
	return data;
		
	}
}
