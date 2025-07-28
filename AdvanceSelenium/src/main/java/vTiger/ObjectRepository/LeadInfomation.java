package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInfomation {
	
	

	public LeadInfomation(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	


	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement lastname;

      public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath = "//input[@name=\"company\"]")
	private WebElement companyname;


	public WebElement getCompanyname() {
		return companyname;
	}
	
	@FindBy(xpath = "//input[contains(@class,'crmbutton small save')]")
	private WebElement saveLeadInfo;

	public WebElement getSaveLeadInfo() {
		return saveLeadInfo;
	}



	}
	


