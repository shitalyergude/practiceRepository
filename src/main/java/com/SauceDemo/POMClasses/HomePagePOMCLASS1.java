package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMCLASS1 
{
private WebDriver driver;

//1.single product
@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
private WebElement singleProduct;

@FindBy (xpath = "//span[text()='1']")
private WebElement singleCart;


public void singleProductAddToCart()
{
	singleProduct.click();
}

public String getSingleCartText()
{
	 String t = singleCart.getText();
	 System.out.println("Cart text - " + t);
	 return t;
}

//------------------------------------------

//multiple product
@FindBy (xpath = "//button[text()='Add to cart']")
private List<WebElement> multiProduct;

@FindBy (xpath = "//span[text()='6']")
private WebElement multiCart;

public void multiProductAddToCart()
{
	 for(WebElement all : multiProduct)
	 {
		 all.click();
	 }
}

public String getMultiCartText()
{
	 String t = multiCart.getText();
	 System.out.println("Cart text - " + t);
	 return t;
}	
	
@FindBy(xpath="//div[@class='inventory_item_name']")
private List<WebElement> allProductsName;

public void getNameofAllProducts()
{
	for(int i =0;i<allProductsName.size();i++)
	{
	String name = allProductsName.get(i).getText();
	System.out.println(name);
	}
}	
	
//.++----------------------------------------------------------------------	

//Menu Button 

    //1.open Menu
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement openMenu;
	
	public void clickOpenMenu()
	{
		openMenu.click();
	}
	
	//2.All items
	@FindBy(xpath="//a[text()='All Items']")
	private WebElement allItems;
	
	public void clickAllItems()
	{
		allItems.click();
	}
	
	//3.About
	@FindBy(xpath="//a[text()='About']")
	private WebElement about;
	
	public void clickAbout()
	{
		about.click();
	}
	
	//4.Reset app state
	@FindBy(xpath="//a[text()='Reset App State']")
	private WebElement reset;
		
	public void clickResetAppState()
	{
		reset.click();
	}
	
	//5.logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
			
	public void clickLogout()
	{
		logout.click();
	}
//-------------------------------------------------------------	
	
//DropDown	
	
	//1.By select class
	@FindBy (xpath = "//select[@class = 'product_sort_container']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//span[text()='Price (high to low)']")
	private WebElement dropdownOption;
	
	
	public void clickDropdpwn()
	{
		dropdown.getText();
		Select s = new Select(dropdown);
		s.selectByVisibleText("Price (high to low)");
	}
	
	public String textDropdown()
	{
		String text = dropdownOption.getText();
		System.out.println("Applied filter - " + text );
		return text;
	}
	
	
	
	//2.Without select class
	@FindBy (xpath = "//option")
	private List<WebElement> filter;
	
	public void filterMenu()
	{
		for(WebElement option :filter)
		{
			if(option.getText().equals("Name (Z to A)"))
        	{
				option .click();
        	}
		}
	}
	
	
	
	
	
	
	
	
	
//constructor
public HomePagePOMCLASS1(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
}
