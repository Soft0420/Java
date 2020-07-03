package example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import example.Page;

public class AccountBar extends Page {

	//private WebDriver driver;
	
	// *********Constructor*********
	public AccountBar(WebDriver d) { 
		super(d);
	}

	//selenium pagefactory selectors
	// *********Web Elements By Using Page Factory*********
	@FindBy(how = How.CSS, using = "#topLoginLink span")
	public WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), '����')]")
	public WebElement ukrainianLink;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), '����')]")
	public WebElement russianLink;

	@FindBy(how = How.CSS, using = "button.cookie-close.abs.cookiesBarClose")
	public WebElement acceptButton;

	
	/*
	public By ukrainianLink = By.xpath("//*[contains(text(), '����')]");
	public By russianLink = By.xpath("//*[contains(text(), '����')]");
	public By myAccount = By.id("topLoginLink");
*/
	
	// Go to LoginPage
	public void clickMyAccountButton() {
		click(myAccount);
	}
	
	// Select Ukrainian language
	public void clickUkrainianLink() {
		click(ukrainianLink);
	}
	
	// Select Russian language
	public void clickRussianLink() {
		click(russianLink);
	}
	
	public void acceptCoockies() {
		wait.until(ExpectedConditions.visibilityOf(acceptButton));
		click(acceptButton);
	}
}
