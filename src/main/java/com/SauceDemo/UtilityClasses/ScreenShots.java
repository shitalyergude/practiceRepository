package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots 
{
 WebDriver driver;
 
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date =  d1.format(d) ;
		String title = driver.getTitle();
		
		TakesScreenshot s =(TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/SauceDemo."+ date + "-" + title +".jpg");
		FileHandler.copy(source, dest);
	}
	
	

	
	
	
	
	
	
	
	
	
}
