package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePageObject {
	private WebDriver driver;

	public LandingPagePageObject(WebDriver driver) {
		this.driver = driver;

	}

	By signInLink = By.xpath("//span[text()='Login']");

	public WebElement lnk_SignIn() {
		WebElement lnk_SignIN = driver.findElement(signInLink);
		return lnk_SignIN;

	}

}
