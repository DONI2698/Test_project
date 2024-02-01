package AdminTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AddNewCustomerPage;
import Utility.utility;

public class AddNewCustomerTests extends Base  {
	public String sheetname = "sheetname";
	
	  @Test
	  public void verifyAddNewCustomer() throws IOException, InterruptedException {
		  
		  utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
	      
		  
		  AddNewCustomerPage addNewCustomerPage = PageFactory.initElements(driver, AddNewCustomerPage.class);
		  
		  addNewCustomerPage.clickCustomerIcon();
	      addNewCustomerPage.clickCustomerOption();
	      addNewCustomerPage.clickAddNewButton();
	      
	      addNewCustomerPage.fillEmail("test@example.com");
	      addNewCustomerPage.fillPassword("password123");
	      addNewCustomerPage.fillFirstName("Doni");
	      addNewCustomerPage.fillLastName("leo");
	      addNewCustomerPage.clickGender();
	      
	      addNewCustomerPage.clickDateOfBirthButton();
	      addNewCustomerPage.waitDateOfBirthPickerVisibility();
	      
	      while (!addNewCustomerPage.getCurrentMonthYear().equals("DEC 1998")) {
	    	  addNewCustomerPage.clickPreviousButton();
	    	  
	      }
	      
	      addNewCustomerPage.clickDateOfBirth();
	     
	      addNewCustomerPage.fillCompanyName("ABC Inc");
	      addNewCustomerPage.clickTaxBox();
	      
	      addNewCustomerPage.clickNewsLetter();
	      addNewCustomerPage.selectNewsLetterOption();
	     
	      addNewCustomerPage.fillAdminComment("Test comment");
	      
	  }
  

  }
  
