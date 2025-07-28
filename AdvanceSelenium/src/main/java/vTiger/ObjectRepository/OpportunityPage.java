package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {
	
	
	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='index.php?module=Potentials&action=index']")
	private WebElement ClickOpportunity;

	public WebElement getClickOpportunity() {
		return ClickOpportunity;
	}
}
