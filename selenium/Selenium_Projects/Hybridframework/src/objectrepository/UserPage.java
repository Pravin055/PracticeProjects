package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	@FindBy (xpath="//tbody[tr[th[text()='User']]]/tr[3]/td/a")
	private WebElement firstUserNameLink;

	public WebElement getFirstUserNameLink() {
		return firstUserNameLink;
	}

}
