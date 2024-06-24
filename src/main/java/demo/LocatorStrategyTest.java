package demo;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorStrategyTest {

    private By hamburger = By.id("nav-hamburger-menu");
    private String menuItem = "//div[text()='%s']/parent::a";

    @Test
    public void locatorStrategyTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        click(driver, hamburger);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        click(driver, "xpath",String.format(menuItem,"Fire TV"));
    }

    public void click(WebDriver driver, By by) {
        driver.findElement(by).click();
    }

    public void click(WebDriver driver, String locator, String value){
        if(locator.equalsIgnoreCase("id")){
            driver.findElement(By.id(value)).click();
        } else if (locator.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(value)).click();
        } else if (locator.equalsIgnoreCase("name")) {
            driver.findElement(By.name(value)).click();
        } else {
            throw new RuntimeException("Locator startegy not found");
        }
    }


}
