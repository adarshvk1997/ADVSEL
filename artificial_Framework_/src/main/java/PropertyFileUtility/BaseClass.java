package PropertyFileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.Homepage;
import ObjectRepository.LoginPage;
/**
 * This class consists of all Basic Configuration annotations of TestNG
 * @author adarsh
 */


public class BaseClass {
	public static WebDriver sdriver;
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public Javautility jUtil= new Javautility();
	public SaleniumUtility sUtil= new SaleniumUtility();
	public PropertyFileUtility pUtil= new PropertyFileUtility();
	
	public WebDriver driver;
	
	@BeforeSuite (groups = {"SmokeSuite", "RegressionSuite"})
	public void bsConfig()
	{
	   System.out.println("========DB Connection Successful========");	
	}
	
	@BeforeClass(alwaysRun = true)
	public void bcConfig() throws Throwable
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		
		driver= new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.addimplictlyWait(driver);
		
		driver.get(URL);
		
		System.out.println("========Browser Launched========");
	}
	
	@BeforeMethod (alwaysRun = true)
	public void bmConfig() throws Throwable
	{
	String USERNAME = pUtil.readDataFromPropertyFile("username");
	 String PASSWORD = pUtil.readDataFromPropertyFile("password");
	 
	 LoginPage lp = new LoginPage(driver);
	 lp.loginToApp(USERNAME, PASSWORD);
	 
	 System.out.println("========Login Successful========");
		}
	
	@AfterMethod (alwaysRun = true)
	public void amConfig() throws Throwable
	{
		Homepage hp = new Homepage(driver);
		hp.logoutOfApp(driver);
		
		System.out.println("========Logout Successful========");
	}
	
	@AfterClass (alwaysRun = true)
	public void acConfig()
	{
		driver.quit();
		
		System.out.println("========Browser Closed========");
	}
	
	@AfterSuite (alwaysRun = true)
	public void asConfig()
	{
		System.out.println("========DB Connection Closed========");
	}

}


