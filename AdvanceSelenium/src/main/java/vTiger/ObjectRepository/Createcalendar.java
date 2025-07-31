package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcalendar {
	
	public Createcalendar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='index.php?module=Calendar&action=index']")
	private WebElement  ClickCalendarTab;

	public WebElement getClickCalendarTab() {
		return ClickCalendarTab;
	} 
 
}
