package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBillingPage {

	@FindBy(name = "name0")
	private WebElement billingTypeTextbox1;

	@FindBy(name = "name1")
	private WebElement billingTypeTextbox2;

	@FindBy(css = "input[type='submit']")
	private WebElement createBillingButton;

	@FindBy(className = "successmsg")
	private WebElement successMsgText;

	public WebElement getBillingTypeTextbox1() {
		return billingTypeTextbox1;
	}

	public WebElement getBillingTypeTextbox2() {
		return billingTypeTextbox2;
	}

	public WebElement getSuccessMsgText() {
		return successMsgText;
	}

	public WebElement getCreateBillingButton() {
		return createBillingButton;
	}
}
