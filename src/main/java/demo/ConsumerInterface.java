package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        //Example with Arraylist
        List<String> list = Arrays.asList("Sheldon","Leonard","Penny");
        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = (s) -> System.out.println(s.toUpperCase());
        Consumer<String> consumer3 = (s) -> System.out.println(s.toLowerCase());
        list.forEach(consumer1.andThen(consumer2).andThen(consumer3));

        //Example with amazon website
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.in");
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
//        for(int i = 0; i < elements.size(); i++){
//            System.out.println(elements.get(i).getText());
//        }

        elements.forEach(element -> System.out.println(element.getText()));
        driver.quit();
    }
}
