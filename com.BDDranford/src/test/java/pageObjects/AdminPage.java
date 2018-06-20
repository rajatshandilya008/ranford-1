package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
	
	@FindBy(how=How.XPATH,using="//a[@href='admin_banker_master.aspx']")
	public static WebElement branchesLink;

}
