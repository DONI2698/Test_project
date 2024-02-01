package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewCustomerPage {
	private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon far fa-user']")
    private WebElement customerIcon;

    @FindBy(xpath = "//p[text()=' Customers']")
    private WebElement customerOption;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    private WebElement gender;

    @FindBy(xpath = "//span[@aria-controls='DateOfBirth_dateview']")
    private WebElement dateOfBirthButton;

    @FindBy(xpath = "//div[@id='DateOfBirth_dateview']")
    private WebElement dateOfBirthPicker; 

    @FindBy(xpath = "//a[@aria-live='assertive']")
    private WebElement currentMonthYear;

    @FindBy(xpath = "//a[@aria-label='Previous']")
    private WebElement previousButton;

    @FindBy(xpath = "//a[@data-value='1998/7/17']")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='Company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id='IsTaxExempt']")
    private WebElement taxBox;

    @FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
    private WebElement newsLetter; 
    
    @FindBy(xpath = "//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li[1]")
    private WebElement newsLetterOption;

    @FindBy(xpath = "//textarea[@id='AdminComment']")
    private WebElement adminComment;

    public AddNewCustomerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickCustomerIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(customerIcon)).click();
    }

    public void clickCustomerOption() {
        wait.until(ExpectedConditions.elementToBeClickable(customerOption)).click();
    }

    public void clickAddNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
    }

    public void fillEmail(String emailAddress) {
        wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(emailAddress);
    }

    public void fillPassword(String passwordValue) {
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(passwordValue);
    }

    public void fillFirstName(String firstNameValue) {
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(firstNameValue);
    }

    public void fillLastName(String lastNameValue) {
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lastNameValue);
    }

    public void clickGender() {
        wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
    }

    public void clickDateOfBirthButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthButton)).click();
    }

    public void waitDateOfBirthPickerVisibility() {
        wait.until(ExpectedConditions.visibilityOf(dateOfBirthPicker));
    }

    public String getCurrentMonthYear() {
        return currentMonthYear.getText();
    }

    public void clickPreviousButton() {
        wait.until(ExpectedConditions.elementToBeClickable(previousButton)).click();
    }

    public void clickDateOfBirth() {
        dateOfBirth.click();
    }

    public void fillCompanyName(String companyNameValue) {
        wait.until(ExpectedConditions.elementToBeClickable(companyName)).sendKeys(companyNameValue);
    }

    public void clickTaxBox() {
        wait.until(ExpectedConditions.elementToBeClickable(taxBox)).click();
    }

    public void clickNewsLetter() {
        wait.until(ExpectedConditions.elementToBeClickable(newsLetter)).click();
    }
    
    public void selectNewsLetterOption() {
        wait.until(ExpectedConditions.elementToBeClickable(newsLetterOption)).click();
    }
    
    public void fillAdminComment(String adminCommentValue) {
        wait.until(ExpectedConditions.elementToBeClickable(adminComment)).sendKeys(adminCommentValue);
    }
}



