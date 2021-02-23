package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;

public class MyListeners implements ITestListener  {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public  void onTestFailure(ITestResult result) {
		   Reporter.log(result.getName()+"failed", true);
		//	WebDriverCommonLib wlib = new WebDriverCommonLib();
			TakesScreenshot ts = (TakesScreenshot)BaseTest.d;
			File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("C:\\Users\\utkrasht awasthi\\eclipse-workspace\\Acti_Time_Header_Element\\Screenshot");
	         	try {
	         		Files.copy(src, dest);
	         	}catch(IOException e)
	         	{
	         		e.printStackTrace();
	         	}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
