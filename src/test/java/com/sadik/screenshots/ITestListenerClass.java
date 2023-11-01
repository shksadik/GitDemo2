package com.sadik.screenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenshot(result.getMethod().getMethodName()+".jpg");
	}
	
	 

}
