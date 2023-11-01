package com.sadik.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListener.class)
public class TestClass1 {
	@Test
	public void testmethod1() {
		System.out.println("im the testmethod1");
	}

	@Test
	public void testmethod2() {
		System.out.println("im the testmethod2");
		Assert.assertTrue(false);
	}

	@Test(timeOut =1000)
	public void testmethod3() throws Exception {
		Thread.sleep(3000);
		System.out.println("im the testmethod3");
	}

	@Test(dependsOnMethods = "testmethod3")
	public void testmethod4() {
		System.out.println("im the testmethod4");
	}

	@Test
	public void testmethod5() {
		System.out.println("im the testmethod5");
	}

}
