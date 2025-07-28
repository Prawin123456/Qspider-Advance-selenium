package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	
	
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//a[@href='index.php?module=Leads&action=index']")
	private WebElement clickLead;


	public WebElement getClickLead() {
		return clickLead;
	}
	
//	@FindBy(xpath)
}
