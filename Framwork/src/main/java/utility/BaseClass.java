package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Configuration.Configure_Browser;
import Configuration.ERP_LogIn;

public class BaseClass {

	public WebDriverWait wait;
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;

	public String projectPath = System.getProperty("user.dir");

	private Properties prop;
	private FileInputStream input;

	private String browser;
	private String environment;
	private String baseUrl;
	private String lg_userName;
	private String lg_passwprd;

	public BaseClass() {

		prop = new Properties();
		try {
			input = new FileInputStream(projectPath + "/Configurations/Configration.properties");
			prop.load(input);
		} catch (Exception e) {
			System.out.println("Unable to find Property File" + e.getMessage());
		}
		
		//import data from property File
		this.browser = prop.getProperty("browser");
		this.environment = prop.getProperty("environment");
		this.baseUrl = prop.getProperty("baseUrl");
		lg_userName = prop.getProperty("userName");
		lg_passwprd = prop.getProperty("passwprd");

		
		Configure_Browser Conf_browser = new Configure_Browser();
		this.driver = Conf_browser.config(browser);

		// Extent HTML Report
		ExtentHtmlReporter extent = new ExtentHtmlReporter(
				projectPath + "\\Reports\\ExtentReport(" + Helper.GetCurrentTime() + ").html");
		extent.config().setDocumentTitle("Next Accessory ERP");
		extent.config().setReportName("Accessory ERP Regression Test Report");
		extent.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(extent);
		

		// Passing General information in HTML report 
		report.setSystemInfo("URL:", baseUrl);
		report.setSystemInfo("Environment:", environment);
		report.setSystemInfo("Login User", lg_userName);

	}

	@BeforeTest
	public void LogIn() throws Exception {
		ERP_LogIn login = new ERP_LogIn();

		if (environment.equals("testing")) {

			try {
				login.LogIn_Test_Env(driver, baseUrl, lg_userName, lg_passwprd);
			} catch (Exception e) {
				System.out.println("Unable to Log In into System" + e.getMessage());
			}
		}
	}

	@AfterMethod
	// @AfterTest
	public void TearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			String screenshotPath = Helper.CaptureScreenshot(driver, result.getName()); // Capture Screenshot
			logger.log(Status.FAIL, "FAILED TEST CASE IS " + result.getName()); // to add name in extent report
			logger.log(Status.FAIL, "ERROR  LOG:  " + result.getThrowable()); // to add error/exception in extent
			logger.addScreenCaptureFromPath(screenshotPath); // adding screen shot
		} 
		else if (ITestResult.SKIP == result.getStatus()) {
			logger.log(Status.SKIP, "SKIPPED TEST CASE IS: " + result.getName()); // to add name in extent report
		} 
		else if (ITestResult.SUCCESS == result.getStatus()) {
			logger.log(Status.PASS, "PASSED TEST CASE IS: " + result.getName()); // to add name in extent report
		}

		// to flash HTML report
		report.flush();
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Test Completed");
	}

}
