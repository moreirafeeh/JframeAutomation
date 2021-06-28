package automation.core.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.core.utils.Utils;

public class driverManager {
	
	
	@SuppressWarnings("deprecation")
	public static WebDriver DriverBuilder() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		String browser = Utils.getProp("browser.name");
		String browserClass = Utils.getProp(String.format("browser.option.%s", browser));
		String browseRootFolder = "automation.core.driver.";
		
		
		BrowserInterface driver = null;
		
		Class<?> forName = Class.forName(browseRootFolder + browserClass);
		
		System.out.println(forName);
		driver = (BrowserInterface) forName.newInstance();
		//log.info("Driver criado com sucesso.");
		System.out.println("driver criado com sucesso");
		WebDriver webDriver = driver.getDriver();
		webDriver.manage().window().maximize();
		
		return webDriver;
	}
	
	//Demonstracao
		public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
			DriverBuilder();
		}
			
		
	
}
