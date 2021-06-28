package automation.core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {

	
	public static String getProp(String propriedade) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Felipe\\eclipse-workspace\\Jframework\\src\\main\\java\\driverSetup.properties");
		prop.load(file);
		propriedade = prop.getProperty(propriedade);
		return propriedade;
	}
	
	public static String binDownloadFolderPath() throws IOException {
		String prop = getProp("browser.path.root");
		String binOSPath = getProp("browser.path.root");

		CharSequence oldChar = "OS_SYSTEM";
		CharSequence newChar = "windows";

		if (System.getProperty("os.name").toLowerCase().contains("linux")) {
			newChar = "linux";
		}

		return binOSPath.replace(oldChar, newChar) + "downloads";
	}
}
