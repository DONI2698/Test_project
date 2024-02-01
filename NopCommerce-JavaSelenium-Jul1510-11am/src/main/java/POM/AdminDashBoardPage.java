package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.Base;

public class AdminDashBoardPage extends Base {

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DbTitle;

	public WebElement getDbTitle() {
		return DbTitle;
	}
	
	
}
