package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage {

	@FindBy(linkText = "delete this billing type")
	private WebElement deleteBillingLink;

	@FindBy(className="successmsg")
	private WebElement successMsgText;
	
	public WebElement getCreateNewBillingButton() {
		return createNewBillingButton;
	}


	@FindBy(css="input[type='button']")
	private WebElement createNewBillingButton;
	
	public WebElement getDeleteBillingLink() {
		return deleteBillingLink;
	}


	public WebElement getSuccessMsgText() {
		return successMsgText;
	}
}
