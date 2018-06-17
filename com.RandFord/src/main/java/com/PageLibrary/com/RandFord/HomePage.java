package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class HomePage extends Base {
	public static WebElement userName_text(WebDriver driver)
	{
		return driver.findElement((getlocator("username")));
		
	}
	public static WebElement password_text(WebDriver driver)
	{
		return driver.findElement((getlocator("password")));
		
	}

	public static WebElement login(WebDriver driver)
	{
		return driver.findElement((getlocator("login")));
		
	}

}
