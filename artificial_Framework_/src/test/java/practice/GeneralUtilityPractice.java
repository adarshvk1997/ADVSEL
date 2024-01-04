package practice;

import java.io.IOException;

import PropertyFileUtility.PropertyFileUtility;
public class GeneralUtilityPractice {

	
	
	public static void main(String[]args) throws IOException
	{
		
		PropertyFileUtility pUtil=new PropertyFileUtility();
		String value=pUtil.readDataFromPropertyFile("username");
		System.out.println(value);
		
		
	}
}
