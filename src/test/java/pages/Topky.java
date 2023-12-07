package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import utility.wait;


public class Topky extends BrowserDriver {
    public static String Prominenti ="/html/body/div[2]/div[1]/ul/li[5]/a";
    public static String Agree = "/html/body/div[1]/div/div/div/div/div/div[3]/button[3]";

    public static void click_agree_and_assert_url() throws InterruptedException {
        wait.forElementToBeClickable(Agree);
        driver.findElement(By.xpath(Agree)).click();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.topky.sk/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    public static void click_on_Prominenti(){
        String Text_of_Prominenti = driver.findElement(By.xpath(Prominenti)).getText();
        System.out.println(Text_of_Prominenti);

        wait.forElementToBeClickable(Prominenti);
        driver.findElement(By.xpath(Prominenti)).click();
        driver.findElement(By.xpath(Prominenti)).click();
        driver.findElement(By.xpath(Prominenti)).click();
    }

}
