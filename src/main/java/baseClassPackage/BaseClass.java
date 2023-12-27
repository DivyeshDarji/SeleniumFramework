package baseClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// set driver as null for each page
	public static WebDriver driver = null;

	public static WebDriver setupBrowser(WebDriver driver) {

		// get the project path
		String path = System.getProperty("user.dir");
		System.out.println("Path : " + path);

		// set driver property
		System.setProperty("webdriver.chrome.driver", path + "\\driver\\chrome\\chromedriver.exe");

		// setting up browser
		driver = new ChromeDriver();

		return driver;
	}

}
