package opportunityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericUtility.BaseClass;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OpportunityInformation;
import vTiger.ObjectRepository.OpportunityPage;

public class Opportunity extends BaseClass {
	
	
	
	public void Opportunitytest_004() {
	HomePage hp=new HomePage(driver);
	OpportunityPage op=new OpportunityPage(driver);
	OpportunityInformation oi=new OpportunityInformation(driver);
	
	op.getClickOpportunity().click();
	oi.getClickopportunitylookupImage().click();
	oi.getOpportunityname().sendKeys("prawin");
	oi.getCreateRelatedTo().click();
	
	
	
	
	}
	

}
