package CalenderCreate;



import org.junit.Test;

import vTiger.GenericUtility.BaseClass;
import vTiger.ObjectRepository.CalendarInformation;
import vTiger.ObjectRepository.Createcalendar;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LoginPage;

public class ToCreateCalenderTest extends BaseClass{
	
	@org.testng.annotations.Test
	public void TocreateCalenderTest_001() {
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
