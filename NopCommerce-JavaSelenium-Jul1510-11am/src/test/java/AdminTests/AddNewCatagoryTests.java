package AdminTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AddNewCatagoryPage;
import Utility.utility;

public class AddNewCatagoryTests extends Base{
	public String sheetname = "sheetname";
	
	  @Test
	  public void verifyAddNewCatagory() throws IOException, InterruptedException {
		  
		  utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
	      

	      
		  AddNewCatagoryPage addNewCatagoryPage = PageFactory.initElements(driver, AddNewCatagoryPage.class);

		  addNewCatagoryPage.clickCatalogIcon();
	      addNewCatagoryPage.clickCategoriesOption();
	      addNewCatagoryPage.clickAddNewButton();
	      
	      addNewCatagoryPage.fillProductName("YourProduct");
	      addNewCatagoryPage.switchToFullDescriptionFrame();
	      addNewCatagoryPage.fillFullDescription("YourProductDescription");
	      addNewCatagoryPage.switchToDefaultContent();
	      
	      addNewCatagoryPage.clickCategoryElement();
	      addNewCatagoryPage.clickAddElement();

	      
	      String filePath = "C:\\Users\\dell\\Downloads\\NopCommerce-JavaSelenium-Jul1510-11am\\src\\main\\resources\\TestData\\google-pixel-8-pro.png";
	      addNewCatagoryPage.uploadFile(filePath);
	      
	  
  }
}
