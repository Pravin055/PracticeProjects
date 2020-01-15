package lib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNG {

	public WebDriver driver = null;

	@BeforeMethod
	public void precondition() {
		String browsername = "firefox";
		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("Webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("http://welcome-pc/login.do");
	}

	@AfterMethod
	public void postcondition(ITestResult it) throws IOException {
		if (it.isSuccess() == false) {
			EventFiringWebDriver e1 = new EventFiringWebDriver(driver);
			File f1 = e1.getScreenshotAs(OutputType.FILE);
			String s1 = it.getTestClass().getName();
			File f2 = new File(".\\Screenshot\\" + s1 + ".jpg");
			FileUtils.copyFile(f1, f2);
		}
		driver.quit();
	}

}
