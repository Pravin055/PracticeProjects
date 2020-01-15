package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpages.GoogleSerachPageObject;

public class GoogleSearchTest {
	WebDriver driver = null;

	public static void main(String args[]) {

		googleSearchTextMethod();
	}

	public static void googleSearchTextMethod() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");

		// Code for driver initialization and maximizing the window with implicit wait

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");

		GoogleSerachPageObject GoogleSerachPageObjectObj = new GoogleSerachPageObject(driver);

		GoogleSerachPageObjectObj.setText_googleSearchText("Automation Step by Step");
		GoogleSerachPageObjectObj.clickButton_googleSearchButton();

	}

	// }

}
