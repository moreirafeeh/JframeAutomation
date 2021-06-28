package automation.core.webBasePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import automation.core.driver.driverManager;


public class webBasePage {
	
	WebDriver driver;
	
	public webBasePage() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		
		this.driver = driverManager.DriverBuilder();
	
	}

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, InterruptedException {
		
		webBasePage pg = new webBasePage();
		pg.pritnScreen("batata");
		TimeUnit.SECONDS.sleep(5);
		pg.driver.quit();
		
	}
	
	public void pritnScreen(String cenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File ("target/screenshot/"+cenario+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
