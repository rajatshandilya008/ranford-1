package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.Base;

public class BranchUpdationPage extends Base {
	public static WebElement updateBranchName_text(WebDriver driver) {
		return driver.findElement(getlocator("updateBranchName"));
	}
	public static WebElement updateAdd1_text(WebDriver driver) {
		return driver.findElement(getlocator("updateAddress1"));
	}
	public static WebElement updateAdd2_text(WebDriver driver) {
		return driver.findElement(getlocator("updateAddress2"));
	}
	public static WebElement updateAdd3_text(WebDriver driver) {
		return driver.findElement(getlocator("updateAddress3"));
	}
	public static WebElement updateArea_text(WebDriver driver) {
		return driver.findElement(getlocator("updateArea"));
	}
	public static WebElement updateZipcode_text(WebDriver driver) {
		return driver.findElement(getlocator("updateZipcode"));
	}
	public static WebElement update_Btn(WebDriver driver) {
		return driver.findElement(getlocator("update"));
	}
	public static WebElement cancel_Btn(WebDriver driver) {
		return driver.findElement(getlocator("updateCancel"));
	}
}
