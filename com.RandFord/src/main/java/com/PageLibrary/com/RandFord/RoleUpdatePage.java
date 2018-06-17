package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class RoleUpdatePage extends Base {
	public static WebElement update_button(WebDriver driver){
		return driver.findElement(getlocator("update"));
		
		
	}

}
