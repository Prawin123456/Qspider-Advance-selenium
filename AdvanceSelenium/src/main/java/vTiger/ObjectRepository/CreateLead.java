package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead {
	

	public CreateLead(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//img[@alt=\"Create Lead...\"]")
	private WebElement createLeadName;

	public WebElement getCreateLeadName() {
		return createLeadName;
	}

	

}
