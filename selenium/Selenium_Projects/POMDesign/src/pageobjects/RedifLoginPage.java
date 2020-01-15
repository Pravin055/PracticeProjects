package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifLoginPage {

	WebDriver driver;

	public RedifLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.cssSelector("#login1");
	By password = By.cssSelector("#password");
	By buttonGO = By.xpath("//input[@name='proceed']");

	public WebElement txt_userId() {
		return driver.findElement(userName);
	}

	public WebElement txt_password() {
		return driver.findElement(password);
	}
	
	public WebElement button_GO()
	{
		
		return driver.findElement(buttonGO);
	}

}
