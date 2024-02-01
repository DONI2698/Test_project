package AdminTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AddNewManufacturesPage;
import Utility.utility;

public class AddNewManufacturesTests extends Base {
 
	public String sheetname = "sheetname";
	
	  @Test
	  public void verifyAddNewManufactures() throws IOException, InterruptedException {
		  
		  utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
		  
		 
		  AddNewManufacturesPage addNewManufacturesPage = PageFactory.initElements(driver, AddNewManufacturesPage.class);
		  
		  addNewManufacturesPage.clickCatalogIcon();
		  addNewManufacturesPage.clickManufacturersOption();
		  addNewManufacturesPage.clickAddNewButton();
		        
		  addNewManufacturesPage.enterManufacturerName("Puma");
		        
		  addNewManufacturesPage.switchToFullDescriptionFrame();
		  
		  addNewManufacturesPage.fillFullDescription("Puma shoes are known for their sporty and stylish design, "
		  		+ "offering comfort and performance. With a focus on athletic footwear, "
		  		+ "Puma combines innovative technologies with contemporary aesthetics, "
		  		+ "making their shoes popular for both sports and casual wear.");
		  
		  addNewManufacturesPage.switchToDefaultContent();
		  
		  String filePath = "C:\\Users\\dell\\Downloads\\NopCommerce-JavaSelenium-Jul1510-11am\\src\\main\\resources\\TestData\\PUMA.jpg";
		  addNewManufacturesPage.uploadFile(filePath);
		        
		  addNewManufacturesPage.increasePriceFrom();
		  addNewManufacturesPage.increasePriceTo();
		  addNewManufacturesPage.increaseDisplayOrder();
		        
		  addNewManufacturesPage.selectLimitedToCustomerRoles();
		  addNewManufacturesPage.clickElementToLimitedCustomerRoles();
		  addNewManufacturesPage.selectLimitedToStores();
		  addNewManufacturesPage.clickElementToLimitedToStores();
		       
	      addNewManufacturesPage.enterSearchEngineName("Puma");
	     
	      addNewManufacturesPage.enterMetaTitle("Puma Footwear: Elevate Your Style with Comfort and Performance");
	      
	      addNewManufacturesPage.enterMetaKeywords("Puma, athletic footwear, sports shoes, running sneakers, lifestyle sneakers, Puma performance shoes.");
	      addNewManufacturesPage.enterMetaDescription("Explore the perfect blend of style and functionality with Puma footwear. "
	      		+ "From cutting-edge athletic performance to trendy lifestyle sneakers, discover a range of comfortable and "
	      		+ "dynamic shoes designed to elevate your every step. Step into a world of sporty elegance with Puma.");
		        
	  }
	  
	



	  

  }

