package example.autotests;

import org.testng.Assert;
import org.testng.annotations.Test;
import example.BaseTest;

public class LoginTests extends BaseTest {

	private String email = "terminator067067@gmail.com";
	private String password = "My_password";
	private String invalidPassword = "qwerty";
	private String expectedText = "Недопустимое значение";

	@Test(priority = 1)
	public void LoginTest2() {
		// *************PAGE METHODS WITH JAVA GENERICS********************
		ui.open(baseURL);
		
		// Initialize elements by using PageFactory
		ui.accountBar().clickUkrainianLink();
		ui.accountBar().clickRussianLink();
		ui.accountBar().clickUkrainianLink();
		
		ui.accountBar().clickMyAccountButton();
		
		// Chain of Invocation (Go to Login Page and then Login)
		ui.loginPage().login(email, password);
		
		// *************ASSERTIONS***********************
		// It is better to use explicit wait here.
		ui.myAdvertPage().waitForMessageLink();
	}

	@Test(priority = 0)
	public void InvalidPasswordLoginTest() {
		// *************PAGE METHODS WITH JAVA GENERICS********************
		ui.open(baseURL);

		// Initialize elements by using PageFactory
		ui.accountBar().clickMyAccountButton();

		// Chain of Invocation (Go to Login Page and then LoginToN11)
		ui.loginPage().login(email, invalidPassword);

		// *************ASSERTIONS***********************
		String actualErrorText = ui.loginPage().getErrorText();
		Assert.assertEquals(actualErrorText, expectedText);
	}
}
