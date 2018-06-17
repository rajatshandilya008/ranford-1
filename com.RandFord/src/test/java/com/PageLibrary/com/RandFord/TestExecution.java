package com.PageLibrary.com.RandFord;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.ExcelDataDriven;

public class TestExecution extends Repository {
@Parameters("browser")
	@BeforeTest
		public void verify_launch(String browser) {
		launch(browser);
}
	@Test(priority=2)
	public void verify_login() {
		login();
	}
/*@Test(priority=2)
	public void Varify_excelcontent() {
		ExcelDataDriven.excelconnection("exceldata1.xls", "BranchSheet");
		ExcelDataDriven.outputexcelconnection("exceldata1.xls", "outputfile.xls", "BranchSheet");

		int c = ExcelDataDriven.ccount();
		for (int r = 1; r < ExcelDataDriven.rcount(); r++) {
			branchCreation(ExcelDataDriven.readdata(0, r), ExcelDataDriven.readdata(1, r), ExcelDataDriven.readdata(2, r),ExcelDataDriven.readdata(3, r),ExcelDataDriven.readdata(4, r),ExcelDataDriven.readdata(5, r),ExcelDataDriven.readdata(6, r),ExcelDataDriven.readdata(7, r),ExcelDataDriven.readdata(8, r));
			String text = Generic.handlePopUp(driver).getText();
			Generic.handlePopUp(driver).accept();
			if(text.contains("created Sucessfully")) {
				ExcelDataDriven.writedada(c++, r, "Test Passed");
				c--;
			}else if(text.contains("already Exist")){
				ExcelDataDriven.writedada(c++, r, "Test FAiled");
				c--;
			}else {
				ExcelDataDriven.writedada(c++, r, "Alert not present");
			}


		}

ExcelDataDriven.saveworkbook();
	}



	@Test(priority=2,dataProvider="branches")
	public void verify_branchCreation(String bname,String address1,String address2,String address3,String area,String zipcode,String country,String state,String city) throws InterruptedException {
		branchCreation(bname,address1,address2,address3,area,zipcode,country,state,city);
	}
	@Test(priority=3,dataProvider="role")
	public void varify_rolesCreation(String rolename, String roleDesc, String roleType) {
		roleCreation(rolename,roleDesc,roleType);

	}
	
	@Test(priority=3)
	public void verify_rolesCreation() {
		roleCreation();
	}

	@Test(priority=4,invocationCount=0)
	public void verify_userCreation() {
		userCreation();
	}
	@Test(priority=5)
	public void verify_employeeCreation() {
		employeeCreation();
	}
	@Test(priority=6)
	public void varify_BranchTableEdit() {
		editFromBranchTable();
	}
	@Test(priority=7)
	public void varify_userTableEdit() {
		editUsersTable();
		}

	@Test(priority=8)
	public void varify_RolesTableEdit() {

		editRolesTable();
	}
	@Test(priority=9)
	public void varify_employeeTableEdit() {
		editEmployeeTable();
	}
	 
	@DataProvider(name="branches")
public String[][] verify_Branchexcelcontent(){
	return excelcontent("exceldata1.xls","BranchSheet");
}

@DataProvider(name="role")
public String[][]  varify_Rolesexcelcontent() {
return	excelcontent("exceldata1.xls", "RolesSheet");
}
	 
*/}