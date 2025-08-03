package CalenderCreate;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import vTiger.GenericUtility.BaseClass;
import vTiger.GenericUtility.ExcelFileUtiliy;

import vTiger.ObjectRepository.CalendarInformation;
import vTiger.ObjectRepository.Createcalendar;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LoginPage;

public class ToCreateCalenderTest extends BaseClass{
	
	@org.testng.annotations.Test
	public void TocreateCalenderTest_001() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		Createcalendar cc=new Createcalendar(driver);
		CalendarInformation ci=new CalendarInformation(driver);
        ExcelFileUtiliy eutill=new ExcelFileUtiliy();		
		
		
		cc.getClickCalendarTab().click();
		ci.getClickADDbutton().click();
		ci.getClickDAYevent().click();
		ci.getClickMeeting().click();
		
		// to read data from excel file
				FileInputStream efis = new FileInputStream("C:\\Users\\DELL\\git\\Qspider-Advance-selenium\\AdvanceSelenium\\src\\test\\resources\\Book4.xlsx");
				Workbook wb = WorkbookFactory.create(efis);
				String EVENTNAME = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
			//	String EVENTNAME=wb.getSheet("Sheet1").getRow(1).getCell(0).toString();


	
	}

}
