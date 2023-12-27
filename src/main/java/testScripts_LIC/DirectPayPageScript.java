package testScripts_LIC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClassPackage.BaseClass;
import pageBrowserMethods.DirectPageObject_Methods;
import pageBrowserMethods.PaymentStepsObject_Methods;

public class DirectPayPageScript extends BaseClass {

	// set driver as null for each page
	public static WebDriver driver = null;

	// main method
	public static void main(String[] args) throws InterruptedException {

		driver = setupBrowser(driver);

		// visit the webpage
		driver.get("https://ebiz.licindia.in/D2CPM/#DirectPay");

		// Maximize current window
		driver.manage().window().maximize();

		// Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);

		// calling the object & method from separate page
		DirectPageObject_Methods.selectDropdownDirectPay(driver);

		PaymentStepsObject_Methods.CheckLabel(driver);

		System.out.println("Back to DirectPayPageScript");

		driver.close();

	}

}
