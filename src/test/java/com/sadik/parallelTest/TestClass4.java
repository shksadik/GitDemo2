package com.sadik.parallelTest;

import org.testng.annotations.Test;

public class TestClass4 {
	@Test
	public void testmethod11() {
		System.out.println("TestClass4 >> testmethod11 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod12() {
		System.out.println("TestClass4 >> testmethod12 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod13() {
		System.out.println("TestClass4 >> testmethod13 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod14() {
		System.out.println("TestClass4 >> testmethod14 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod15() {
		System.out.println("TestClass4 >> testmethod15 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod16() {
		System.out.println("TestClass4 >> testmethod16 >> " +Thread.currentThread().getId());
	}
}
