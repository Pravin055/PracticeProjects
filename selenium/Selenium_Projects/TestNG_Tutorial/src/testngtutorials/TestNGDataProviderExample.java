package testngtutorials;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGDataProviderExample {
	String Actua_Error_message = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	public static WebDriver driver;

	// Initiate the browser and load Salesforce login page

	@Test(dataProvider = "loginDetails")

	public void dataProviderTestcae(String username, String passcode) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// accesing Properties file
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream("F:\\selenium\\Selenium_Projects\\TestNG_Tutorial\\src\\testngtutorials\\LoginData.properties");
		prop.load(fis);
		
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);

		// Actual Test Case

		System.out.println("Entered in to Test Case");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passcode);

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#Login")).click();

		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

	@DataProvider(name = "loginDetails")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "India", "Pass 1" }, { "UK", "Pass 2" }, { "USA", "Pass 3" } };
	}

}
