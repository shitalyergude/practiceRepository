package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.Listeners;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TestBaseClass extends Listeners 
{
	WebDriver driver;
    Logger log;
	 
	    @Parameters("browserName")
	    @BeforeMethod
		public void setUpMethod(String browserName) throws IOException
		{
	    	 log=Logger.getLogger("AAA");
			 PropertyConfigurator.configure("log4j.properties");
		    
	    	 if(browserName.contains("Chrome"))
	    	 {
	             System.setProperty("webdriver.chrome.driver",
		   	     "./Drivers/chromedriver.exe");
	    	
		   	     driver =  new ChromeDriver();
		   	     log.info("Chrome browser is open");
	         }
		   	 else
		   	 {
		   	    System.setProperty("webdriver.gecko.driver",
		   	    		"./Drivers/geckodriver.exe");
		   	     driver =  new FirefoxDriver();
		   	     log.info("Firefox browser is open");
		   	 }	   	    	        
	    		     
	    		     
			         driver.manage().window().maximize();
			         driver.get("https://www.saucedemo.com/");
			         log.info("URL is open");
			         ScreenShots.takesScreenshot(driver);
			         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			         
			         //Login 
			         LoginPagePOMClass1 lp = new LoginPagePOMClass1(driver);
			         lp.loginToSauceDemo(); 
//			         lp.loginWithExcelData();
       
		}
	    
	    
		@AfterMethod
		public void tearDown() throws IOException
		{
            driver.quit();
			System.out.println("End of the Program");
		}
		
	
    
}
