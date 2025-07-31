package calendar;

import vTiger.GenericUtility.BaseClass;
import vTiger.ObjectRepository.CalendarInformation;
import vTiger.ObjectRepository.Createcalendar;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LoginPage;

public class CalendarTest extends BaseClass {
	
	public void calendartest_004() {
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		Createcalendar cc=new Createcalendar(driver);
		CalendarInformation ci=new CalendarInformation(driver);
		
		
		cc.getClickCalendarTab().click();
		ci.getClickADDbutton().click();
		ci.getClickDAYevent().click();
		ci.getClickMeeting().click();
		
	}

}
