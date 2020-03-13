package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Menu {

	
	@FindBy (how=How.CSS,using="#niMenu li:nth-child(1)>a")
	private WebElement accessory;
	
	@FindBy(how=How.ID, using="100000350")
	private WebElement merchandisingSupport;
	
	@FindBy(how=How.ID, using="100000626")
	private WebElement order;
	
	@FindBy(how=How.CSS, using="#dropdown-menu100000626 > li:nth-child(1) > a")
	private WebElement createOrder;
	
	
	
	@FindBy (how=How.ID,using="100000353")
	private WebElement productionManagement;
	
	@FindBy (how=How.ID,using="100002086")
	private WebElement orderSourcing;
	
	@FindBy (how=How.CSS,using="#dropdown-menu100002086>li:nth-child(1)>a")
	private WebElement orderSourcingPlan;
	
	@FindBy (how=How.ID,using="100000352")
	private WebElement manageProductionPlan1;

	@FindBy (how=How.ID,using="100000851")
	private WebElement manageProductionPlan2;
   
	@FindBy (how=How.CSS,using="#dropdown-menu100000851 > li:nth-child(1) > a")
	private WebElement productionPlanentry;
	
	@FindBy (how=How.ID,using="100000856")
	private WebElement productionEntry;
	
	@FindBy (how=How.ID,using="1000001286")
	private WebElement issue;
	
	@FindBy (how=How.CSS,using="#dropdown-menu1000001286 > li:nth-child(1) > a")
	private WebElement orderIssue;
	
	
	@FindBy (how=How.ID,using="100000968")
	private WebElement supplyChainManagement;
	
	@FindBy (how=How.ID,using="1000001280")
	private WebElement stockOrder;
	
	@FindBy (how=How.CSS,using="#dropdown-menu1000001280 > li:nth-child(1) > a")
	private WebElement CreateStockOrder;
	@FindBy (how=How.CSS,using="#dropdown-menu1000001280 > li:nth-child(3) > a")
	private WebElement VrtifyStockOrder;
	
	
	
	
	@FindBy (how=How.ID,using="100000862")
	private WebElement Finance;

	
	@FindBy (how=How.ID,using="100000203")
	private WebElement Commercial;
	
	
	@FindBy(how = How.ID, using = "100000355")
	private WebElement logisticManagement;
	
	@FindBy(how = How.ID, using = "1000001291")
	private WebElement receiveConfirmIssue;
	
	
	
	public void Accessory() {
		 accessory.click();
	}

	public void MerchandisingSupport() {
		merchandisingSupport.click();
	}
	
	public void Order() {
		order.click();
	}
	
	public void CreaetOrder() {
		createOrder.click();
	}
	
	public void ProductionManagement() {
		 productionManagement.click();
	}
	
	public void OrderSourcingPlant() {
		orderSourcingPlan.click();
	}
	
	public void ManageProductionPlan1() {
		manageProductionPlan1.click();
	}
	
	public void ManageProductionPlan2() {
		manageProductionPlan2.click();
	}
	
	public void ProductionPlanentry() {
		productionPlanentry.click();
	}
	
	public void ProductionEntry() {
		productionEntry.click();
	}
	
	public void Issue(){
		issue.click();
	}
	public void OrderIssue(){
		orderIssue.click();
	}
	
	
	public void SupplyChainManagement() {
		supplyChainManagement.click();
	}
	public void StockOrder() {
		stockOrder.click();
	}
	public void CreaetStockOrder() {
		CreateStockOrder.click();
	}
	public void verifyStockOrder() {
		VrtifyStockOrder.click();
	}
	
	
	
	
	
	
	public void LogisticManagement(){
		logisticManagement.click();
	}
	
	public void ReceiveConfirmIssue (){
		receiveConfirmIssue.click();
	}
	
	
	
	
}
