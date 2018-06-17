package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class EmployeeUpdationPage extends Base {
	public static WebElement update_Button(WebDriver driver) {
		return driver.findElement(getlocator("update"));
	}

}
