package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSerachPageObject {

	WebDriver driver = null;

	// Constructor to pass the public driver to page driver object
	public GoogleSerachPageObject(WebDriver driver) {

		this.driver = driver;
	}

	// **************** WebElements ***********************************

	By googleSearchText = By.cssSelector("input[title='Search']");
	By googleSearchButton = By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[1]");

	/*
	 ************** Methods for WebElements ************************
	 */

	// Method for sending text in google search-box
	public void setText_googleSearchText(String text) {

		driver.findElement(googleSearchText).sendKeys(text);
	}

	// method for clicking on google search button
	public void clickButton_googleSearchButton() {

		driver.findElement(googleSearchButton).sendKeys(Keys.RETURN);

	}

}
