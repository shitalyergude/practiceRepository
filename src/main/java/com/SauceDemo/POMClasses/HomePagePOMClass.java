package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOMClass 
{

	private WebDriver driver;
	
//	Menu button
	//1. open Menu
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
	
	//2.About
	@FindBy(xpath="//a[text()='About']")
	private WebElement about;
	
	public void clickAbout()
	{
		about.click();
	}
	
	//4.logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
		
	public void clickLogout()
	{
		logout.click();
	}
	
	//5.Reset app state
	@FindBy(xpath="//a[text()='Reset App State']")
	private WebElement reset;
		
	public void clickResetAppState()
	{
		reset.click();
	}
}
