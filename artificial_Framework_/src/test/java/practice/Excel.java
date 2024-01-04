package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excel {
	
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("http://localhost:8888/");
		driver1.findElement(By.name("user_name")).sendKeys("admin");
		driver1.findElement(By.name("user_password")).sendKeys("admin");
		driver1.findElement(By.id("submitButton")).click();
		driver1.findElement(By.linkText("Contacts")).click();
		
		String src =( "C:\\Users\\adars\\eclipse-workspace\\artificial_Framework_\\src\\test\\resources\\Excel\\TestData.xlsx");
		
        FileInputStream fi = new FileInputStream(src);
        Workbook wb = WorkbookFactory.create(fi);
     String lastname=   wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        System.out.println(lastname);
    
        
        driver1.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver1.findElement(By.name("lastname")).sendKeys(lastname);
		 driver1.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		 //VALIDATE
		String contactHeader=driver1.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(contactHeader.contains("JOKER"))
		{
			System.out.println(contactHeader);
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
			
			//signout
			
			WebElement ele4=driver1.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			
			
			
			Actions act=new Actions(driver1);
			act.moveToElement(ele4).perform();
			
			driver1.findElement(By.linkText("Sign Out")).click();
		
		Thread.sleep(1000);
		driver1.close();
	}

}
