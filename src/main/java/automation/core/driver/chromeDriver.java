package automation.core.driver;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.core.utils.Utils;

public class chromeDriver implements BrowserInterface {
	
	WebDriver driver;

	public chromeDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Felipe\\eclipse-workspace\\Jframework\\bin\\chrome\\chromedriver.exe");
		ChromeOptions options = setupChromeBrowser();
		WebDriver driver =  new ChromeDriver(options);
		this.driver = driver;
		
		driver.get("http://google.com.br");
		
	}
	
	private ChromeOptions setupChromeBrowser() throws IOException {

		String downloadFolderPath = Utils.binDownloadFolderPath();
		boolean headless = !Utils.getProp("browser.mode.headless").isEmpty();
		System.out.println(headless);

		// Configurando Preferencias de Download
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFolderPath);
		chromePrefs.put("download.prompt_for_download", false);
		chromePrefs.put("download.directory_upgrade", true);

		// Configurando Opcoes de Navegador
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--lang=pt-BR");
		options.addArguments("--incognito");

		if (headless) {
			options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
			options.addArguments("--headless");
			options.addArguments("--window-size=1366,768");
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--ignore-certificate-errors");
		}

		return options;
	}
	

	@Override
	public ChromeDriver getDriver() {
		// TODO Auto-generated method stub
		return (ChromeDriver) this.driver;
	};
	
	
	
	
}
