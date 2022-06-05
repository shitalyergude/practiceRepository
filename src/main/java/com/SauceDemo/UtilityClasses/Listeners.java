package com.SauceDemo.UtilityClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class Listeners implements ITestListener
{
	WebDriver driver;

	public void onTestFailure(ITestResult result)
	{
		System.out.println("Take screenshot on failure  " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Take screenshot on pass  " +  result.getName());
		try {
			ScreenShots.takesScreenshot(driver);
		    } 
		catch (IOException e) 
		    {
		    e.printStackTrace();
		    }
	}
	
}
