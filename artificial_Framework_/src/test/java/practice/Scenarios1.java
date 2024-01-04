package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("http://localhost:8888/");
	//WebElement ele1=driver1.findElement(By.xpath("//input[@type='text' and @name='user_name']"));
	//ele1.sendKeys("admin");
	//WebElement ele2=driver1.findElement(By.xpath("//input[@type='password'  and @name='user_password']"));
	//ele2.sendKeys("admin");
	
	//WebElement ele3=driver1.findElement(By.xpath("//input[@type='submit' and @id='submitButton']"));
	//ele3.click();
	 // WebElement contactsLink = driver1.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
	 // contactsLink.click();
		
		
		//step 3 login to application
		driver1.findElement(By.name("user_name")).sendKeys("admin");
		driver1.findElement(By.name("user_password")).sendKeys("admin");
		driver1.findElement(By.id("submitButton")).click();
		
		//click contact
		
		driver1.findElement(By.linkText("Contacts")).click();
		
		//create contact
		driver1.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver1.findElement(By.name("lastname")).sendKeys("avk");
		
	  //save
	  driver1.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	//validate
	  String contactHeader=driver1.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	
	if(contactHeader.contains("avk"))
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

	}

}
