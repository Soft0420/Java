package example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import example.Page;

public class ButtonsPage {

	private Page page;
	
	// *********Constructor*********
	public ButtonsPage(Page p) {
		page = p;
	}

    @FindBy(how = How.CSS, using = "button#btn") //"#color")
    public WebElement colorButton;

    @FindBy(how = How.CSS, using = "#show.disappear") //"#color")
    public WebElement appearedText;

    
    public void waitToDesapear() {
    	page.wait.until(ExpectedConditions.invisibilityOf(colorButton));
    }
    public String getText() {
    	return appearedText.getText();
    }
}
