package com.sadik.dataproviderTests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest2 {
	
	@Test(dataProvider= "dp1")
//	public void TestLogin(String[] s) throws Exception {
//		System.out.println(s[0]+"=="+s[1]);
		public void TestLogin(String[] s) throws Exception{
	System.out.println( s[0]+ "==" + s[1]);
	
//			System.out.println(s);
		
	}

	@DataProvider(name="dp1")
	public Iterator<String[]> dp1(){
		List<String[]> data=new ArrayList<>(); 
			data.add(new String[] {"sadik","basha"});
			data.add(new String[] {"audrey","bitony"});
		
	        data.add(new String[] {"sunny","leone"});	
			return data.iterator();
	
	}
	
	
}
