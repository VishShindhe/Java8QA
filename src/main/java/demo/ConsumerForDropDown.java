package demo;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class ConsumerForDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
//        selectValueFromDropDown(element, "Magenta","text");
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
//        selectValueFromDropDown(element, "1","value");
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
//        selectValueFromDropDown(element, "3","index");
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        selectFromDropDown(e->e.selectByVisibleText("Magenta"),element);
        selectFromDropDown(e->e.selectByValue("1"),element);
        selectFromDropDown(e->e.selectByIndex(3),element);

        List<WebElement> options = new Select(driver.findElement(By.id("cars"))).getOptions();
        options.stream().skip(2).forEach(e->e.click());
        driver.quit();
    }

//    private static void selectValueFromDropDown(WebElement element, String textOrValueOrIndex, String strategy) {
//        Select select = new Select(element);
//        if(strategy.equalsIgnoreCase("text")){
//            select.selectByVisibleText(textOrValueOrIndex);
//        } else if (strategy.equalsIgnoreCase("value")) {
//            select.selectByValue(textOrValueOrIndex);
//        } else if (strategy.equalsIgnoreCase("index")) {
//            select.selectByIndex(Integer.parseInt(textOrValueOrIndex));
//        } else {
//            System.out.println("Invalid strategy");
//        }
//    }
//
    private static void selectFromDropDown(Consumer<Select> consumer, WebElement element) {
        consumer.accept(new Select(element));
    }
}
