package example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import example.Page;

public class MyAdvertPage {
    
	private Page page;
	
	//*********Constructor*********
	public MyAdvertPage(Page p) {
		page = p;
	}

	//*********Page Selector*********
    public By messageLink = By.cssSelector("#se_accountAnswers span.link.fbold");
    
	//*********Page Methods*********
    public void waitForMessageLink (){
    	WebDriverWait localWait = new WebDriverWait(page.driver, 20);
    	localWait.until(ExpectedConditions.visibilityOfElementLocated(messageLink));
    }
    
    //Check if user login successfully
    public boolean isUserLogedIn() {
    	waitForMessageLink();
    	return true;
    }
}
