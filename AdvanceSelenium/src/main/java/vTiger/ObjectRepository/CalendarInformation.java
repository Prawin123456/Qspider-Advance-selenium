package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarInformation {
	
	public CalendarInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='calSel']")
	private WebElement ClickDAYevent;
	
	public WebElement getClickDAYevent() {
		return ClickDAYevent;
	}


	@FindBy(xpath = "//td[@class='calAddButton']")
	private WebElement clickADDbutton;
	
	public WebElement getClickADDbutton() {
		return clickADDbutton;
	}
	
	@FindBy(xpath = "//a[@id='addmeeting']")
	private WebElement clickMeeting;
	
	public WebElement getClickMeeting() {
		return clickMeeting;
	}
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement eventName;

	public WebElement getEventName() {
		return eventName;
	}
	
	
	 
	
	

}
