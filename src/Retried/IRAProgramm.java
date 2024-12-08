package Retried;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRAProgramm implements IRetryAnalyzer{
int intialcount=0;
int retry_count=2;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		while(intialcount <retry_count) {
			intialcount++;
			return true;
			
		}
		return false;
	}
	

}
