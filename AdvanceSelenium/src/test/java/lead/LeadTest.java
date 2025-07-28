package lead;

import org.testng.annotations.Test;

import vTiger.GenericUtility.BaseClass;
import vTiger.ObjectRepository.CreateLead;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LeadInfomation;
import vTiger.ObjectRepository.LeadPage;

public class LeadTest extends BaseClass {
	
	@Test
	public void leadTest_003() {
		LeadPage lp=new LeadPage(driver);
	//	LeadInfomation li=new LeadInfomation();
		HomePage hp=new HomePage(driver);
		CreateLead cl=new CreateLead(driver);
		LeadInfomation li=new LeadInfomation(driver);
		
		lp.getClickLead().click();
		cl.getCreateLeadName().click();
		
		li.getLastname().sendKeys("prawin");
		li.getCompanyname().sendKeys("nokia");
		
		li.getSaveLeadInfo().click();
		
		 
	}
	
	

}
