package ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	//Declaration 
		@FindBy (xpath= "//img[@title='Create Contact...']")
		private WebElement CreateContactLookUpImg;
		
		public ContactPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}

		//Initialization
		public void ContactsPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//Utilization

		public WebElement getCreateContactLookUpImg() {
			return CreateContactLookUpImg;
		}
		 //Business Library
		/**
		 * This method will click on Create Contact look up Image
		 */
		public void clickOnCreateContactLookUpImg ()
		{
			CreateContactLookUpImg.click();
			
		}

}
