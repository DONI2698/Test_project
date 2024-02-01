package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.Base;

public class AdminLoginPage extends Base{

	@FindBy(id = "Email")
	WebElement emailIdTxtBx;
	
	@FindBy(name="Password")
	WebElement pwdTxtBx;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement remembermeChBx;
	
	public WebElement getEmailIdTxtBx() {
		return emailIdTxtBx;
	}

	public WebElement getPwdTxtBx() {
		return pwdTxtBx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getRemembermeChBx() {
		return remembermeChBx;
	}
	
	
	
	
	
}
