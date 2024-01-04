package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	
	
	public static void main(String[]args) throws IOException, InterruptedException
	{
		
		//step1 open document in java readable
		FileInputStream fis=new FileInputStream("C:\\Users\\adars\\eclipse-workspace\\artificial_Framework_\\src\\test\\resources\\CommonData.properties");
		
		//object for property
		
		Properties p=new Properties();
		
		
		//load
		
		p.load(fis);
		//provide the key and read value
		
		String value=p.getProperty("url");
		System.out.println(value);
	String username=p.getProperty("username");
	String password=p.getProperty("password");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(value);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		
		//excel
		
		
		String src =( "C:\\Users\\adars\\eclipse-workspace\\artificial_Framework_\\src\\test\\resources\\Excel\\TestData.xlsx");
	
            FileInputStream fi = new FileInputStream(src);
            Workbook wb = WorkbookFactory.create(fi);
         String lastname=   wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
            System.out.println(lastname);
        
            
            driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
    		driver.findElement(By.name("lastname")).sendKeys(lastname);
    		
    		Thread.sleep(1000);
    		driver.close();
    		
	}
}
