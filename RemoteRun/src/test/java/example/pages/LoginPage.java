package example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import example.Page;
 
public class LoginPage {
 
	private Page page;
	
    //*********Constructor*********
    public LoginPage(Page p) {
        page = p;
    }
 
    //*********Web Elements by using Page Factory*********
    //Other approach but works the same:
    //public WebElement userEmail = driver.findElement(By.id("userEmail"));
    /*
    @FindBy(how = How.ID, using = "userEmail")
    public WebElement emailInput;
    
    @FindBy(how = How.CSS, using = "#userPass")
    public WebElement passwordInput;
 
    @FindBy(how = How.ID, using = "se_userLogin")
    public WebElement loginButton;
 
    @FindBy(how = How.CSS, using = "div.errorbox")
    public WebElement errorMessagePassword;
 */
    public By emailInput = By.id("userEmail");
    public By passwordInput = By.cssSelector("#userPass");
    public By loginButton = By.id("se_userLogin");
    public By errorMessagePassword = By.cssSelector("div.errorbox");
 
    //*********Page Methods*********
    public void login (String email, String password){
        //Enter Username(Email)
        page.typeText(emailInput, email);
        //Enter Password
        page.typeText(passwordInput, password);
        //Click Login Button
        page.click(loginButton);
    }
    
    // Returns error text.
    public String getErrorText() {
    	return page.getText(errorMessagePassword);
    }
}
