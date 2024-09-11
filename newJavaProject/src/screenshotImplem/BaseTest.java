package screenshotImplem;




import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class BaseTest
	{
	
	WebDriver driver ;
	
	public void takeScreenShotFailure(ITestResult result) throws Exception {
		
		if (ITestResult.FAILURE ==result.getStatus()) {
			
			//create ref of TakeScreenshot interface and type casting 
			TakesScreenshot ts= (TakesScreenshot) driver ;
			
			
			//use getScreenshotAs() to capture screenshot in file format
			// getScreenshotAs() returns type = file 
			
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			
			FileUtils.copyFile(sourceFile, destFolder);
			
			System.out.println(result.getName() + "method() screenshot captured");
			
			
			
		}
		
		
	}
	
	

}
