package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.RedifLoginPage;

public class LoginTest {

	@Test
	public void loginIntoApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		RedifLoginPage rd = new RedifLoginPage(driver);

		rd.txt_userId().sendKeys("UserName1");  // Enter username
		rd.txt_password().sendKeys("Password"); // Enter Password
		rd.button_GO().click();     // Click on Go button
		
		driver.close();
		driver.quit();
	}

}
