package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText = "Settings")
	private WebElement settingsLink;

	@FindBy(linkText = "Users")
	private WebElement usersLink;

	@FindBy(className = "logoutImg")
	private WebElement logoutButton;

	public WebElement getSettingsLink() {
		return settingsLink;
	}

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}

