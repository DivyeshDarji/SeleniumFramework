package pageBrowserMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DirectPageObject_Methods {

	// set webelement as null
	private static WebElement dropdown_PayDirect = null;
	private static WebElement btn_proceed;

	// Method for selecting the webelements
	public static WebElement selectDropdownDirectPay(WebDriver driver) throws InterruptedException {

		System.out.println("Start of DirectPageObject_Methods page");

		// looking for
		dropdown_PayDirect = driver.findElement(By.xpath("//input[@id=\"da_combo-1092-inputEl\"]"));

		dropdown_PayDirect.click();

		Thread.sleep(5000);

		List<WebElement> inputElements = driver.findElements(By.xpath("//li[@role=\"option\"]"));
		int count = inputElements.size();

		System.out.println("Size " + count);

		// selecting the renewal option from the dropdown options
		for (WebElement webElement : inputElements) {
			System.out.println(webElement.getText());

			if (webElement.getText().trim().equals("Renewal Premium/ Revival")) {
				webElement.click();
				break;
			}
		}

		Thread.sleep(5000);


		// click on button to proceed for payment page
		btn_proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
		btn_proceed.click();
		
		System.out.println("End of DirectPageObject_Methods Page");

		return dropdown_PayDirect;

	}

}
