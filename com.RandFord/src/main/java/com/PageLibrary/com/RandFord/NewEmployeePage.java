package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class NewEmployeePage extends Base  {
	public static WebElement empName_Button(WebDriver driver) {
		return driver.findElement(getlocator("empName"));
	}
	
	public static WebElement empPass_Button(WebDriver driver) {
		return driver.findElement(getlocator("empPass"));
	}
	
	public static WebElement empSubmit_Button(WebDriver driver) {
		return driver.findElement(getlocator("submitEmp"));
	}
}
