package com.sadik.dependencyTests;


import org.testng.annotations.Test;

public class TestDependency {
static String trackingNumber=null;

	@Test(dependsOnMethods ={"createshipment"},ignoreMissingDependencies = true)
	public void Trackshipment() throws Exception {
		
		if(trackingNumber !=null)
			System.out.println("Trackshipment");
		else
			throw new Exception("invalid tracking number");
		
			
		
	}
	@Test(dependsOnMethods = {"createshipment"},ignoreMissingDependencies = true )
	public void cancelshipment() throws Exception {
		if(trackingNumber !=null)
		System.out.println("cancelshipment");
		else
			throw new Exception("invalid tracking number");
	}
}
