package com.SauceDemo.TESTClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMCLASS1;

public class TestSuiteClass extends TestBaseClass
{

	@Test (priority = 0 , invocationCount = 3)
	public void verifyLoginFunctionality()
	{
		System.out.println("VerifY login functionality");
	    String actURL =  driver.getCurrentUrl();
	    String expURL = "https://www.saucedemo.com/inventory.html";
	 
	     if(actURL.equals(expURL))
	     {
		 System.out.println("Test case Pass - Succesfully Login");
	     }
	     else
	     {
		 System.out.println("Test case Failed - Not Succesfully Login");
	     }
	
	}

	@Test (priority = 1 , dependsOnMethods= {"verifyLoginFunctionality"})
	public void SingleProductAddTOCartFunctionality()
	{
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.singleProductAddToCart();
		
		System.out.println("VerifY Single product add to cart functionality");
	    String actT = hp.getSingleCartText(); 
	    String expT = "1";
	 
	     if(actT.equals(expT))
	     {
		 System.out.println("Test case Pass - Product is added to Cart");
	     }
	     else
	     {
		 System.out.println("Test case Failed - Product is not added to Cart");
	     }
	}
	
	@Test (priority = 2)
	public void multiProductAddTOCartFunctionality()
	{
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.multiProductAddToCart();
		hp.getNameofAllProducts();

		System.out.println("Verify Multiple products add to cart functionality");
	    String actT = hp.getMultiCartText(); 
	    String expT = "6";
	 
	     if(actT.equals(expT))
	     {
		 System.out.println("Test case Pass - Products are added to Cart");
	     }
	     else
	     {
		 System.out.println("Test case Failed - Products are not added to Cart");
	     }

	}
	

	@Test (priority = 3 , timeOut = 2000)
	public void menuButtonFunctionality() throws InterruptedException
	{
		Thread.sleep(10000);
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.clickOpenMenu();
		
//		hp.clickAllItems();
		
		hp.clickAbout();
//		
//		hp.clickResetAppState();
//		
//		hp.clickLogout();

		System.out.println("Verify About button functionality");
	    String actURL =driver.getCurrentUrl();
	    String expURL = "https://saucelabs.com/";
	 
	     if(actURL.equals(expURL))
	     {
		 System.out.println("Test case Pass ");
	     }
	     else
	     {
		 System.out.println("Test case Failed ");
	     }

	}

	
	   
    @Test (priority = 4)
	public void DropDownFunctionality()
	{
	    HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.clickDropdpwn();
//		hp.filterMenu();
				
		System.out.println("Verify dropdown functionality");
		String actText = hp.textDropdown();
		String expText = "PRICE (HIGH TO LOW)";
			 
		if(actText.equals(expText))
		{
		System.out.println("Test case Pass - Filter Applied");
		}
	    else
		{
		 System.out.println("Test case Failed - Filter not Applied");
		 }
			
    }
			
			
	 @Test (priority = 5 , invocationCount = 2)
	 public void logoutFunctionality()
	 {
		HomePagePOMCLASS1 hp = new HomePagePOMCLASS1(driver);
		hp.clickOpenMenu();
		hp.clickLogout();
					
		System.out.println("Verify logout functionality");
		String expTitle = "Swag Labs";
		String actTitle = driver.getTitle();
					
		if(expTitle.equals(actTitle))
		{
		System.out.println("Test Case is Passed");
		}
		else
		{
		System.out.println("Test Case is Failed");
		}
					
	}

}
