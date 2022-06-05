package com.SauceDemo.TESTClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;
import com.SauceDemo.POMClasses.LoginPagePOMClass1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC02AddToCartSingleProductFunctionality extends TestBaseClass
{

	@Test (priority = 1)
	public void SingleProductAddTOCartFunctionality() throws IOException
	{
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.singleProductAddToCart();
		ScreenShots.takesScreenshot(driver);
		
		System.out.println("Verify Single product add to cart functionality");
	    String actT = hp.getSingleCartText(); 
	    String expT = "1";
	 
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(actT, expT);
	    soft.assertAll();
	
	}
	
}
