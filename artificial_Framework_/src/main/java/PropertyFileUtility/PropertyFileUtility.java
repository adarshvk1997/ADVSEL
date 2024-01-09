package PropertyFileUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;

/**
 * This class consists of reusable methods related to property file
 * @author adarsh
 * 
 */
public class PropertyFileUtility {
public class ListenersImplementation {

	}

/**
 * This method will read data from Property file and return the value to the caller
 * @param key
 * @return value
 * @throws IOException
 * 
 * 
 */
	public String readDataFromPropertyFile(String key)throws IOException
	{
		FileInputStream fis=new FileInputStream("/artificial_Framework_/src/test/resources/CommonData.properties");
		Properties p= new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}
	
}
