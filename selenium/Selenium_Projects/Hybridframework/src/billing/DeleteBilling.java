package billing;

import lib.SuperTestNG;
import lib.projectspecific;
import objectrepository.BillingPage;
import objectrepository.HomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBilling extends SuperTestNG{
  @Test
  public void testDeleteBilling() throws InterruptedException {
	  projectspecific.login(driver);
	  Thread.sleep(3000);
	HomePage h1=PageFactory.initElements(driver, HomePage.class); 
	  h1.getSettingsLink().click();
   BillingPage b1=PageFactory.initElements(driver, BillingPage.class);
	 b1.getDeleteBillingLink().click();
	  Alert A1 = driver.switchTo().alert();
	  A1.accept();
	  Thread.sleep(3000);
	  String Actualresult=b1.getSuccessMsgText().getText();
	  String Expectedresult ="Billing type has been successfully deleted.";
	  Assert.assertEquals(Actualresult, Expectedresult);
	  System.out.println(Actualresult);
	  projectspecific.logout(driver);
	  
  }
}
