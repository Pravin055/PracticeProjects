package pkg_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		String Actua_Error_message = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("username");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#Login")).click();
		
		Thread.sleep(1000);
		String Login_errormessage = driver.findElement(By.cssSelector("#error")).getText();
		
		// Verifying the actual and expected String
		if(Login_errormessage.equals(Actua_Error_message))
		{
			System.out.println("Negative Test cases pass");
		}

		driver.quit();

		System.out.println("Test Case ends for salesfore login page");
	}

}
