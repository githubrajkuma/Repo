package newJavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public void handleAlert() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		
		WebElement clickOnbutton =  driver.findElement(By.id("confirmButton"));
		//we can click on button using  javascript 
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnbutton);
		clickOnbutton.click();
		
		 

		String alertText = driver.switchTo().alert().getText();
		String expAlertText = "Do you confirm action?";
		
		//verify the alert text using Assert class
		Assert.assertEquals(alertText, expAlertText);
		System.out.println("Alert Text verified");
		
		
		//accept alert
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");
		
		//dismiss/cancel alert
		WebElement clickOnbutton2 =  driver.findElement(By.id("confirmButton"));
		//we can use javascript 
		JavascriptExecutor js2 = (JavascriptExecutor) driver ;
		js2.executeScript("arguments[0].scrollIntoView(true);", clickOnbutton2);
		clickOnbutton2.click();
		
		driver.switchTo().alert().dismiss();
		System.out.println("alert dismissed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
