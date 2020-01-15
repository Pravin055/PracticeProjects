/**
 * 
 */
package pkg_introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Pravin
 *
 */
public class FormComponents {

	/**
	 * @param args
	 * 
	 *            This script is for practicing the form components of web-pages
	 *            such as text-box, radio button, list, drop-down, date etc.
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/Default.aspx");

		Thread.sleep(1000);

		// Select Departure city
		WebElement departurecity = driver
				.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		departurecity.clear();
		Thread.sleep(1000);
		departurecity.sendKeys("Pune (PNQ)");

		// Select Arrival city
		WebElement ArrivalCity = driver
				.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		ArrivalCity.clear();
		Thread.sleep(1000);
		ArrivalCity.sendKeys("Mumbai (BOM)");

		// As of now keep the date as current date
		Thread.sleep(2000);
		WebElement currentDate = driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight"));
		currentDate.click();

		// This code id for selecting the number of passenger
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Select selectObj = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
		selectObj.selectByIndex(3); // This will select 4 People as passenger in list, since index starts from 0
		Thread.sleep(2000);
		selectObj.selectByValue("3"); // This will select 3 People as passenger
		// selectObj.deselectAll(); // We cann't perform this operation if there is any
		// default value present in list box
		Thread.sleep(2000);
		driver.quit(); System.out.println("Test case is complete and selected the 3 people");

	}

}
