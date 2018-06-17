package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class AdminPage extends Base {
	public static WebElement branches_link(WebDriver driver){
		return driver.findElement(getlocator("branches"));
		}
	
	public static WebElement roles_link(WebDriver driver){
		return driver.findElement(getlocator("roles"));		
	}
	
	public static WebElement users_link(WebDriver driver){
		return driver.findElement(getlocator("users"));
	}

	public static WebElement employee_link(WebDriver driver){
		return driver.findElement(getlocator("employee"));
	}
	
	public static WebElement newBranch_link(WebDriver driver){
		return driver.findElement(getlocator("newBranch"));
	}
	
	public static WebElement newEmp_link(WebDriver driver){
		return driver.findElement(getlocator("newEmployee"));
	}
}
