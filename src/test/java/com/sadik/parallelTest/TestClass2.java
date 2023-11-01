package com.sadik.parallelTest;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void testmethod6() {
		System.out.println("TestClass2 >> testmethod6 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod7() {
		System.out.println("TestClass2 >> testmethod7>> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod8() {
		System.out.println("TestClass2 >> testmethod8 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod9() {
		System.out.println("TestClass2 >> testmethod9 >> " +Thread.currentThread().getId());
	}

	@Test
	public void testmethod10() {
		System.out.println("TestClass2 >> testmethod10>> " +Thread.currentThread().getId());
	}

}
