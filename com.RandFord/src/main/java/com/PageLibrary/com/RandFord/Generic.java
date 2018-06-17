package com.PageLibrary.com.RandFord;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;
public class Generic {
	public static void dropdown(WebDriver driver, By prop, String exp) {
		Select s = new Select(driver.findElement(prop));
		List<WebElement> options = s.getOptions();
		for (WebElement op : options) 
		{
			String acttext = op.getText();
			if (acttext.contains(exp)) 
			{
				s.selectByVisibleText(exp);
				break;
			}
		}
	}
	public static Select dropdown2(WebDriver driver, By prop) 
	{
		Select s = new Select(driver.findElement(prop));
		return s;
	}
	public static Alert handlePopUp(WebDriver driver) 
	{
		return driver.switchTo().alert();
	}
}
