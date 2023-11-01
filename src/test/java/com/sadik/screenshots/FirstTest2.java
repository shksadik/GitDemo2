package com.sadik.screenshots;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest2 extends BaseTest{

	@Test(testName="testgoogle")
	public void testgoogle() throws Exception {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flipkart",Keys.ENTER);
		System.out.println(driver.getTitle());
	
		
	}
	

	@Test(testName="TestFacebook")
	public void TestFacebook() throws Exception {
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("basha@gmail.com",Keys.ENTER);
		
		
		
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
		
		
		String actualErrormessage=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrormessage="The email address you entered isn't connected to an account. Find your account and log in";
		softAssert.assertEquals(actualErrormessage,expectedErrormessage,"Username  is mismatched");

   driver.quit();
	softAssert.assertAll();
	
		
	}
}
