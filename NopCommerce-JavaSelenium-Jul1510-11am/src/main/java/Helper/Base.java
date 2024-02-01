package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public String propath= ".//src//main//resources//Common//Property.properties";
	public String browser = "browser";
	public String browsername1= "chrome";
	public String browsername2 = "firefox";
	public String chpath = "chromepath";
	public String ffpath = "ffpath";
	public String sspath = "screenshotpath";
	public String tdPath = "tdpath";
	public static WebDriver driver;
	public String url = "url";
	public String min_wait = "min_wait";
	public ChromeOptions options = new ChromeOptions();
	public FirefoxOptions option = new FirefoxOptions();
	
	

	public FileInputStream fis;
	public String getProperty(String name) throws IOException {
		this.fis = new FileInputStream(this.propath);
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(name);	
	}
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  String browser = this.getProperty(this.browser);
	  if(browser.equals(browsername1)) {
		  this.options.addArguments("--disable-notifications");
		  //System.setProperty("webdriver.chrome.driver", this.getProperty(this.chpath));
		  driver = new ChromeDriver(this.options);
	  }
	  else if(browser.equals(browsername2)) {
		  this.option.addPreference("dom.webnotifications.enabled", false);
		  //System.setProperty("webdriver.gecko.driver", this.getProperty(this.ffpath));
		  driver = new FirefoxDriver(this.option);
	  }
	  driver.get(this.getProperty(this.url));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  
//	  driver.quit();
  }
  
  public void takeScreenshot(String name) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File f1 = tk.getScreenshotAs(OutputType.FILE);
	File f2 = new File(this.getProperty(this.sspath)+name+".png");
	FileUtils.copyFile(f1, f2);
  }
  public String getData(String sheetname, int r, int c) throws IOException, IOException {
	  this.fis= new FileInputStream(this.getProperty(this.tdPath));
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet=	wb.getSheet(sheetname);
	  XSSFRow row = sheet.getRow(r);
	  XSSFCell cell = row.getCell(c);
	  return cell.getStringCellValue();
  }
  
  

}
