package step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Generic;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import modules.Branches;
import modules.Login;
import pageObjects.AdminPage;
import pageObjects.BranchesPage;
import pageObjects.LoginPage;

public class Step_Defination {
	WebDriver driver;
	@Given("^launch the browser$")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://183.82.100.55/ranford1/home.aspx");
	}

	@When("^check the title with \"([^\"]*)\" data$")
	public void check_the_title_with_data(String arg1) {
	String title = driver.getTitle();	
	Assert.assertEquals("RANFORD BANK", title);
		
	}

	@Then("^enter the valid credintial and login$")
	public void enter_the_valid_credintial_and_login(){
		PageFactory.initElements(driver, LoginPage.class);
		Login.login_exe();
		
		
	}

	@When("^close the browser$")
	public void close_the_browser(){
		driver.close();
	}

	@Given("^Launch the browser$")
	public void Launch_the_browser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://183.82.100.55/ranford1/home.aspx");
	}

	@Then("^click on Branches Link and Click on  new Branch link$")
	public void click_on_Branches_Link_and_Click_on_new_Branch_link() {
		PageFactory.initElements(driver, AdminPage.class);
		AdminPage.branchesLink.click();
		PageFactory.initElements(driver, BranchesPage.class);
		BranchesPage.newBranchLink.click();
	}

	@Then("^create branches$")
	public void create_branches() {
		PageFactory.initElements(driver, BranchesPage.class);
		Branches.branchCreation();
	}

	@When("^check branch creatiion successfull or not$")
	public void check_branch_creatiion_successfull_or_not(){
		String text = Generic.alertHandle(driver).getText();
if (text.contains("Created Succesfully")) {
	System.out.println("test is pass"); 
	
	
}else {
	System.out.println("test is failed "); 
	
}
		
	}

	@When("^Close the browser$")
	public void Close_the_browser(){
	
	driver.close();
	}
	
	
	
	
	
}
	


