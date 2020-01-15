package pkg_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("First Selenium Prohject ");

		// Initiate the Chrome driver
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		/*// Initiate the Firefox browser
		
		System.setProperty("webdriver.firefox.marionette","F:\\selenium\\Browser_Driver\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); */
		

		driver.get("https://www.careerride.com/");
		driver.getCurrentUrl();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://stackoverflow.com/questions/49789963/org-openqa-selenium-sessionnotcreatedexception-unable-to-find-a-matching-set-of");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
		System.out.println("First Test script completed");
	}

}
