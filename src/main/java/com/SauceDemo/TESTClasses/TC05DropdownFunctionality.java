package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;
import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC05DropdownFunctionality extends TestBaseClass 
{
	 
	   
		@Test (priority = 4)
		public void DropDownFunctionality() throws IOException
		{
			HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		    hp.clickDropdpwn();
		    ScreenShots.takesScreenshot(driver);
//		    hp.filterMenu();
			
			System.out.println("Verify dropdown functionality");
		    String actText = hp.textDropdown();
		    String expText = "PRICE (HIGH TO LOW)";
		 
		    Assert.assertEquals(actText,expText);
		
		}
	
}
