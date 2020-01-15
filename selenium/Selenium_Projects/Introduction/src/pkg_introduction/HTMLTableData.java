package pkg_introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = 0;
		int columnCount = 0;
		String rowcssSelector = "";
		String columncssSelector = "";

		String cssValue = "#customers tbody";
		// rows = #customers tbody tr
		// columns = #customers tbody tr th

		// get the row count
		rowcssSelector = cssValue.concat(" tr");
		rowCount = driver.findElements(By.cssSelector(rowcssSelector)).size();

		columncssSelector = cssValue.concat(" tr th");
		columnCount = driver.findElements(By.cssSelector(columncssSelector)).size();

		System.out.println("rowCount: " + rowCount);
		System.out.println("columnCount: " + columnCount);

		try {

			for (int i = 1; i <= rowCount; i++) {
				for (int j = 1; j <= columnCount; j++) {

					// #customers tbody tr:nth-child(3) td:nth-child(2)
					String cssValueForTable = cssValue.concat(" tr:nth-child(" + i + ") td:nth-child(" + j + ")");
					String tableValue = driver.findElement(By.cssSelector(cssValueForTable)).getText();
					System.out.println(tableValue);
				}

				System.out.println();

			}
		} catch (Exception e) {

			System.out.println("Table data could not retrive");
			driver.close();

		}

		driver.quit();

	}

}
