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

public class TC03AddToCartMultiProductFunctionality extends TestBaseClass
{

	
@Test (priority = 2)
public void multiProductAddTOCartFunctionality() throws IOException
{
	HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
	hp.multiProductAddToCart();
	ScreenShots.takesScreenshot(driver);
	log.info("All products added to cart");
	hp.getNameofAllProducts();
	log.info("above are the Names of the all the products");

	System.out.println("Verify Multiple products add to cart functionality");
    String actT = hp.getMultiCartText(); 
    String expT = "6";
 
    Assert.assertEquals(actT, expT ,"successfull");
    log.info("Verified Multiple products add to cart functionality");
    
    

}

	
}
