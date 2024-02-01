package AdminTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AdminDashBoardPage;
import Utility.utility;

public class LoginTests extends Base{
	public String sheetname = "sheetname";
  @Test
  public void verifyAdminIsLoginWithValidCred() throws IOException, InterruptedException {
	  utility util = new utility();
	  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
	  AdminDashBoardPage adp = PageFactory.initElements(driver, AdminDashBoardPage.class);
	  boolean actual = adp.getDbTitle().isDisplayed();
	  Assert.assertTrue(actual);
  }
}
