package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityInformation {
	
	
	public OpportunityInformation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement clickopportunitylookupImage;

	public WebElement getClickopportunity() {
		return clickopportunitylookupImage;
	}

	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement createOpportunity;

	public WebElement getClickopportunitylookupImage() {
		return clickopportunitylookupImage;
	}

	public WebElement getCreateOpportunity() {
		return createOpportunity;
	}
	
	@FindBy(xpath = "//input[@name='potentialname']")
	private WebElement opportunityname;

	public WebElement getOpportunityname() {
		return opportunityname;
	}
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]/img[1]")
	WebElement createRelatedTo;

	public WebElement getCreateRelatedTo() {
		return createRelatedTo;
	}
	
	@FindBy(xpath = "//img[@id='jscal_trigger_closingdate']")
	WebElement createdate;

	public WebElement getCreatedate() {
		return createdate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
