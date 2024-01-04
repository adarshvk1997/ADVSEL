package practice;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class RetryAnalysePractice {

	@Test(retryAnalyzer=(PropertyFileUtility.RetryAnalyserImplementation.class)
	
	public void analyser()
	{
		Assert.fail();
		System.out.println("hi");
	}
	
	
}
