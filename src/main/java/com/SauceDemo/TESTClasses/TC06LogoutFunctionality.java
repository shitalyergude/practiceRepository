package com.SauceDemo.TESTClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC06LogoutFunctionality extends TestBaseClass
{
   @Test (priority =5)
   public void logoutFunctionality() throws IOException
	{
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.clickOpenMenu();
		hp.clickLogout();
		ScreenShots.takesScreenshot(driver);
		
		System.out.println("Verify logout functionality");
		String expTitle = "Swag Labs";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle,expTitle);
		
	}
}
