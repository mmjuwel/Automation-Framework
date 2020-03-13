package Order_Managenent;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Configuration.Configure_Browser;
import Configuration.ERP_LogIn;
import utility.ExcelDataProvider;

public class OrderVarification {

	String projectPath = System.getProperty("user.dir");
	String excelPath = projectPath + "\\Excel_Data\\CreateOrder.xlsx";
	String sheetName = "VerifyOrder";

	public WebDriverWait wait;
	public WebDriver driver;
	public String baseUrl;
	public String browser;
	public String lg_userName;
	public String lg_passwprd;

	OrderVarification() throws Exception {

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(projectPath + "/src/Master_Setup/Configration.properties");
		prop.load(input);
		browser = prop.getProperty("browser");
		baseUrl = prop.getProperty("baseUrl");
		lg_userName = prop.getProperty("userName");
		lg_passwprd = prop.getProperty("passwprd");

		Configure_Browser Conf_browser = new Configure_Browser();
		driver = Conf_browser.config(browser);
	}

	@BeforeTest()
	public void NavigateToVerifyOrderg() throws InterruptedException {
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ERP_LogIn login = new ERP_LogIn();
		login.LogIn_Test_Env(driver, baseUrl, lg_userName, lg_passwprd);

		// Navigate to BIC
		WebElement accessoris = driver.findElement(By.cssSelector("#niMenu li:nth-child(1)  > a"));
		accessoris.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		WebElement ms = driver.findElement(By.id("100000350"));
		ms.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		WebElement Ordervarification = driver.findElement(By.id("100000764"));
		Ordervarification.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));

	}

	@Test(dataProvider = "varifyOder")
	public void VerifyOrder(String cust, String buyer, String Orderno) throws InterruptedException {
		
		System.out.println("Order No: "+Orderno);
		
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * WebElement SearchCust= driver.findElement(By.
		 * cssSelector("div > div:nth-child(1) > div:nth-child(1) > div > div > a "
		 * )); SearchCust.click(); driver.findElement(By.
		 * cssSelector("div:nth-child(1) > div:nth-child(1) > div > div > div > div>input"
		 * )).sendKeys(cust); driver.findElement(By.
		 * cssSelector(".ui-select-choices-row-inner > div:nth-child(1)")).click
		 * (); wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(
		 * "overlay-background")));
		 * 
		 * WebElement Searchbuyer= driver.findElement(By.
		 * cssSelector("div > div:nth-child(1) > div:nth-child(2) > div > div > a "
		 * )); Searchbuyer.click(); driver.findElement(By.
		 * cssSelector("div:nth-child(1) > div:nth-child(2) > div > div > div > div>input"
		 * )).sendKeys(buyer); driver.findElement(By.
		 * cssSelector(".ui-select-choices-row-inner > div:nth-child(1)")).click
		 * (); wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(
		 * "overlay-background")));
		 * 
		 * 	 */
		  WebElement SearchOrderNo= driver.findElement(By.cssSelector("div > div:nth-child(3) > div:nth-child(2) > div > div > a ")); 
		  SearchOrderNo.click(); driver.findElement(By.
		  cssSelector("div:nth-child(3) > div:nth-child(2) > div > div > div > div>input")).sendKeys(Orderno); 
		  driver.findElement(By.cssSelector(".ui-select-choices-row-inner > div:nth-child(1)")).click();
		  driver.findElement(By.cssSelector("button.btn-primary")).click();
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
	

		if (cust.equals("") && buyer.equals("") && Orderno.equals("")) {
			driver.findElement(By.cssSelector("tbody > tr:nth-child(1) > td.p-none > ul > li > a > i")).click();
		} else {
			driver.findElement(By.cssSelector("tbody > tr > td.p-none > ul > li > a")).click();
		}
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		WebElement verify = driver
				.findElement(By.cssSelector("form > div:nth-child(4) > div > div > div > div > button:nth-child(2)"));
		verify.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(2000);

	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

	@DataProvider(name = "varifyOder")
	public Object[][] getData() throws Exception {
		Object data[][] = ExcelDataProvider.getDataFromExcel(excelPath, sheetName);
		return data;
	}

}
