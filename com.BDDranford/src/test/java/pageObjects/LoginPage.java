package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how=How.ID,using="txtuId")
public static WebElement usernameTb;	
	
	@FindBy(how=How.ID,using="txtPword")
	public static WebElement passwordTB;
	
	
	@FindBy(how=How.ID,using="login")
	public static WebElement loginBTN;
	

}
