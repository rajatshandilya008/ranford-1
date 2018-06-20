package modules;

import Utility.Generic;
import pageObjects.BranchesPage;

public class Branches {
	public static void branchCreation(){
		
		BranchesPage.branchNameTB.sendKeys("asdaasasdada");
		BranchesPage.add1TB.sendKeys("adaddda");
		BranchesPage.zipTB.sendKeys("12345");
		
       Generic.dropDown(BranchesPage.countryDropDown, "INDIA");
       Generic.dropDown(BranchesPage.stateDropDown, "GOA");
       Generic.dropDown(BranchesPage.cityDropDown, "GOA");
       BranchesPage.submitBTN.click();
       
		
		
	}

}
