package com.sadik.dependencyTests;

import org.testng.annotations.Test;
public class GroupDependency {

//	@Test(dependsOnGroups = {"smoke","sanity"},alwaysRun  =true)
//	public void test28() {
//		System.out.println("main test");
//	}
@Test(groups = "smoke")
public void test29() {
	System.out.println("smoke");
}
@Test(groups = "smoke")
public void test30() {
	System.out.println("smoke");
}

@Test(groups = "smoke")
public void test31() {
	System.out.println(5/0);
}
@Test(groups="sanity")
public void test33() {
	System.out.println("sanity");
}
@Test(groups="sanity")
public void test34() {
	System.out.println("sanity");
}
@Test(groups="regression")
	public void test35() {
	System.out.println("regression");
}
@Test(groups="regression")
public void test36() {
System.out.println("regression");
}
}
