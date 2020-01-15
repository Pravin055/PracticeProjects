package pkg_introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownSelection {
	// css = p[class='font14 appendBottom5 blackText']
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		
		Thread.sleep(3000);

		List<WebElement> cityList = driver.findElements(By.cssSelector("//label[@for=\"fromCity\"]//following::p[@class=\"font14 appendBottom5 blackText\"]"));

		for (WebElement element : cityList) {
			if (element.getText().contains("Mumbai, India"))
				element.click();
		}
		driver.close();
		driver.quit();
	}

}
