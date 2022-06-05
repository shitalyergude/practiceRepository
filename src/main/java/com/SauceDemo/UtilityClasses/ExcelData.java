package com.SauceDemo.UtilityClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelData 
{
private WebDriver driver;

public static String usernameData(WebDriver driver) throws IOException
{
	String path = "F:\\Selenium\\ExcelSheet\\SwagLabs.xlsx";
	FileInputStream file = new FileInputStream(path);
	XSSFWorkbook book = new XSSFWorkbook(file);
	XSSFSheet sheet = book.getSheet("Sheet1");
    XSSFRow row = sheet.getRow(0);
	XSSFCell clm = row.getCell(0);
	String username= clm.getStringCellValue();
	
	return username;
}

public static String passwordData(WebDriver driver) throws IOException
{
	String path = "F:\\Selenium\\ExcelSheet\\SwagLabs.xlsx";
	FileInputStream file = new FileInputStream(path);
	XSSFWorkbook book = new XSSFWorkbook(file);
	XSSFSheet sheet = book.getSheet("Sheet1");
    XSSFRow row = sheet.getRow(0);
	XSSFCell clm = row.getCell(1);
	String password= clm.getStringCellValue();
	
	return password;
}

}
