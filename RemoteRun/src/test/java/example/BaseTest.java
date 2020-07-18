package example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import example.utils.RunConfigurations;
import example.utils.WebDriverFactory;

public class BaseTest {
	
	private final static int SECONDSTOWAIT = 5; 
    public WebDriver driver;
    public WebDriverWait wait;
    public Page ui;
	public String baseURL = "https://www.olx.ua/"; // "http://www.leafground.com/pages/disapper.html"; 
    
	@BeforeClass
    public void setup () throws MalformedURLException {
        //Create a Chrome driver. All test classes use this.
        //driver = new ChromeDriver();

		//Run test on standalone server or selenium grid
		//ChromeOptions co = new ChromeOptions();
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), co);
		
		//Creating Web driver with a factory
        driver = WebDriverFactory.GetDriver(RunConfigurations.readProperty("browser"));
		
		driver.manage().timeouts().implicitlyWait(SECONDSTOWAIT, TimeUnit.SECONDS);
        
        //Maximize Window
        driver.manage().window().maximize();
 
        //Instantiate the Page Class
        ui = new Page(driver);
    }
 
    @AfterClass
    public void teardown () {
    	driver.quit();
    }
}