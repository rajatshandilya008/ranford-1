package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BranchesPage {
	@FindBy(how=How.ID,using="BtnNewBR")
	public static WebElement newBranchLink;
	
	@FindBy(how=How.ID,using="txtbName") 
	public static WebElement branchNameTB;
	
	@FindBy(how=How.ID,using="txtAdd1")
	public static WebElement add1TB;
	
	
	@FindBy(how=How.ID,using="txtZip")
	public static WebElement zipTB;
	
	
	@FindBy(how=How.ID,using="lst_counrtyU")
	public static WebElement countryDropDown;
	
	
	@FindBy(how=How.ID,using="lst_stateI")
	public static WebElement stateDropDown;
	
	@FindBy(how=How.ID,using="lst_cityI")
	public static WebElement cityDropDown;
	
	
	
	@FindBy(how=How.ID,using="btn_insert")
	public static WebElement submitBTN;

}
