package users;

import lib.SuperTestNG;
import lib.projectspecific;
import objectrepository.EditUserpage;
import objectrepository.HomePage;
import objectrepository.UserPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUser extends SuperTestNG {
	@Test
	public void testDeleteUser() throws InterruptedException {

		projectspecific.login(driver);
		Thread.sleep(2000);
		HomePage h1 = PageFactory.initElements(driver, HomePage.class);
		h1.getUsersLink().click();

		Thread.sleep(2000);
	
		UserPage u1 = PageFactory.initElements(driver, UserPage.class);
		u1.getFirstUserNameLink().click();
		EditUserpage d1 = PageFactory.initElements(driver, EditUserpage.class);
		d1.getDeleteUserButton().click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		EditUserpage o1 = PageFactory.initElements(driver, EditUserpage.class);
		String Actualresult = o1.getSuccessMsgText().getText();


		String Expectedresult = "User has been successfully deleted.";
		Assert.assertEquals(Actualresult, Expectedresult);

		projectspecific.logout(driver);

	}
}
