package example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RunConfigurations {

	private static String _browser;
	private static String _remote;

	public static String getBrowser() {
		return _browser == null ? _browser = readProperty("browser") : _browser;
	}
	
	public static String isRemote() {
		return _remote == null ? _remote = readProperty("remote") : _remote;
	}
	
    public static String readProperty(String property) {
        try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty(property);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		throw new IllegalArgumentException("Please specify correct property to get from config.property.");
    }
}
