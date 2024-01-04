package PropertyFileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ExcelFileUtility {

	public String  Excelutility(String name) throws EncryptedDocumentException, IOException{
		
	
	String src =( "C:\\Users\\adars\\eclipse-workspace\\artificial_Framework_\\src\\test\\resources\\Excel\\TestData.xlsx");
	
    FileInputStream fi = new FileInputStream(src);
    Workbook wb = WorkbookFactory.create(fi);
 String lastname=   wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
return lastname;
    
}

	public String readDataFromExcel(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}


