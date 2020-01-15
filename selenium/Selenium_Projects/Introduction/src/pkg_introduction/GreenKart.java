/**
 * 
 */
package pkg_introduction;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Pravin
 *
 */
public class GreenKart {

	/**
	 * @param args
	 * 
	 *            This Test script is created for testing the GREEN KART Web-site
	 *            with some advance level of script techniques.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String desireProdcutToAdd[] = { "Tomato", "Beans", "Brinjal", "Carrot" };
		
		String productname;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> prodctlist = driver.findElements(By.cssSelector("h4[class='product-name']"));

		for (int i = 0; i < prodctlist.size(); i++) {

			productname = prodctlist.get(i).getText();
			List<String> arrayListOfDesireProdcutToAdd = Arrays.asList(desireProdcutToAdd);

			if (arrayListOfDesireProdcutToAdd.contains(productname)) {

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
		driver.quit();
	}

}
