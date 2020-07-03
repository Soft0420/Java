package example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import example.Page;

public class MyAdvertPage extends Page{
    
	//*********Constructor*********
	public MyAdvertPage(WebDriver driver) {
		super(driver);
	}

	//*********Page Selector*********
	//You can use this approach instead of @FindBy
    //public By messageLink = By.cssSelector("#se_accountAnswers span.link.fbold");

    @FindBy(css = "#se_accountAnswers span.link.fbold")
    public WebElement messageLinkEl;
    
	//*********Page Methods*********
    public void waitForMessageLink (){
    	WebDriverWait localWait = new WebDriverWait(driver, 20);
    	localWait.until(ExpectedConditions.visibilityOf(messageLinkEl));
    }
    
    //Check if user login successfully
    public boolean isUserLogedIn() {
    	waitForMessageLink();
    	return true;
    }
}
