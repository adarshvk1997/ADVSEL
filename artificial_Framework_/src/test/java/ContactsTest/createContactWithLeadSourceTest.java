package ContactsTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PropertyFileUtility.ListenersImplementation;

import PropertyFileUtility.BaseClass;
import PropertyFileUtility.ExcelFileUtility;
import PropertyFileUtility.PropertyFileUtility;
import PropertyFileUtility.ListenersImplementation;
import PropertyFileUtility.SaleniumUtility;
import ObjectRepository.ContactInfoPage;
import ObjectRepository.ContactPage;
import ObjectRepository.CreateNewContactPage;
import ObjectRepository.Homepage;
@Listeners (PropertyFileUtility.ListenersImplementation.class)
public class createContactWithLeadSourceTest {
	@Test
	public void  CreateContactWithLead() throws Throwable
	{
		//Create Object of Required Utility Classes
		PropertyFileUtility pUtil = new PropertyFileUtility();
		ExcelFileUtility eUtil= new ExcelFileUtility();
		SaleniumUtility sUtil= new SaleniumUtility();
		
		//Read Common Data from Property File 
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
	    String PASSWORD = pUtil.readDataFromPropertyFile("password");
	    
	    //Read Test Data From Excel File 
	    String LASTNAME = eUtil.readDataFromExcel("Sheet1", 7, 2);
	   String LEADSOURCE = eUtil.readDataFromExcel("Sheet1", 7, 3);
	    
	    WebDriver driver;
		//Step Click on Contact Link
	    Homepage hp = new Homepage(driver);
	    hp.clickOnContactsLink();
	    
	    //Step Click on Create Contact LookUp Image
	    ContactPage cp = new ContactPage(driver);
	    cp.clickOnCreateContactLookUpImg();
	    
	    //Step Create New Contact
	    CreateNewContactPage cncp = new CreateNewContactPage(driver);
	    cncp.createNewContact(LASTNAME,LEADSOURCE);
	    
	    
	    //Step Validate
	    ContactInfoPage cip = new ContactInfoPage(driver);
	    String contactHeader = cip.captureHeaderText();
	    AssertJUnit.assertTrue(contactHeader.contains(LASTNAME));
	    System.out.println(contactHeader);
	    
		}
	

}
