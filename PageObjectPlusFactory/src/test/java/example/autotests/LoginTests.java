package example.autotests;

import org.testng.Assert;
import org.testng.annotations.Test;
import example.BaseTest;
import example.pages.AccountBar;
import example.pages.LoginPage;
import example.pages.MyAdvertPage;

public class LoginTests extends BaseTest {

	private String email = "terminator067067@gmail.com";
	private String password = "My_password";
	private String invalidPassword = "qwerty";
	private String expectedText = "Недопустимое значение";

	@Test(priority = 1)
	public void LoginTest() {
		// *************PAGE METHODS WITH JAVA GENERICS********************
		ui.open(baseURL);

		// Initialize elements by using PageFactory
		ui.GetInstance(AccountBar.class).clickUkrainianLink();
		ui.GetInstance(AccountBar.class).clickRussianLink();
		ui.GetInstance(AccountBar.class).clickUkrainianLink();
		
		ui.GetInstance(AccountBar.class).clickMyAccountButton();
		
		// Chain of Invocation (Go to Login Page and then Login)
		ui.getLoginPage().login(email, password);
		
		// *************ASSERTIONS***********************
		Assert.assertTrue(
				ui.GetInstance(MyAdvertPage.class).isUserLogedIn(), 
				"User didn't log in");
	}

	@Test(priority = 0)
	public void InvalidPasswordLoginTest() {
		// *************PAGE METHODS WITH JAVA GENERICS********************
		ui.open(baseURL);

		// Initialize elements by using PageFactory
		ui.GetInstance(AccountBar.class).clickMyAccountButton();
		ui.GetInstance(AccountBar.class).acceptCoockies();
		
		// Chain of Invocation (Go to Login Page and then LoginToN11)
		ui.GetInstance(LoginPage.class).login(email, invalidPassword);

		// *************ASSERTIONS***********************
		String actualErrorText = ui.GetInstance(LoginPage.class).getErrorText();
		Assert.assertEquals(actualErrorText, expectedText);
	}
}
