import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testCAWAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// visit the webpage
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");

		// Mazimize current window
		driver.manage().window().maximize();

		// Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);

		// click on summary
		WebElement summary = driver.findElement(By.xpath("//details/summary"));
		summary.click();

		WebElement textarea = driver.findElement(By.xpath("//details/summary/following-sibling::div/p/textarea"));
		textarea.clear();

		Thread.sleep(2000);

		textarea.sendKeys(
				"[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"},{\"name\":\"George\",\"age\":42,\"gender\":\"male\"}]");

		Thread.sleep(2000);

		WebElement refreshtable = driver.findElement(By.xpath("//button[@id='refreshtable']"));
		// refreshtable.click();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("document.getElementById('refreshtable').click()", refreshtable);

		Thread.sleep(15000);

		ArrayList<String> ArrayList1 = new ArrayList<String>();
		ArrayList<String> ArrayList2 = new ArrayList<String>(Arrays.asList("Bob", "20", "male","George","42","male"));

		// verify that input data is present on screen or not
		WebElement table = driver.findElement(By.id("dynamictable"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				String cellText = cell.getText();
				ArrayList1.add(cellText);
				//System.out.println("Array List " + ArrayList1);
				// Store or process the cell text as needed
			}
		}
		System.out.println("Array List: " + ArrayList1);
		System.out.println("Array List Expected: " + ArrayList2);
		
		 // compare ArrayList1 with ArrayList2
        if (ArrayList1.equals(ArrayList2) == true) {
            System.out.println("Array List are equal");
        }
        else
        // else block execute when
        // ArrayList are not equal
        {
            System.out.println("Array List are not equal");
        }
		
		
		/*
		 * String[] expectedData = { "Bob", "20", "male" }; String actualValue = "";
		 */

		/*
		 * int columnIndex = 1; // Specify the column index to validate
		 * 
		 * for (int i = 0; i < rows.size(); i++) { WebElement cell =
		 * rows.get(i).findElements(By.tagName("td")).get(columnIndex); actualValue =
		 * cell.getText(); String expectedValue = expectedData[i];
		 * System.out.println("Actual ValueValue: " + expectedValue); }
		 */

		/*
		 * List<WebElement> rows = table.findElements(By.tagName("tr")); for (int i = 0;
		 * i < rows.size(); i++) { List<WebElement> cells =
		 * rows.get(i).findElements(By.tagName("td")); for (int j = 0; j < cells.size();
		 * j++) { WebElement cell = cells.get(j); actualValue = cell.getText(); //
		 * System.out.println("Value: " + actualValue + " " + actualValue.getClass());
		 * 
		 * if (actualValue.equalsIgnoreCase(expectedData[j])) {
		 * System.out.print("Matched > "); System.out.println("Actual value: " +
		 * actualValue + " AND " + " Expected Value : " + expectedData[j]); } else {
		 * System.out.println("No Match"); }
		 * 
		 * } }
		 */

		// Close the browser
		driver.quit();
	}
}
