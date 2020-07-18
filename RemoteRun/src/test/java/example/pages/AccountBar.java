package example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import example.Page;

public class AccountBar {

	private Page page;
	
	// *********Constructor*********
	public AccountBar(Page p) {
		page = p;
	}

	//selenium pagefactory selectors

	/*
	// *********Web Elements By Using Page Factory*********
	@FindBy(how = How.ID, using = "topLoginLink")
	public WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), '����')]")
	public WebElement ukrainianLink;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), '����')]")
	public WebElement russianLink;
	 */

	public By ukrainianLink = By.xpath("//*[contains(text(), '����')]");
	public By russianLink = By.xpath("//*[contains(text(), '����')]");
	public By myAccount = By.id("topLoginLink");

	
	// Go to LoginPage
	public void clickMyAccountButton() {
		page.click(myAccount);
	}
	
	// Select Ukrainian language
	public void clickUkrainianLink() {
		page.click(ukrainianLink);
	}
	
	// Select Russian language
	public void clickRussianLink() {
		page.click(russianLink);
	}
}
