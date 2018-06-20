package Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.BranchesPage;

public class Generic {
	public static void dropDown(WebElement element,String listItem) {
		Select s=new Select(element);
		s.selectByVisibleText(listItem);
		
		
		
	}
	
	public static  Alert alertHandle(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert;
	
	}

}
