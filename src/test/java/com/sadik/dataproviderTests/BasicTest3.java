package com.sadik.dataproviderTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {
@Test(dataProvider="dp1")
public void TestLogin(String[] s) {
	System.out.println(s[0]+ "="+s[1]);
	
}
@DataProvider(indices = {1,4} )
public String[][] dp1() {
	String[][] data=new String[5][5] ;
			data[0][0]="sadik";
			data[0][1]="1245";
			data[1][0]="basha";
			data[1][1]="8888";
			data[2][0]="hyr";
			data[2][1]="6666";
			data[3][0]="noooo";
			data[3][1]="2222";
			data[4][0]="yessss";
			data[4][1]="33333";

	return data;
}
	
	

}
