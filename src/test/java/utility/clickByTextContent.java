package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class clickByTextContent {
    public void clickElementByText(String searchText) {
        // Use XPath to locate the element by its text
        String xpathExpression = "// *[contains(text(), '" + searchText + "')]";

        // Find the element using the XPath
        WebElement element = driver.findElement(By.xpath(xpathExpression));

        // Get the dynamic X and Y coordinates of the element
        int xCoordinate = element.getLocation().getX();
        int yCoordinate = element.getLocation().getY();

        // Output the coordinates (optional, for demonstration purposes)
        System.out.println("Element with text '" + searchText + "' found at X: " + xCoordinate + ", Y: " + yCoordinate);

        // Click the element
        element.click();
    }
}
