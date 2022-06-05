package com.SauceDemo.POMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.UtilityClasses.ExcelData;

public class LoginPagePOMClass1 
{
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login;
	
	public void loginToSauceDemo()
	{
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}	
	
	//-------------------------------------------------------------------------
	//login using excel data
	
	public void loginWithExcelData() throws IOException
	{
		String user =  ExcelData.usernameData(driver);
		userName.sendKeys(user);
		
		String pass =  ExcelData.passwordData(driver);
		password.sendKeys(pass);
		
		login.click();
	}
	
	//-------------------------------
	//constructor
	public LoginPagePOMClass1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
