package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LandingPagePageObject;
import resources.Base;

public class LandingPageTest extends Base {

	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeBrowser();
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPagePageObject lp = new LandingPagePageObject(driver);
		lp.lnk_SignIn().click();   // Clicking on signInLink

		driver.close();
	}

}
