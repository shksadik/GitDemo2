package com.sadik.groupTests;




import org.testng.annotations.Test;


public class NewTest2 {

	
  @Test(groups= {"sanity"})
  public void Test10() {
	  System.out.println("Test10");
	  
  }
  @Test(groups= {"smoke"})
  public void Test11() {
	  System.out.println("Test11");
  }
  @Test(groups= {"sanity","smoke"})
  public void Test12() {
	  System.out.println("Test12");
  }
  @Test(groups= {"sanity","regression"})
  public void Test13() {
	  System.out.println("Test13");
  }
  
  @Test(groups= {"smoke","functional","regression"})
  public void Test14() {
	  System.out.println("Test14");
}
 
  @Test(groups= {"sanity","functional"})
  public void Test15() {
	  System.out.println("Test15");
  }
  
  @Test(groups= {"sanity"})
  public void Test16() {
	  System.out.println("Test16");
  }
  
  @Test(groups= {"smoke"})
  public void Test17() {
	  System.out.println("Test17");
  }
  @Test(groups= {"sanity"})
  public void Test18() {
	  System.out.println("Test18");
  }
  
  
}

