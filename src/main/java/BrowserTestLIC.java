import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestLIC {

	public static void main(String[] args) throws InterruptedException {

	   
		// get the project path
		String path = System.getProperty("user.dir");
		System.out.println("Path : " + path);

		// set driver property
		System.setProperty("webdriver.chrome.driver", path + "\\driver\\chrome\\chromedriver.exe");

		// setting up browser
		WebDriver driver = new ChromeDriver();
		
		
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		

		// visit the webpage
		driver.get("https://ebiz.licindia.in/D2CPM/#DirectPay");

		// Mazimize current window
		driver.manage().window().maximize();

		// Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);

		// finding the webelement
		WebElement inputDropdown = driver.findElement(By.xpath("//input[@name=\"directPay\"]"));

		// click on the element
		inputDropdown.click();

		// Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);

		List<WebElement> inputElements = driver.findElements(By.xpath("//li[@role=\"option\"]"));
 	    int count = inputElements.size();
		
		System.out.println("Size " + count);
		
		for (WebElement webElement : inputElements) {
			System.out.println(webElement.getText());
			
			if(webElement.getText().trim().equals("Renewal Premium/ Revival")) {
                webElement.click();
                break;
            }
		}
		
		Thread.sleep(5000);

		// Close the browser
		driver.quit();

	}
}

/*
 * 
 * Types of browser : Driver Name : Set Property value 1. Chrome Driver :
 * ChromeDriver(); : webdriver.chorme.driver 2. Firefox Driver :
 * FirefoxDriver(); : webdriver.gecko.driver 3. Edge Driver : EdgeDriver() :
 * webdriver.edge.verboseLogging 4. Internet Explorer :
 * InternetExplorerDriver(); : webdriver.ie.driver
 * 
 */
