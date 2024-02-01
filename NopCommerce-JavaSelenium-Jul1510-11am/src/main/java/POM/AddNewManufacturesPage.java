package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewManufacturesPage {
	private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    private WebElement catalogIcon;

    @FindBy(xpath = "//p[text()=' Manufacturers']")
    private WebElement manufacturersOption;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Name']")
    private WebElement manufacturesName;

    @FindBy(xpath = "//iframe[@id='Description_ifr']")
    private WebElement fullDescriptionFrame;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement fullDescription;

    @FindBy(xpath = "//div[text()='Upload a file']")
    private WebElement uploadFile;

    // 6 time increase
    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[2]")
    private WebElement priceFrom;

    // 10 times increase
    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[3]")
    private WebElement priceTo;

    // 5 times
    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[4]")
    private WebElement displyOrder;

    @FindBy(xpath = "(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[1]")
    private WebElement limitedToCustomerRoles;

    @FindBy(xpath = "(//li[@data-offset-index='0'])[1]")
    private WebElement addElementLTCR;

    @FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[3]")
    private WebElement limitedToStores; 

    @FindBy(xpath = "//ul[@id='SelectedStoreIds_listbox']/li[1]")
    private WebElement addElementLTS; 

    @FindBy(xpath = "//input[@id='SeName']")
    private WebElement searchEngineName;

    @FindBy(xpath = "//input[@id='MetaTitle']")
    private WebElement metaTitle;

    @FindBy(xpath = "//input[@id='MetaKeywords']")
    private WebElement metaKeywords;

    @FindBy(xpath = "//textarea[@id='MetaDescription']")
    private WebElement metaDescription;

    public AddNewManufacturesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickCatalogIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(catalogIcon)).click();
    }

    public void clickManufacturersOption() {
        wait.until(ExpectedConditions.elementToBeClickable(manufacturersOption)).click();
    }

    public void clickAddNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
    }

    public void enterManufacturerName(String name) {
        wait.until(ExpectedConditions.visibilityOf(manufacturesName)).sendKeys(name);
    }

    public void switchToFullDescriptionFrame() {
        driver.switchTo().frame(fullDescriptionFrame);
    }

    public void fillFullDescription(String description) {
        wait.until(ExpectedConditions.elementToBeClickable(fullDescription)).sendKeys(description);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void uploadFile(String filePath) {
        WebElement uploadFileElement = wait.until(ExpectedConditions.elementToBeClickable(uploadFile));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", uploadFileElement);

        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
        fileInput.sendKeys(filePath);
    }

    public void increasePriceFrom() {
        for (int i = 0; i < 6; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(priceFrom)).click();
        }
    }

    public void increasePriceTo() {
        for (int i = 0; i < 10; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(priceTo)).click();
        }
    }

    public void increaseDisplayOrder() {
        for (int i = 0; i < 5; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(displyOrder)).click();
        }
    }

    public void selectLimitedToCustomerRoles() {
        wait.until(ExpectedConditions.elementToBeClickable(limitedToCustomerRoles)).click();
    }

    public void clickElementToLimitedCustomerRoles() {
        wait.until(ExpectedConditions.elementToBeClickable(addElementLTCR)).click();
    }

    public void selectLimitedToStores() {
        WebElement limitedToStores = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[3]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", limitedToStores);
        
        wait.until(ExpectedConditions.elementToBeClickable(limitedToStores)).click();
    }

    public void clickElementToLimitedToStores() {
        wait.until(ExpectedConditions.elementToBeClickable(addElementLTS)).click();
    }
    
    public void enterSearchEngineName(String name) {
        wait.until(ExpectedConditions.visibilityOf(searchEngineName)).sendKeys(name);
    }

    public void enterMetaTitle(String title) {
        wait.until(ExpectedConditions.visibilityOf(metaTitle)).sendKeys(title);
    }

    public void enterMetaKeywords(String keywords) {
        wait.until(ExpectedConditions.visibilityOf(metaKeywords)).sendKeys(keywords);
    }

    public void enterMetaDescription(String description) {
        wait.until(ExpectedConditions.visibilityOf(metaDescription)).sendKeys(description);
    }
}



