package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserpage {
@FindBy (css="input[type='button']")
private WebElement deleteUserButton;

@FindBy(className = "successmsg")
private WebElement successMsgText;

public WebElement getSuccessMsgText() {
	return successMsgText;
}

public WebElement getDeleteUserButton() {
	return deleteUserButton;
}
}
