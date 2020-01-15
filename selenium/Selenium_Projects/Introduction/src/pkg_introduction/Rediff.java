package pkg_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("username");
		
		
		driver.findElement(By.id("password")).sendKeys("Password1234");
		
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		driver.quit();
		
		System.out.println("Completed the Test case ");

	}

}
