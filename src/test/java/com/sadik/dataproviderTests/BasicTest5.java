package com.sadik.dataproviderTests;


import org.testng.annotations.Test;

import com.sadik.dataproviderTests.DataSupplier1.DataSupplier2.DataSupplier3;



public class BasicTest5 {
@Test(dataProvider="dp3",dataProviderClass = DataSupplier3.class)
public void TestLogin(String s) throws Exception{
	System.out.println(s);
}

}