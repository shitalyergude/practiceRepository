package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass
{

	private WebDriver driver;
	
	//1.....login functionality - with vaild Credentials
	
	//1.UserName
//	@FindBy(xpath = "//input[@id='user-name']")
//	private WebElement username;
//	
//	public void sendUsername()
//	{
//		 username.sendKeys("standard_user");
//	}
//	
//	//2.Passowrd
//	@FindBy(xpath = "//input[@id='password']")
//	private WebElement password;
//	
//	public void sendPassword()
//	{
//		password.sendKeys("secret_sauce");
//	}
//	
//	//3.Login button
//	@FindBy(xpath = "//input[@id='login-button']")
//	private WebElement loginButton;
//	
//	public void clickLoginButton()
//	{
//		loginButton.click();
//	}
	
	//-------------------------------------------------------------------------------------------------------------
	//2.....login functionality - with invaild Credentials
	
//		//1.UserName
//		@FindBy(xpath = "//input[@id='user-name']")
//		private WebElement username1;
//		
//		public void sendUsername1()
//		{
//			 username1.sendKeys("user");
//		}
//		
//		//2.Passowrd
//		@FindBy(xpath = "//input[@id='password']")
//		private WebElement password1;
//		
//		public void sendPassword1()
//		{
//			password1.sendKeys("secret");
//		}
//		
//		//3.Login button
//		@FindBy(xpath = "//input[@id='login-button']")
//		private WebElement loginButton1;
//		
//		public void clickLoginButton1()
//		{
//			
//			loginButton1.click();
//		}
	//------------------------------------------------------------------------------------------------------
		//3.login functionality - with vaild Credentials
		
//			
			@FindBy(xpath = "//input[@id='user-name']")
			private WebElement user;
			@FindBy(xpath = "//input[@id='password']")
			private WebElement pass;
			@FindBy(xpath = "//input[@id='login-button']")
			private WebElement login;
			
			public void loginToSauceDemo(String userid , String password)
			{
				user.sendKeys(userid);
				pass.sendKeys(password);
				login.click();
			}
//	//--------------------------------------------------------------------------------------		
//            //4.login functionality - with vaild Credentials
//		
//			
			@FindBy(xpath = "//input[@id='user-name']")
			private WebElement user1;
			@FindBy(xpath = "//input[@id='password']")
			private WebElement pass1;
			@FindBy(xpath = "//input[@id='login-button']")
			private WebElement login1;
			
			public void loginToSauceDemo()
			{
				user1.sendKeys("standard_user");
				pass1.sendKeys("secret_sauce");
				login1.click();
			}	
	//-----------------------------------------------------------------------------------------------
	
    //constructor
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
