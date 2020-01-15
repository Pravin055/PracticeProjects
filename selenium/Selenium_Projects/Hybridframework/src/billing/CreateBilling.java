package billing;

import lib.Generic;
import lib.SuperTestNG;
import lib.projectspecific;
import objectrepository.BillingPage;
import objectrepository.CreateBillingPage;
import objectrepository.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBilling extends SuperTestNG {
	@Test
	public void TestCreateBilling() throws InterruptedException {
		String filepath = ".\\testdatas\\testcases.xlsx";
		String sheetname = "CreateBilling";
		int n = Generic.findLastindex(filepath, sheetname);
		for (int i = 1; i <= n; i++) {
			projectspecific.login(driver);
			Thread.sleep(3000);
			HomePage h1 = PageFactory.initElements(driver, HomePage.class);
			h1.getSettingsLink().click();
			Thread.sleep(3000);
			BillingPage b1 = PageFactory
					.initElements(driver, BillingPage.class);
			b1.getCreateNewBillingButton().click();
			Thread.sleep(3000);
			CreateBillingPage c1 = PageFactory.initElements(driver,
					objectrepository.CreateBillingPage.class);
			c1.getBillingTypeTextbox1().sendKeys(
					Generic.GetDataFromExcel(filepath, sheetname, i, 0));
			c1.getBillingTypeTextbox2().sendKeys(
					Generic.GetDataFromExcel(filepath, sheetname, i, 1));
			Thread.sleep(1000);
			c1.getCreateBillingButton().click();
			Thread.sleep(1000);
			String Actualresult = c1.getSuccessMsgText().getText();
			Generic.writedata(filepath, sheetname, i, 2, Actualresult);
			String Expectedresult = "2 billing types have been successfully added.";
			Assert.assertEquals(Actualresult, Expectedresult);
			Thread.sleep(1000);
			projectspecific.logout(driver);
			System.out.println(Actualresult);
			Thread.sleep(1000);
		}
	}
}
