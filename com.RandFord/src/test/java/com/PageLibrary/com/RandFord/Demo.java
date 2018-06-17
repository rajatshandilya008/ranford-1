package com.PageLibrary.com.RandFord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void m(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\project_BTM\\com.RandFord\\src\\test\\java\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		}else {
		
		System.setProperty("webdriver.chrome.driver","F:\\project_BTM\\com.RandFord\\src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
		driver.get("http://www.google.com");

}
}
