package com.SauceDemo.TESTClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class LoginFunctionality 
{
	
@Test	
public void loginFunctionality()
{
	    System.setProperty("webdriver.chrome.driver", 
	    "F:\\Selenium\\Selenium2\\chromedriver.exe\\");
	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("Chrome is opend");
	    driver.get("https://www.saucedemo.com/");
	    System.out.println("Website is opend");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	    LoginPagePOMClass login = new LoginPagePOMClass(driver);
	    
	  //1....Validating with valid Credentials
	    
//	    login.sendUsername();
//	    login.sendPassword();
//	    login.clickLoginButton();
//  
//	    String expURL = "https://www.saucedemo.com/inventory.html";
//	    String actURL = driver.getCurrentUrl();
//	    
//	    if(expURL.equals(actURL))
//	    {
//	    	System.out.println("Succesfully login - test case Passed");
//	    }
//	    else
//	    {
//	    	System.out.println("Not Succesfully login - test case Failed");
//	    }
//--------------------------------------------------------------------------------------------
	    //2.....Validating with invalid credentilals
	    
//	    login.sendUsername1();
//	    login.sendPassword1();
//	    login.clickLoginButton1();
//	    
//	    String expURL1 = "https://www.saucedemo.com/inventory.html";
//	    String actURL1 = driver.getCurrentUrl();
//	    
//	    if(expURL1.equals(actURL1))
//	    {
//	    	System.out.println("Succesfully login - test case Passed");
//	    }
//	    else
//	    {
//	    	System.out.println("Not Succesfully login - test case Failed");
//	    }
//-------------------------------------------------------------------------------------------------	    
	    //3-----
//	    login.loginToSauceDemo("standard_user", "secret_sauce");
//  
//	    String expURL = "https://www.saucedemo.com/inventory.html";
//	    String actURL = driver.getCurrentUrl();
//	    
//	    if(expURL.equals(actURL))
//	    {
//	    	System.out.println("Succesfully login - test case Passed");
//	    }
//	    else
//	    {
//	    	System.out.println("Not Succesfully login - test case Failed");
//	    }
//-----------------------------------------------------------------------------------------------------
	    //4......
	    login.loginToSauceDemo();
	   
	    
	    
	    
	    
	    
	    
	    
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
