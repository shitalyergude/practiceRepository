package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC04MenuButtonFunctionality extends TestBaseClass
{

	@Test (priority = 3)
	public void menuButtonFunctionality() throws IOException
	{
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.clickOpenMenu();
		
//		hp.clickAllItems();
		
		hp.clickAbout();
	    ScreenShots.takesScreenshot(driver);
//		hp.clickResetAppState();
//		
//		hp.clickLogout();

		System.out.println("Verify About button functionality");
	    String actURL =driver.getCurrentUrl();
	    System.out.println(actURL);
	    String expURL = "https://www.saucedemo.com/inventory.html";
	 
	    Assert.assertEquals(actURL, expURL);

	}

 
}

