package Utility;

import org.openqa.selenium.support.PageFactory;

import Helper.Base;
import POM.AdminLoginPage;

public class utility extends Base{

	
	public void adminLogin(String username, String pwd) throws InterruptedException {
		AdminLoginPage alp = PageFactory.initElements(driver, AdminLoginPage.class);
		alp.getEmailIdTxtBx().clear();
		alp.getEmailIdTxtBx().sendKeys(username);
		Thread.sleep(3000);
		alp.getPwdTxtBx().clear();
		alp.getPwdTxtBx().sendKeys(pwd);
		alp.getLoginBtn().click();
	}
	
	
}
