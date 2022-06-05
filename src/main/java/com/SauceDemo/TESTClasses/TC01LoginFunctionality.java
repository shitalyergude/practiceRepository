package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;
import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC01LoginFunctionality extends TestBaseClass 
{
	
	@Test (priority = 0)
	public void verifyLoginFunctionality() throws IOException
	{
		System.out.println("Apply Validation ");
	    String actURL =  driver.getCurrentUrl();
	    String expURL = "https://www.saucedemo.com/inventory.html";
	    ScreenShots.takesScreenshot(driver);
	    
	    Assert.assertEquals(actURL, expURL);
	    log.info("Login functionality Test Case Passed");
	}

}
