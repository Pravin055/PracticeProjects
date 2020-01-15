package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement usernameTextbox;

	@FindBy(name = "pwd")
	private WebElement passwordTextbox;

	@FindBy(css = "input[type='submit']")
	private WebElement loginnowButton;

	public WebElement getUsernameTextbox() {
		return usernameTextbox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getLoginnowButton() {
		return loginnowButton;
	}
}



