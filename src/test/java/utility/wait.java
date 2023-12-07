package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class wait {

    public static WebElement forElementToBeDisplayed(String locatorValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
        By locator = By.xpath(locatorValue);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement forElementToBeClickable(String locatorValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
        By locator = By.xpath(locatorValue);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}

