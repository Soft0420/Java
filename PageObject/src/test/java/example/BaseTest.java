package example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import example.utils.WebDriverFactory;
 
public class BaseTest {
	
	private final static int SECONDSTOWAIT = 5; 
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
	public String baseURL;// "http://www.leafground.com/pages/disapper.html"; 
    
	@BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        //driver = new ChromeDriver();
		driver = WebDriverFactory.GetDriver("Chrome");
		
		//Set beseURL
		baseURL = "https://www.olx.ua/"; 

		driver.manage().timeouts().implicitlyWait(SECONDSTOWAIT, TimeUnit.SECONDS);
        
        //Maximize Window
        driver.manage().window().maximize();
 
        //Instantiate the Page Class
        page = new Page(driver);
    }
 
    @AfterClass
    public void teardown () {
    	driver.quit();
    }
}