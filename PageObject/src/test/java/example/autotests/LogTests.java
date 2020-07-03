package example.autotests;

import org.testng.Assert;
import org.testng.annotations.Test;
import example.BaseTest;

public class LogTests extends BaseTest {

	private String email = "terminator067067@gmail.com";
	private String password = "My_password";
	private String invalidPassword = "qwerty";
	private String expectedText = "Недопустимое значение";


	@Test(priority = 1)
	public void LoginTest() {
		// *************PAGE METHODS WITH JAVA GENERICS********************
		page.open(baseURL);

		// Initialize elements by using PageFactory
		page.accountBar().clickUkrainianLink();
		page.accountBar().clickRussianLink();
		page.accountBar().clickUkrainianLink();
		
		page.accountBar().clickMyAccountButton();
		
		// Chain of Invocation (Go to Login Page and then Login)
		page.loginPage().login(email, password);
		
		// *************ASSERTIONS***********************
		Assert.assertTrue(
				page.myAdvertPage().isUserLogedIn(), 
				"User didn't log in");
	}

	@Test(priority = 0)
	public void InvalidPasswordLoginTest() {
		page.open(baseURL);
		
		// Initialize elements by using PageFactory
		page.accountBar().clickMyAccountButton();
		page.accountBar().acceptCoockies();
		
		// Chain of Invocation (Go to Login Page and then LoginToN11)
		page.loginPage().login(email, invalidPassword);
		
		// *************ASSERTIONS***********************
		String actualErrorText = page.loginPage().getErrorText();
		Assert.assertEquals(actualErrorText, expectedText);
	}
}
