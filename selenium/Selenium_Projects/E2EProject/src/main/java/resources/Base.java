package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;

	public WebDriver initializeBrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"F:\\selenium\\Selenium_Projects\\E2EProject\\src\\main\\java\\resources\\data.Properties");
		prop.load(fis);

		String browaserName = prop.getProperty("browserType");

		// chrome
		if (browaserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		// FireFox
		else if (browaserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.marionette",
					"F:\\selenium\\Browser_Driver\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// IE
		else if (browaserName.equalsIgnoreCase("IE")) {

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;

	}

}
