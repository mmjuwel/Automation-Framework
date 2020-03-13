package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OM_OrderCreate {

	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(1) > div:nth-child(1) > div > div > a")
	WebElement customer;
	@FindBy(how = How.CSS, using = "div:nth-child(1) > div > div > div > div.select2-search > input")
	WebElement inserCustomerName;
	@FindBy(how = How.CSS, using = "div>div.ui-select-dropdown>ul>li>ul>li>div>div.ng-binding")
	WebElement selectCustomer;

	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(1) > div:nth-child(2) > div > input")
	WebElement customerPo;

	// Select Buyer
	@FindBy(how = How.CSS, using = "div > div.panel-body > div > div:nth-child(1) > div:nth-child(4) > div > div > a")
	WebElement buyer;
	@FindBy(how = How.CSS, using = "div:nth-child(4) > div > div > div > div.search-container.select2-search > input")
	WebElement insertBuyerName;
	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(1) > div:nth-child(4) > div > div > div > ul")
	WebElement seelctBuyer;

	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(1) > div:nth-child(5) > div > div > select")
	WebElement brand;

	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(1) > div:nth-child(6) > div > div > select")
	WebElement orderType;

	@FindBy(how = How.CSS, using = "div.dropdown.ni-autocomplete.ng-isolate-scope.ng-valid.ng-valid-maxlength > input")
	WebElement orderNo;

	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(2) > div:nth-child(1) > div > div > input")
	WebElement trackingNo;

	@FindBy(how = How.CSS, using = "div:nth-child(2) > div:nth-child(4) > div > div > select")
	WebElement deparment;

	@FindBy(how = How.CSS, using = "div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div > select")
	WebElement season;

	@FindBy(how = How.CSS, using = "form > fieldset:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(6) > div > input")
	WebElement styleNo;

	@FindBy(how = How.CSS, using = "form > fieldset:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(7) > div > input")
	WebElement styleName;

	@FindBy(how = How.CSS, using = " div:nth-child(4) > div:nth-child(3) > div > div > div > select")
	WebElement customerContact;

	@FindBy(how = How.CSS, using = " div:nth-child(4) > div:nth-child(4) > div:nth-child(2) > div > button > i")
	WebElement openDeliveryDatePopup;
	@FindBy(how = How.CSS, using = "div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(5) > td:nth-child(6) > a")
	WebElement selectDeliveryDate;

	@FindBy(how = How.CSS, using = " div:nth-child(4) > div:nth-child(5) > div:nth-child(2) > div > button > i")
	WebElement openTargetDatePopup;
	@FindBy(how = How.CSS, using = "div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(5) > td:nth-child(6) > a")
	WebElement selectTargetDate;

	@FindBy(how = How.CSS, using = " div:nth-child(6) > div > div > span > button")
	WebElement OpenDeliveryAddress;
	@FindBy(how = How.CSS, using = "div > div.modal-body > form")
	WebElement deliveryAddressPopup;
	@FindBy(how = How.CSS, using = "tbody > tr:nth-child(1) > td.p-none > ul > li")
	 WebElement DelAdd;

	// select_BIC_start
	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(2) > div:nth-child(2) > div > button")
	WebElement bicPopupButton;
	@FindBy(how = How.CSS, using = "div > div.modal-body > form")
	WebElement bicPopup;
	@FindBy(how = How.CSS, using = "div > div:nth-child(3) > div.form-group > div > div > a")
	WebElement bicSearch;
	
	@FindBy(how = How.CSS, using = "div:nth-child(3) > div> div > div > div > div > input")
	WebElement insertBIC;
	@FindBy(how = How.CSS, using = ".ui-select-choices-row-inner > div:nth-child(1)")
	WebElement selectBICForSearch;
	@FindBy(how = How.CSS, using = "div:nth-child(3) > div.btn-group > button:nth-child(1)")
	WebElement searchButton;
	@FindBy(how = How.CSS, using = "tbody > tr:nth-child(1) > td.p-none > div > label > input")
	WebElement selectBICForOrder;
	@FindBy(how = How.CSS, using = "form > div > div > div > div > div > button.btn.btn-primary")
	WebElement okButton;

	@FindBy(how = How.CSS, using = "div > div:nth-child(13) > input")
	WebElement ordQty;

	@FindBy(how = How.CSS, using = "div:nth-child(16) > div > span > button")
	WebElement gridDeliAddBtn;

	@FindBy(how = How.CSS, using = "tbody > tr > td.p-none > ul > li")
	WebElement selectAddInGrid;

	@FindBy(how = How.CSS, using = " div > div:nth-child(17) > div > select")
	WebElement approvalStatus;

	@FindBy(how = How.CSS, using = "form > div:nth-child(4) > div > div > div > div > button:nth-child(3)")
	WebElement saveButton;

	@FindBy(how = How.CSS, using = " form > div:nth-child(4) > div > div > div > div > button:nth-child(1)")
	WebElement addNewOrderButton;

	// Select Size
	@FindBy(how = How.CSS, using = "div.panel-body > div > div:nth-child(4) > div:nth-child(1) > button")
	WebElement selectSizes;
	@FindBy(how = How.XPATH, using = "//div[1]/div/div/div[2]/div[2]/div/label/input")
	WebElement size_S;
	@FindBy(how = How.XPATH, using = "//div[1]/div/div/div[3]/div[2]/div/label/input")
	WebElement size_M;
	@FindBy(how = How.XPATH, using = "//div[1]/div/div/div[4]/div[2]/div/label/input")
	WebElement size_L;
	@FindBy(how = How.CSS, using = "div > div.m-t > button.btn.btn-primary")
	WebElement okBtnToTakeSize;
	@FindBy(how = How.CSS, using = "div:nth-child(2).ni-table-row-group > div:nth-child(1) > div:nth-child(2) > input")
	WebElement qty_S;
	@FindBy(how = How.CSS, using = "div:nth-child(2).ni-table-row-group > div:nth-child(2) > div:nth-child(2) > input")
	WebElement qty_M;
	@FindBy(how = How.CSS, using = "div:nth-child(2).ni-table-row-group > div:nth-child(3) > div:nth-child(2) > input")
	WebElement qty_L;

	// care label
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div> div:nth-child(3) > div > div > div > div > div > div:nth-child(1) > div > a")
	WebElement composition;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div> div:nth-child(3) > div > div > div > div > div > div:nth-child(1) > div > a")
	WebElement AddiComposition;
	@FindBy(how = How.CSS, using = " div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(3) > div > button")
	WebElement careInstruction;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(3) > div > div > div > ul > li:nth-child(2)")
	WebElement careInst1;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(3) > div > div > div > ul > li:nth-child(3)")
	WebElement careInst2;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(4) > div > button")
	WebElement ExtracareInstruction;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(4) > div > div > div > ul > li:nth-child(2)")
	WebElement ExtracareInst1;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(4) > div > div > div > ul > li:nth-child(3)")
	WebElement ExtracareInst2;
	@FindBy(how = How.CSS, using = " div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(5) > div > button")
	WebElement AdditionalInfo;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(5) > div > div > div > ul > li:nth-child(2)")
	WebElement AdditionalInfo1;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div > div > div > div>div:nth-child(3) > div > div > div > div > div > div:nth-child(5) > div > div > div > ul > li:nth-child(3)")
	WebElement AdditionalInfo2;

	// ``````````````````````````````````````

	public void SelectCustomer(String CustomerName) {
		customer.click();
		inserCustomerName.clear();
		inserCustomerName.sendKeys(CustomerName);
		selectCustomer.click();
	}

	public void InserCustomerPO(String po) {
		customerPo.sendKeys(po);
	}

	public void SelectBuyer(String BuyerName) {
		buyer.click();
		insertBuyerName.clear();
		insertBuyerName.sendKeys(BuyerName);
		seelctBuyer.click();
	}

	public void SelectBrand(String BrandName) {
		Select brandName = new Select(brand);
		brandName.selectByVisibleText(BrandName);
	}

	public void SelectOrderType(String OrderType) {
		Select typ = new Select(orderType);
		typ.selectByVisibleText(OrderType);
	}

	public void InserOrderNo(String OrderNo) {
		orderNo.clear();
		orderNo.sendKeys(OrderNo);
	}

	public void InsertTrackingNO(String TrackingNO) {
		trackingNo.sendKeys(TrackingNO);
	}

	public void SelectDepartment(String Deparment) {
		Select Department = new Select(deparment);
		Department.selectByVisibleText(Deparment);

	}

	public void SelectSeason(String Season) {
		Select Buyer_Season = new Select(season);
		Buyer_Season.selectByVisibleText(Season);
	}

	public void InsertStyleNo(String StyleNo) {
		styleNo.sendKeys(StyleNo);
	}

	public void InsertStyleName(String StyleName) {
		styleName.sendKeys(StyleName);
	}

	public void SelectCustomerContact(String CustomerContact) {
		Select CusCont = new Select(customerContact);
		CusCont.selectByVisibleText(CustomerContact);
	}

	public void SelectDeliveryDate() {
		openDeliveryDatePopup.click();
		selectDeliveryDate.click();
	}

	public void SelectTargetDate() {
		openTargetDatePopup.click();
		selectTargetDate.click();
	}

	public void SelectDeliveryAddress() throws Exception {
		OpenDeliveryAddress.click();
		Thread.sleep(2000);
		DelAdd.click();
	}

	public void OpenBicPopup() {
		bicPopupButton.click();
	}

	public void SearchByBIC(String bic) {
		bicSearch.click();
		insertBIC.clear();
		insertBIC.sendKeys(bic);
		selectBICForSearch.click();
		searchButton.click();
	}

	public void SeleclectBICForOrder() {
		selectBICForOrder.click();
	}

	public void ClickOkButtonInBICPopup() {
		okButton.click();
	}

	public void InsertOrderQrt(String OrderQty) {
		ordQty.clear();
		ordQty.sendKeys(OrderQty);
	}

	public void SelectAddressDromGrid() throws InterruptedException {
		gridDeliAddBtn.click();
		Thread.sleep(1000);
		selectAddInGrid.click();
	}

	public void SelectApprovalStatus(String AppStatus) {
		Select AprStatus = new Select(approvalStatus);
		AprStatus.selectByVisibleText(AppStatus);

	}

	public void OpenSizePopup() {
		selectSizes.click();
	}

	public void SelectSizes() {
		size_S.click();
		size_M.click();
		size_L.click();
	}

	public void ClickOkButtonInSizePopup() {
		okBtnToTakeSize.click();
	}

	public void InsertSizeWiseOrderQty(String OrderQty) throws Exception {
		int QTY = Integer.parseInt(OrderQty);
		int qtyPerSize = QTY / 3;

		qty_S.clear();
		qty_S.sendKeys(String.valueOf(qtyPerSize));
		qty_M.clear();
		qty_M.sendKeys(String.valueOf(qtyPerSize));
		qty_L.clear();
		qty_L.sendKeys(String.valueOf(qtyPerSize));
	}

	public void SelectComposition() {
		Select Composition = new Select(composition);
		Composition.selectByIndex(2);
	}

	public void SelectAdditionalComposition() {

		Select additionalcomposition = new Select(AddiComposition);
		additionalcomposition.selectByIndex(2);
	}

	public void SelectCareInstructions() {
		careInstruction.click();
		careInst1.click();
		careInst2.click();
	}

	public void SelectExtraCareInst() {
		ExtracareInstruction.click();
		ExtracareInst1.click();

	}

	public void SelectAdditionalInfos() throws InterruptedException {
		AdditionalInfo.click();
		AdditionalInfo1.click();
		AdditionalInfo2.click();
	}

	public void SaveOrder() {
		saveButton.click();
	}

	public void AddNewOrder() {
		addNewOrderButton.click();
	}

}
