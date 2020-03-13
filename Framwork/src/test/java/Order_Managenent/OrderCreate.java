package Order_Managenent;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.Menu;
import pages.OM_OrderCreate;
import utility.BaseClass;
import utility.ExcelDataProvider;

@Listeners(utility.Listener.class)
public class OrderCreate extends BaseClass {

	@BeforeTest
	public void navigateToCreateOrder() throws InterruptedException {
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		menu.Accessory();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		menu.MerchandisingSupport();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		menu.Order();
		menu.CreaetOrder();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
	}

	@Test(dataProvider = "CreateBaseOrder")
	public void createBaseOrder(String CustomerName, String po, String BuyerName, String BrandName, String OrderType,
			String OrderNo, String itemtype, String bic, String OrderQty, String Deparment, String Season,
			String StyleNo, String StyleName, String CustomerContact, String AppStatus) throws Exception {
		
		OM_OrderCreate OrderCreate = PageFactory.initElements(driver, OM_OrderCreate.class);

		System.out.println("Order No: " + OrderNo + ", OrderType: " + OrderType + ", ItemType: " + itemtype);

		wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));

		OrderCreate.SelectCustomer(CustomerName);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));

		OrderCreate.InserCustomerPO(po);
		OrderCreate.SelectBuyer(BuyerName);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		OrderCreate.SelectBrand(BrandName);
		OrderCreate.SelectOrderType(OrderType);
		OrderCreate.InserOrderNo(OrderNo);

		OrderCreate.SelectDepartment(Deparment);
		OrderCreate.SelectSeason(Season);

		OrderCreate.InsertStyleNo(StyleNo);
		OrderCreate.InsertStyleName(StyleName);

		OrderCreate.SelectCustomerContact(CustomerContact);

		OrderCreate.SelectDeliveryAddress();
		OrderCreate.OpenBicPopup();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		OrderCreate.SearchByBIC(bic);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		OrderCreate.ClickOkButtonInBICPopup();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		OrderCreate.InsertOrderQrt(OrderQty);
		OrderCreate.SelectApprovalStatus(AppStatus);

		if (itemtype.equals("Care")) {
			OrderCreate.SelectComposition();
			OrderCreate.SelectCareInstructions();
			OrderCreate.SelectAdditionalInfos();
		}
		if (itemtype.equals("Size")) {
			OrderCreate.OpenSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
			OrderCreate.SelectSizes();
			OrderCreate.InsertSizeWiseOrderQty(OrderQty);
			OrderCreate.ClickOkButtonInSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
		}
		if (itemtype.equals("Main & Size") || itemtype.equals("Main with Size")) {
			OrderCreate.OpenSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
			OrderCreate.SelectSizes();
			OrderCreate.InsertSizeWiseOrderQty(OrderQty);
			OrderCreate.ClickOkButtonInSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
		}
		if (itemtype.equals("Care & Size") || itemtype.equals("Care With Size")) {
			OrderCreate.SelectComposition();
			OrderCreate.SelectCareInstructions();
			OrderCreate.SelectAdditionalInfos();

			OrderCreate.OpenSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
			OrderCreate.SelectSizes();
			OrderCreate.InsertSizeWiseOrderQty(OrderQty);
			OrderCreate.ClickOkButtonInSizePopup();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			Thread.sleep(1000);
		}

	//	OrderCreate.SaveOrder();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
		OrderCreate.AddNewOrder();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
		Thread.sleep(1000);
	}

	@DataProvider(name = "CreateBaseOrder")
	public Object[][] getData() throws Exception {
		String excelPath = projectPath + "\\Excel_Data\\Order.xlsx";
		String sheetName = "CreateBaseOrder";
		Object data[][] = ExcelDataProvider.getDataFromExcel(excelPath, sheetName);
		return data;
	}

}
