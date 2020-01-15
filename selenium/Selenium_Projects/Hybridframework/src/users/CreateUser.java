package users;

import lib.Generic;
import lib.SuperTestNG;
import lib.projectspecific;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUser extends SuperTestNG {
  @Test
  public void f() throws InterruptedException 
  {

		String filepath=".\\testdatas\\testcases.xlsx";
		String sheetname="CreateUser";
	 int n= Generic.findLastindex(filepath, sheetname);
	 for(int i=1;i<=n;i++) 
	  
	 {
	  projectspecific.login(driver);
	driver.findElement(By.linkText("Users")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[type='button']")).click();
	
	Thread.sleep(1000);
driver.findElement(By.name("username")).sendKeys(Generic.GetDataFromExcel
		(filepath, sheetname, i, 0));
	driver.findElement(By.name("passwordText")).sendKeys(Generic.GetDataFromExcel
			(filepath, sheetname, i, 1));
	driver.findElement(By.name("passwordTextRetype")).sendKeys
	(Generic.GetDataFromExcel(filepath, sheetname, i, 2));
	driver.findElement(By.name("firstName")).sendKeys
	(Generic.GetDataFromExcel(filepath, sheetname, i, 3));
	driver.findElement(By.name("lastName")).sendKeys
	(Generic.GetDataFromExcel(filepath, sheetname,i, 4));
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	Thread.sleep(2000);
WebElement e1=driver.findElement(By.className("successmsg"));
	 String ActualResult=e1.getText();
	 
	 Generic.writedata(filepath, sheetname, i, 5, ActualResult);
	 
	 String ExpectedResult="User has been successfully added.";
	 Assert.assertEquals(ActualResult, ExpectedResult);
System.out.println(ActualResult);
Thread.sleep(1000);
projectspecific.logout(driver);
Thread.sleep(1000);
	 }  
  }
  
}
