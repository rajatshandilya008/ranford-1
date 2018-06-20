package com.PageLibrary.com.RandFord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

import Excel.ExcelDataDriven;
import Utility.Library;
import Utility.Validation;
import baseTest.Base;
import webtable.Table;
public class Repository extends Base {
	WebDriver driver;
	public void login() {
		HomePage.userName_text(driver).sendKeys("Admin");
		HomePage.password_text(driver).sendKeys("Admin");
		HomePage.login(driver).click();
		if (Validation.IsTextPresent(driver, "Welcome to Admin")) {
			Reporter.log("Login Test is Pass");
		}else {
			Reporter.log("Login is failed");
			Library.screenshort("login_failed");
		}
	}
	public void launch(String browser) 
	{
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/java/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}else {
			System.setProperty("webdriver.gecko.driver", "./src/test/java/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		 
		driver.get("http://183.82.100.55/ranford1/home.aspx");
		driver.manage().window().maximize();
		if (Validation.IsTextPresent(driver, "Welcome to Personalized Banking")) 
		{
			Reporter.log("Launch Test is Pass");
		}else {
			Reporter.log("Launch is failed");
			Library.attachment("launch");
		}
		 
	}
	public void branchCreation(String bname,String address1,String address2,String address3,String area,String zipcode,String country,String state,String city)   {
		AdminPage.branches_link(driver).click();
		AdminPage.newBranch_link(driver).click();
		NewBranchesPage.branchName_text(driver).sendKeys(bname);
		NewBranchesPage.address1_text(driver).sendKeys(address1);
		NewBranchesPage.address2_text(driver).sendKeys(address2);
		NewBranchesPage.address3_text(driver).sendKeys(address3);
		NewBranchesPage.area_text(driver).sendKeys(area);
		NewBranchesPage.zipcode_text(driver).sendKeys(zipcode);
		Generic.dropdown(driver, getlocator("country"), "INDIA");
		Generic.dropdown(driver, getlocator("state"), "GOA");
		Generic.dropdown(driver, getlocator("city"), "GOA");
		NewBranchesPage.submitBranch(driver).click();
		/*if (Validation.isAlertPresent(driver, "created Sucessfully")) {

			Reporter.log("BranchCreation Test is pass");
		}else {
			Reporter.log("BranchCreation Test is failed");
			Library.attachment("branch_creation");
		}
		Generic.handlePopUp(driver).accept();*/
	}
	public void roleCreation(String rolename, String roleDesc, String roleType) {
		AdminPage.roles_link(driver).click();
		NewRolePage.newRoles_text(driver).click();
		NewRolePage.roleName_text(driver).sendKeys(rolename);
		NewRolePage.roleDesc_text(driver).sendKeys(roleDesc);
		Generic.dropdown(driver, getlocator("roleType"), roleType);
		NewRolePage.submitRole(driver).click();
		/*if (Validation.isAlertPresent(driver, "Created Sucessfully")) {
			Reporter.log("Role Creation Test is pass");
		}else {
			Reporter.log("Role Creation Test is failed");
			Library.screenshort("roleCreation_failed");
		}
		Generic.handlePopUp(driver).accept();*/
	}
	public void userCreation() {
		AdminPage.users_link(driver).click();
		NewUserPage.newUser_text(driver).click();
		Generic.dropdown(driver, getlocator("lst_Roles"),"Analyst");
		Generic.dropdown(driver,getlocator("lst_Branch"),"BTM");
		Generic.dropdown(driver,getlocator("DrCName"),"");
		NewUserPage.customer_name(driver).sendKeys("");
		NewUserPage.user_name(driver).sendKeys("");
		NewUserPage.login_password(driver).sendKeys("");
		NewUserPage.transaction_password(driver).sendKeys("");
		NewUserPage.submitUser(driver).click();
		if (Validation.isAlertPresent(driver,"Created Sucessfully")) {
			Reporter.log("User Creation Test is pass");
		}else {
			Reporter.log("User Creation Test is failed");
			Library.attachment("userCreation_failed");
		}
		Generic.handlePopUp(driver);
	}

	public void employeeCreation() {
		AdminPage.employee_link(driver).click();
		AdminPage.newEmp_link(driver).click();
		NewEmployeePage.empName_Button(driver).sendKeys("aaaabbbb");
		NewEmployeePage.empPass_Button(driver).sendKeys("abcABC");
		Generic.dropdown(driver, getlocator("empRoles"), "exec");
		Generic.dropdown(driver, getlocator("empBranch"), "BTM");
		NewEmployeePage.empSubmit_Button(driver).click();
		if (Validation.isAlertPresent(driver, "New Employer Created")) {
			Reporter.log("emp creation test is pass");

		}else {
			Reporter.log("emp creation test is fail");
			Library.attachment("empCreation ");
		}
		Generic.handlePopUp(driver);
	}



	public void editFromBranchTable() {
		AdminPage.branches_link(driver).click();
		Table.tableOperation(driver, getlocator("tableBankdetail"), "edit", "78");
		BranchUpdationPage.update_Btn(driver).click();
		if (Validation.isAlertPresent(driver, "Branch updated Sucessfully") ){
			Reporter.log("VarifyTableEdit test is passed ");
		}else {
			Reporter.log("VarifyTableEdit test is failed");
			Library.attachment("tableEdit_failed");
		}
		Generic.handlePopUp(driver);
	}
	public void deleteFromBranchTable() {
		AdminPage.branches_link(driver).click();
		Table.tableOperation(driver, getlocator("tableBankdetail"), "delete", "78");
		Generic.handlePopUp(driver);
		if (Validation.isAlertPresent(driver, "") ){
			Reporter.log("VarifyTabledelete test is passed ");
		}else {
			Reporter.log("VarifyTabledelete test is failed");
			Library.attachment("tableDelete_failed");
		}
		Generic.handlePopUp(driver);
	}
	/*public void tableupdate() {
		editFromBranchTable();
		BranchUpdationPage.updateBranchName_text(driver).sendKeys("dasdads");
		BranchUpdationPage.updateAdd1_text(driver).sendKeys("adasdasdasd");
		BranchUpdationPage.updateAdd2_text(driver).sendKeys("adaadadd");
		BranchUpdationPage.updateAdd3_text(driver).sendKeys("dsadasd");
		BranchUpdationPage.updateArea_text(driver).sendKeys("asdsadsadasd");
		BranchUpdationPage.updateZipcode_text(driver).sendKeys("23458");
		Generic.dropdown(driver, getlocator("updateCountry"), "INDIA");
		Generic.dropdown(driver, getlocator("updateState"), "GOA");
		Generic.dropdown(driver, getlocator("updateCity"), "GOA");
		BranchUpdationPage.update_Btn(driver).click();
		if (Validation.isAlertPresent(driver, "Branch updated Sucessfully")) {
			Reporter.log("update Table pass");
		}else {
			Reporter.log("update table failed");
			Library.attachment("Table_dataUpdate");
		}
		Generic.handlePopUp(driver);
	}*/
	public void editRolesTable(){
		AdminPage.roles_link(driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Table.tableOperation(driver, getlocator("tableRoles"), "edit", "100");
		RoleUpdatePage.update_button(driver).click();
		if(Validation.isAlertPresent(driver, "New Role updated Sucessfully")) {
			Reporter.log("role edit test pass");
		}else {
			Reporter.log("role edit test failed");
			Library.attachment("roleEdit_failed");
		}
		Generic.handlePopUp(driver);
	}
	public void deleteRoleTable() {
		AdminPage.roles_link(driver).click();
		Table.tableOperation(driver, getlocator("tableRoles"), "delete", "17");
		Generic.handlePopUp(driver);
		if (Validation.isAlertPresent(driver, "")) {
			Reporter.log("delete role table test is pass");
		}else {
			Reporter.log("delete role table test is failed");
			Library.attachment("delete Role Table");
		}
	}
	public void editUsersTable() {
		AdminPage.roles_link(driver).click();
		Table.tableOperation(driver, getlocator("tableUsers"), "edit", "40");
		UserUpadationPage.update_button(driver).click();
		if(Validation.isAlertPresent(driver, "User Details updated Sucessfully")) {
			Reporter.log("edituser test pass");
		}else {
			Reporter.log("edit user test is failed");
			Library.attachment("editUser_failed");		
		}
	}
	public void deleteUserTable() {
		AdminPage.roles_link(driver).click();
		Table.tableOperation(driver, getlocator("tableUsers"),"delete", "24");
		Generic.handlePopUp(driver);
		if (Validation.isAlertPresent(driver, "")) {
			Reporter.log("");
		}else {
			Reporter.log("");
			Library.attachment("");
		}
		Generic.handlePopUp(driver);
	}
	public void editEmployeeTable() {
		AdminPage.employee_link(driver).click();
		Table.tableOperation(driver, getlocator("tableemployee"), "edit", "742");
		EmployeeUpdationPage.update_Button(driver).click();
		if (Validation.isAlertPresent(driver, "Updated Successfully")) {
			Reporter.log("edit employee table is pass");
		}else {
			Reporter.log("edit employee table is fail");
			Library.attachment("editEmployee Table");
			Generic.handlePopUp(driver);
		}
	}
	public void deleteEmployeeTable() {
		AdminPage.employee_link(driver).click();
		Table.tableOperation(driver, getlocator("tableemployee"), "delete", "2104");	
		Generic.handlePopUp(driver);
		if (Validation.isAlertPresent(driver, "")) {
			Reporter.log("delete employee table is paas");
		}else {
			Reporter.log("delete employee test is fail ");
			Library.attachment("delete employee table ");
		}
		Generic.handlePopUp(driver);
	}

	public String[][] excelcontent(String filename,String sheetname){
		Excel.ExcelDataDriven.excelconnection(filename, sheetname);
		int rc = ExcelDataDriven.rcount();
		System.out.println("rowsss"+rc);
		int cc = ExcelDataDriven.ccount();
		System.out.println("colums"+cc);
		String [][] data=new String[rc-1][cc];
		for (int r = 1; r < rc; r++) {
			for (int c = 0; c < cc; c++) {
				data[r-1][c]=ExcelDataDriven.readdata(c, r);
				//System.out.println(data);

			}

		}

		return data;
	}





}