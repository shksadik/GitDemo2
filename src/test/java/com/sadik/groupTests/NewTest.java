package com.sadik.groupTests;



import org.testng.annotations.Test;

@Test(groups = {"all"})
public class NewTest {
	
	
  @Test(groups = {"smoke"})
  public void Test1() {
	  System.out.println("Test1");
	  
  }
  @Test
  public void Test2() {
	  System.out.println("Test2");
  }
  @Test(groups = {"smoke"})
  public void Test3() {
	  System.out.println("Test3");
  }
  @Test(groups = {"smoke"})
  public void Test4() {
	  System.out.println("Test4");
  }
  @Test(groups = {"smoke"})
  public void Test5() {
	  System.out.println("Test5");
}
  @Test(groups= {"sanity"})
  public void Test6() {
	  System.out.println("Test6");
  }
  @Test(groups = {"smoke"})
  public void Test7() {
	  System.out.println("Test7");
}
  @Test(groups= {"sanity"})
  public void Test8() {
	  System.out.println("Test8");
}
  @Test(groups= {"sanity"})
  public void Test9() {
	  System.out.println("Test9");
  }
  
  
  
}