package modules;

import pageObjects.LoginPage;

public class Login {
	public static void login_exe() {
		LoginPage.usernameTb.sendKeys("Admin");
		LoginPage.passwordTB.sendKeys("Admin");
		LoginPage.loginBTN.click();
	}

}
