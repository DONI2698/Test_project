package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewCatagoryPage {
	private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    private WebElement catalogIcon;

    @FindBy(xpath = "//p[text()=' Categories']")
    private WebElement categoriesOption;
    
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Name']")
    private WebElement productName;

    @FindBy(xpath = "//iframe[@id='Description_ifr']") ////iframe[@id='Description_ifr']
    private WebElement fullDescriptionFrame;

    @FindBy(xpath = "//body[@id='tinymce']") ////*[@id="tinymce"]
    private WebElement fullDescription;

    @FindBy(xpath = "//select[@id='ParentCategoryId']")
    private WebElement categoryElement;

    @FindBy(xpath = "//select[@id='ParentCategoryId']/option[8]")
    private WebElement addElement;

    @FindBy(xpath = "//div[text()='Upload a file']") ////div[text()='Upload a file']
    private WebElement uploadFile;
    
    
    
    public AddNewCatagoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickCatalogIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(catalogIcon)).click();
    }

    public void clickCategoriesOption() {
    	wait.until(ExpectedConditions.elementToBeClickable(categoriesOption)).click();
    }

    public void clickAddNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
    }

    public void fillProductName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(productName)).sendKeys(name);
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
    
    public void clickCategoryElement() {
        wait.until(ExpectedConditions.elementToBeClickable(categoryElement)).click();
    }

    public void clickAddElement() {
        wait.until(ExpectedConditions.elementToBeClickable(addElement)).click();
    }

    public void uploadFile(String filePath) {
        WebElement uploadFileElement = wait.until(ExpectedConditions.elementToBeClickable(uploadFile));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", uploadFileElement);

        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));

        fileInput.sendKeys(filePath);
    }
    
}


