package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class PracticeTestBaseClass 
{
	 WebDriver driver;
	 

	    @AfterClass
	    public void browserSetup() throws IOException
	    {
	    	System.setProperty("webdriver.chrome.driver",
					"F:\\Selenium\\Selenium2\\chromedriver.exe\\");
			         
			         driver =  new ChromeDriver();
			         driver.manage().window().maximize();
			         driver.get("https://www.saucedemo.com/");
			         ScreenShots.takesScreenshot(driver);
//			         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    }
	 
	    @BeforeMethod
		public void setUpMethod() throws IOException
		{
			       
			         //Login 
			         LoginPagePOMClass1 lp = new LoginPagePOMClass1(driver);
//			         lp.loginToSauceDemo();  
			         lp.loginWithExcelData();
			         
		}
	    
		
		@AfterMethod
		public void close() throws IOException
		{
			ScreenShots.takesScreenshot(driver);
			driver.close();
			System.out.println("Close the Program");
		}
    
		@AfterClass
		public void tearDown() throws IOException
		{
			driver.quit();
			System.out.println("End of the Program");
			
		}
}
