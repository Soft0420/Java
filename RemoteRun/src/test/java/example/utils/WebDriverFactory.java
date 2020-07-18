package example.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import example.BaseTest;

public class WebDriverFactory {

	public static WebDriver GetDriver(String browser) throws MalformedURLException {
		
		boolean remoteRun = RunConfigurations.isRemote().equals("true");
		
		switch (browser.toLowerCase()) {

		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
			return remoteRun ? new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions) : new ChromeDriver(chromeOptions);
		case "firefox":
			FirefoxOptions ffOptions = new FirefoxOptions();
			return new FirefoxDriver(ffOptions);
		case "ie":
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			return new InternetExplorerDriver(ieOptions);
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			return new EdgeDriver(edgeOptions);
		default:
			throw new InvalidArgumentException("Add valid parameters 'Browser'.");

		}

	}
}
