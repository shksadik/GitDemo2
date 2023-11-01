package com.sadik.Tests;

import org.testng.annotations.Test;

public class MovieBookingTest {
	@Test
public void Signup() {
		System.out.println("signup");
	}
	@Test(priority=-1)
	public void Login() {
		System.out.println("login");
		
	}
	@Test(priority=-2)
	public void SearchForTheMovie() {
		System.out.println("SearchForTheMovie");
	
	}
	@Test(priority=-3)
	public void SelectTheSeat() {
	System.out.println("SelectTheSeat");	
	}
	@Test(priority=-4)
	public void BookTickets() {
		System.out.println("BookTickets");
	}
	@Test(priority=-5)
	public void SaveTickets() {
		System.out.println("SaveTickets");
	}
	@Test(priority=-6)
	public void Logout() {
		System.out.println("Logout");
	}
}
