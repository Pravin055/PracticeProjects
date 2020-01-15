package lib;

import objectrepository.HomePage;
import objectrepository.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class projectspecific {

	public static void login(WebDriver driver) {

		LoginPage l1 = PageFactory.initElements(driver, LoginPage.class);
		l1.getUsernameTextbox().sendKeys(LoginCredential.username);
		l1.getPasswordTextbox().sendKeys(LoginCredential.password);
		l1.getLoginnowButton().click();
	}

	public static void logout(WebDriver driver) {
		HomePage h1=PageFactory.initElements(driver, HomePage.class);
		h1.getLogoutButton().click();
	}

}
