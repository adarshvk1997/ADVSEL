package PropertyFileUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer {

	int count=0;
	int retryCount=3;
	
	public boolean retrty(ITestResult result)
	{
	//0>3 1>3 2>3 3>3
	while(count<retryCount)
	{
		count++;//1 2 3
		return true;//retry //retry //retry
	}
	return false;//stop
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}
	
